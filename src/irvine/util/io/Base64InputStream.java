package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Provides a BASE64 decoding input stream as defined in
 * <a href=doc-files/rfc2045.txt>RFC 2045</a>. Does not handle MIME framing.
 * Characters outside the BASE64 alphabet are silently ignored.
 *
 * @author Sean A. Irvine
 */
public class Base64InputStream extends FilterInputStream {

  /** BASE64 alphabet. */
  private static final String BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

  /** Buffer of bits read so far. */
  private int mBuffer; // = 0;
  /** Number of valid bits in the buffer. */
  private int mValid = 0;
  /** Is further input possible? */
  private boolean mAvailable = true;

  /**
   * Create an input stream using BASE64.
   *
   * @param in underlying input stream
   */
  public Base64InputStream(final InputStream in) {
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

  @Override
  public final int read() throws IOException {
    valid();
    while (mValid < 8) {
      final int r = in.read();
      if (r == -1 || r == '=') {
        mAvailable = false;
        return -1;
      }
      final int v = BASE64.indexOf(r);
      if (v != -1) {
        assert v <= 64;
        mValid += 6;
        mBuffer <<= 6;
        mBuffer += v;
      }
      // TODO warnings for invalids
    }
    mValid -= 8;
    return (mBuffer >>> mValid) & 0xFF;
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
   * Returns 0 if no bytes can be immediately read; otherwise returns 1.
   * After end-of-stream will always return 0.
   *
   * @return 1 if bytes can be read.
   * @exception IOException if an I/O error occurs
   */
  @Override
  public final int available() throws IOException {
    valid();
    // cannot simply return value from in because base64 expands data
    return mAvailable && in.available() > 0 ? 1 : 0;
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
   * Convenience method to decode a BASE64 string into bytes.  Not
   * necessarily efficient.
   *
   * @param base64 data to decode
   * @return decoded data
   */
  public static byte[] decode(final String base64) {
    try {
      final byte[] b = base64.getBytes(StandardCharsets.US_ASCII);
      // decoded data will be smaller than original
      final byte[] res = new byte[b.length];
      try (ByteArrayInputStream is = new ByteArrayInputStream(b)) {
        try (final Base64InputStream bis = new Base64InputStream(is)) {
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
      // this should not happen
      throw new RuntimeException(e);
    }
  }

  /**
   * Decode BASE64 encoded data appearing on standard input, sending the result
   * to standard output.
   *
   * @param args ignored
   * @exception IOException if an error occurs
   */
  public static void main(final String[] args) throws IOException {
    try (final Base64InputStream bis = new Base64InputStream(System.in)) {
      int b;
      while ((b = bis.read()) != -1) {
        System.out.write(b);
      }
    }
    System.out.flush();
  }
}
