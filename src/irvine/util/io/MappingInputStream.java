package irvine.util.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Provides an input stream with arbitrary byte remapping and optional
 * space compression.
 *
 * @author Sean A. Irvine
 */
public class MappingInputStream extends FilterInputStream {

  private static final byte[] REDUCED_ENGLISH;
  static {
    REDUCED_ENGLISH = new byte[256];
    Arrays.fill(REDUCED_ENGLISH, (byte) 0x20);
    for (int i = 'A'; i <= 'Z'; ++i) {
      REDUCED_ENGLISH[i] = (byte) (i - 'A' + 'a');
    }
    for (int i = 'a'; i <= 'z'; ++i) {
      REDUCED_ENGLISH[i] = (byte) i;
    }
    for (int i = '0'; i <= '9'; ++i) {
      REDUCED_ENGLISH[i] = (byte) i;
    }
  }

  /**
   * Return a map that maps to lowercase and retains only numbers and letters;
   * converting all other characters to spaces.
   *
   * @return a map
   */
  public static byte[] reducedEnglishMap() {
    final byte[] copy = new byte[REDUCED_ENGLISH.length];
    System.arraycopy(REDUCED_ENGLISH, 0, copy, 0, REDUCED_ENGLISH.length);
    return copy;
  }

  /** The map. */
  private byte[] mMap;
  /** Space compression. */
  private final boolean mCompressSpace;
  /** Last byte output. */
  private int mLast;

  /**
   * Create an input stream with the given mapping and space treatment.
   * The supplied map describes how each of the 256 possibles bytes should
   * be transformed.  If <code>compressSpace</code> is true, then
   * multiple consecutive space is compressed to a single space.  This
   * compression is applied after the mapping.
   *
   * @param in underlying input stream
   * @param map byte mapping
   * @param compressSpace true if multiple space symbols should
   * be compressed.
   * @exception IllegalArgumentException if the length of the map is not 256.
   * @exception NullPointerException if <code>map</code> is null.
   */
  public MappingInputStream(final InputStream in, final byte[] map, final boolean compressSpace) {
    super(in);
    mCompressSpace = compressSpace;
    if (map.length != 256) {
      throw new IllegalArgumentException("Map not 256 entries long.");
    }
    mMap = new byte[map.length];
    System.arraycopy(map, 0, mMap, 0, map.length);
  }

  /**
   * Used to check validity of stream before reads etc.
   *
   * @exception IOException if stream is actually closed
   */
  private void valid() throws IOException {
    if (in == null) {
      throw new IOException("Stream closed");
    }
  }

  @Override
  public final int read() throws IOException {
    valid();
    int d;
    do {
      final int c = super.read();
      if (c == -1) {
        return -1;
      }
      d = mMap[c] & 0xFF;
    } while (mCompressSpace && mLast == 0x20 && d == 0x20);
    mLast = d;
    return d;
  }

  @Override
  public final int read(final byte[] b, final int offset, final int length) throws IOException {
    for (int i = 0; i < length; ++i) {
      final int r = read();
      if (r == -1) {
        return i == 0 ? -1 : i;
      }
      b[i + offset] = (byte) r;
    }
    return length;
  }

  @Override
  public final long skip(final long n) throws IOException {
    valid();
    if (n <= 0) {
      return 0;
    }
    for (long i = 0; i < n; ++i) {
      if (read() == -1) {
        return i;
      }
    }
    return n;
  }

  /**
   * Return an estimate of the number of bytes that can be read without
   * blocking.  The actual number may be less than this if space
   * compression is turned on.
   *
   * @return available bytes estimate
   * @exception IOException if an I/O error occurs
   */
  @Override
  public final int available() throws IOException {
    valid();
    return in.available();
  }

  /**
   * Marking is not supported.
   *
   * @return false
   */
  @Override
  public final boolean markSupported() {
    return false;
  }

  @Override
  public void close() throws IOException {
    if (in == null) {
      return;
    }
    in.close();
    in = null;
  }

  /**
   * Convert to reduced English with space compression.
   *
   * @param args ignored
   * @exception IOException if an error occurs
   */
  public static void main(final String[] args) throws IOException {
    try (final MappingInputStream bis = new MappingInputStream(System.in, reducedEnglishMap(), true)) {
      int b;
      while ((b = bis.read()) != -1) {
        System.out.write(b);
      }
    }
    System.out.flush();
  }
}
