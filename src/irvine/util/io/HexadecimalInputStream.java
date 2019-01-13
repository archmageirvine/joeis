package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Provides a hexadecimal decoding input stream.  Any whitespace
 * is silently ignored.
 *
 * @author Sean A. Irvine
 */
public class HexadecimalInputStream extends FilterInputStream {

  /**
   * Create an input stream using hexadecimal.
   *
   * @param in underlying input stream
   */
  public HexadecimalInputStream(final InputStream in) {
    super(in);
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

  /** Decode a hexadecimal character, -1 for an error. */
  private int decode(final int c) {
    switch (c) {
    case '0':
    case '1':
    case '2':
    case '3':
    case '4':
    case '5':
    case '6':
    case '7':
    case '8':
    case '9':
      return c - '0';
    case 'A':
    case 'B':
    case 'C':
    case 'D':
    case 'E':
    case 'F':
      return c - 'A' + 10;
    case 'a':
    case 'b':
    case 'c':
    case 'd':
    case 'e':
    case 'f':
      return c - 'a' + 10;
    default:
      return -1;
    }
  }

  @Override
  public final int read() throws IOException {
    valid();
    int v;
    while ((v = in.read()) != -1) {
      if (Character.isWhitespace(v)) {
        continue;
      }
      final int r = decode(v);
      if (r == -1) {
        throw new IOException("Bad character: " + (char) v);
      }
      int u;
      while (Character.isWhitespace(u = in.read())) {
        // DO NOTHING
      }
      if (u == -1) {
        throw new IOException("Last doublet ended after one symbol.");
      }
      final int s = decode(u);
      if (s == -1) {
        throw new IOException("Bad character: " + (char) u);
      }
      return (r << 4) + s;
    }
    return -1;
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
   * blocking.  The actual number may be less than this due to the
   * presence of whitespace in the underlying stream.
   *
   * @return available bytes estimate
   * @exception IOException if an I/O error occurs
   */
  @Override
  public final int available() throws IOException {
    valid();
    return in.available() / 2;
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
   * Convenience method to decode a hexadecimal string into bytes.  Not
   * necessarily efficient.
   *
   * @param hexadecimal data to decode
   * @return decoded data
   * @exception IllegalArgumentException if the input has an odd number of
   * hexadecimal digits.
   */
  public static byte[] decode(final String hexadecimal) {
    try {
      final byte[] b = hexadecimal.getBytes(StandardCharsets.US_ASCII);
      // decoded data will be smaller than original
      final byte[] res = new byte[b.length];
      try (ByteArrayInputStream is = new ByteArrayInputStream(b)) {
        try (final HexadecimalInputStream bis = new HexadecimalInputStream(is)) {
          int c, i = 0;
          while ((c = bis.read()) != -1) {
            res[i++] = (byte) c;
          }
          final byte[] r = new byte[i];
          System.arraycopy(res, 0, r, 0, i);
          return r;
        }
      }
    } catch (final IOException e) {
      throw new IllegalArgumentException(e);
    }
  }

  /**
   * Decode hexadecimal encoded data appearing on standard input, sending the result
   * to standard output.
   *
   * @param args ignored
   * @exception IOException if an error occurs
   */
  public static void main(final String[] args) throws IOException {
    try (final HexadecimalInputStream bis = new HexadecimalInputStream(System.in)) {
      int b;
      while ((b = bis.read()) != -1) {
        System.out.write(b);
      }
    }
    System.out.flush();
  }
}
