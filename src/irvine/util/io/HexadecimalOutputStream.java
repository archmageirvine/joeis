package irvine.util.io;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Stream for writing bytes in hexadecimal.  Lowercase `a' through `f'
 * are used.
 *
 * @author Sean A. Irvine
 */
public class HexadecimalOutputStream extends FilterOutputStream {

  /** Default number of columns. */
  public static final int DEFAULT_COLS = 80;

  /** Local new line convention */
  private static final byte[] LS = System.lineSeparator().getBytes(StandardCharsets.UTF_8);

  /** Hexadecimal alphabet. */
  private static final byte[] HEXITS = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);

  /** Number of columns to generate. */
  private int mCols;
  /** Current column. */
  private int mCurCol = 0;

  /**
   * Create a hexadecimal output stream with a given
   * number of characters per line.
   *
   * @param out underlying output stream
   * @param cols number of columns to use
   * @exception IllegalArgumentException if <code>cols &lt; 1</code>
   */
  public HexadecimalOutputStream(final OutputStream out, final int cols) {
    super(out);
    if (cols < 1) {
      throw new IllegalArgumentException("Bad cols.");
    }
    mCols = cols;
  }

  /**
   * Create a hexadecimal output stream.
   *
   * @param out underlying output stream
   */
  public HexadecimalOutputStream(final OutputStream out) {
    this(out, DEFAULT_COLS);
  }

  /**
   * Used to check validity of stream before writes etc.
   *
   * @exception IOException if stream is actually closed
   */
  private void valid() throws IOException {
    if (out == null) {
      throw new IOException("Stream closed");
    }
  }

  @Override
  public void write(int b) throws IOException {
    valid();
    b &= 0xFF;
    out.write(HEXITS[b >> 4]);
    if (++mCurCol == mCols) {
      out.write(LS);
      mCurCol = 0;
    }
    out.write(HEXITS[b & 0xF]);
    if (++mCurCol == mCols) {
      out.write(LS);
      mCurCol = 0;
    }
  }

  @Override
  public void write(final byte[] b, final int offset, final int length) throws IOException {
    for (int i = 0; i < length; ++i) {
      write(b[i + offset]);
    }
  }

  @Override
  public void close() throws IOException {
    if (out == null) {
      return;
    }
    out.write(LS);
    out.close();
    out = null;
  }

  /**
   * Convenience method to hexadecimal encode raw bytes as a string.
   *
   * @param raw data to encode
   * @param cols number of columns
   * @return hexadecimal string
   */
  public static String encode(final byte[] raw, final int cols) {
    try {
      final ByteArrayOutputStream os = new ByteArrayOutputStream();
      try {
        try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(os, cols)) {
          bos.write(raw);
        }
      } finally {
          os.close();
      }
      return os.toString();
    } catch (final IOException e) {
      // this should not happen
      throw new RuntimeException(e);
    }
  }

  /**
   * Encode data from standard input using hexadecimal, sending the result to
   * standard output.
   *
   * @param args ignored
   * @exception IOException if an error occurs
   */
  public static void main(final String[] args) throws IOException {
    try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(System.out)) {
      int b;
      while ((b = System.in.read()) != -1) {
        bos.write(b);
      }
    }
  }
}
