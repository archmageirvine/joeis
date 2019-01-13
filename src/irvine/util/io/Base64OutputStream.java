package irvine.util.io;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Provides a BASE64 encoding output as defined in
 * <a href=doc-files/rfc2045.txt>RFC 2045</a>. Does not attach MIME framing.
 * By default 76 BASE64 characters are output per line, but this can be
 * modified by using the appropriate constructor.  Uses local line breaking
 * conventions.
 *
 * @author Sean A. Irvine
 */
public class Base64OutputStream extends FilterOutputStream {

  /** Default number of columns. */
  public static final int DEFAULT_COLS = 76;

  /** BASE64 alphabet. */
  private static final byte[] BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes(StandardCharsets.US_ASCII);

  /** Low six bits. */
  private static final int LOW_SIX = 0x3F;

  /** Local new line convention */
  private static final byte[] LS = System.lineSeparator().getBytes(StandardCharsets.UTF_8);

  /** Number of columns to generate. */
  private int mCols;
  /** Current column. */
  private int mCurCol = 0;

  /** Intermediate store. */
  private int mBuffer;
  /** Position in above. */
  private int mUsed = 0;

  /**
   * Create an output stream using BASE64 encoding with a given
   * number of characters per line. RFC 2045 suggests that the
   * number of columns should not exceed 76.
   *
   * @param out underlying output stream
   * @param cols number of columns to use
   * @exception IllegalArgumentException if <code>cols &lt; 1</code>
   */
  public Base64OutputStream(final OutputStream out, final int cols) {
    super(out);
    if (cols < 1) {
      throw new IllegalArgumentException("Bad cols.");
    }
    mCols = cols;
  }

  /**
   * Create an output stream using BASE64 encoding.
   *
   * @param out underlying output stream
   */
  public Base64OutputStream(final OutputStream out) {
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

  /** Write a byte and handle any newline requirements. */
  private void doWrite(final int b) throws IOException {
    out.write(b);
    if (++mCurCol == mCols) {
      out.write(LS);
      mCurCol = 0;
    }
  }

  /** Write up to four BASE64 characters. */
  private void writeBuffer() throws IOException {
    switch (mUsed) {
    case 0:
      return;
    case 1:
      doWrite(BASE64[(mBuffer >>> 2) & LOW_SIX]);
      doWrite(BASE64[(mBuffer << 4) & LOW_SIX]);
      doWrite('=');
      doWrite('=');
      break;
    case 2:
      doWrite(BASE64[(mBuffer >>> 10) & LOW_SIX]);
      doWrite(BASE64[(mBuffer >>> 4) & LOW_SIX]);
      doWrite(BASE64[(mBuffer << 2) & LOW_SIX]);
      doWrite('=');
      break;
    default:
      assert mUsed == 3;
      doWrite(BASE64[(mBuffer >>> 18) & LOW_SIX]);
      doWrite(BASE64[(mBuffer >>> 12) & LOW_SIX]);
      doWrite(BASE64[(mBuffer >>> 6) & LOW_SIX]);
      doWrite(BASE64[mBuffer & LOW_SIX]);
      break;
    }
    mUsed = 0;
  }

  @Override
  public void write(final int b) throws IOException {
    valid();
    mBuffer <<= 8;
    mBuffer |= b & 0xFF;
    if (++mUsed == 3) {
      writeBuffer();
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
    writeBuffer();
    out.write(LS);
    out.close();
    out = null;
  }

  /**
   * Convenience method to BASE64 encode raw bytes as a string.
   *
   * @param raw data to encode
   * @param cols number of columns
   * @return BASE64 encoded version of raw bytes
   */
  public static String encode(final byte[] raw, final int cols) {
    try {
      final ByteArrayOutputStream os = new ByteArrayOutputStream();
      try {
        try (final Base64OutputStream bos = new Base64OutputStream(os, cols)) {
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
   * Encode data from standard input using BASE64, sending the result to
   * standard output.
   *
   * @param args ignored
   * @exception IOException if an error occurs
   */
  public static void main(final String[] args) throws IOException {
    try (final Base64OutputStream bos = new Base64OutputStream(System.out)) {
      int b;
      while ((b = System.in.read()) != -1) {
        bos.write(b);
      }
    }
  }
}
