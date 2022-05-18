package irvine.util.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/**
 * Various convenience methods related to I/O.
 *
 * @author Sean A. Irvine
 */
public final class IOUtils {

  private IOUtils() { }

  /** Length of buffer to use during reading */
  private static final int BUFFER_LENGTH = 16384;

  private static final int EOF = -1;

  /**
   * Reads all the data from the supplied URL into a byte array.
   *
   * @param url the URL
   * @return a byte array containing the stream data.
   * @exception IOException if an error occurs during I/O.
   * @exception NullPointerException if <code>url</code> is null.
   */
  public static byte[] readData(final URL url) throws IOException {
    try (final InputStream input = url.openStream()) {
      return readData(input);
    }
  }


  /**
   * Reads all the data from the supplied file into a byte array.
   *
   * @param file the file
   * @return a byte array containing the stream data.
   * @exception IOException if an error occurs during I/O.
   * @exception NullPointerException if <code>file</code> is null.
   */
  public static byte[] readData(final File file) throws IOException {
    try (final BufferedInputStream is = new BufferedInputStream(new FileInputStream(file))) {
      return readData(is);
    }
  }


  /**
   * Reads all the data from the supplied InputStream into a byte array.
   *
   * @param input the InputStream
   * @return a byte array containing the stream data.
   * @exception IOException if an error occurs during I/O.
   * @exception NullPointerException if <code>input</code> is null.
   */
  public static byte[] readData(final InputStream input) throws IOException {
    final byte[] inputBuffer = new byte[BUFFER_LENGTH];
    try (final ByteArrayOutputStream byteOutput = new ByteArrayOutputStream(BUFFER_LENGTH)) {
      int bytesRead;
      while ((bytesRead = input.read(inputBuffer)) != -1) {
        byteOutput.write(inputBuffer, 0, bytesRead);
      }
      return byteOutput.toByteArray();
    }
  }


  /**
   * Read all of a URL into a String.
   *
   * @param url the URL to read.
   * @return a String containing the contents of the URL
   * @exception IOException If there is a problem during reading.
   * @exception NullPointerException if <code>url</code> is null.
   */
  public static String readAll(final URL url) throws IOException {
    try (final InputStream input = url.openStream()) {
      return readAll(input);
    }
  }

  /**
   * Read all of a file into a String.
   *
   * @param file the file to read.
   * @return a String containing the contents of the URL
   * @exception IOException If there is a problem during reading.
   * @exception NullPointerException if <code>url</code> is null.
   */
  public static String readAll(final File file) throws IOException {
    try (final FileInputStream input = new FileInputStream(file)) {
      return readAll(input);
    }
  }

  /**
   * Read all of an input stream into a String.
   *
   * @param input input stream being read.
   * @return a String containing the contents of the input stream.
   * @exception IOException If there is a problem during reading.
   * @exception NullPointerException if <code>input</code> is null.
   */
  public static String readAll(final InputStream input) throws IOException {
    return readAll(new InputStreamReader(input));
  }

  /**
   * Read all of a Reader into a String.
   *
   * @param input Reader being read.
   * @return a String containing the contents of the input stream.
   * @exception IOException If there is a problem during reading.
   * @exception NullPointerException if <code>input</code> is null.
   */
  public static String readAll(final Reader input) throws IOException {
    final char[] b = new char[BUFFER_LENGTH];
    final StringWriter str = new StringWriter(BUFFER_LENGTH);
    try {
      while (true) {
        final int length = input.read(b);
        if (length == EOF) {
          break;
        } else if (length == 0) {
          throw new IOException("Read was 0 bytes");
        } else {
          str.write(b, 0, length);
        }
      }
    } finally {
      str.close();
    }
    return str.toString();
  }

  /**
   * Performs URL decoding. Do this if your URL contains plenty of
   * percent characters :-).
   *
   * @param url the string to decode.
   * @return the decoded string.
   */
  public static String decodeUTF8(final String url) {
    try {
      return URLDecoder.decode(url, StandardCharsets.UTF_8.name());
    } catch (final UnsupportedEncodingException uee) {
      throw new RuntimeException(uee);
    }
  }

  /**
   * Performs URL encoding. Do this if your URL contains illegal
   * characters that need to be escaped. This method uses UTF-8
   * encoding.
   *
   * @param url the string to encode.
   * @return the encoded string.
   */
  public static String encodeUTF8(final String url) {
    try {
      return URLEncoder.encode(url, StandardCharsets.UTF_8.name());
    } catch (final UnsupportedEncodingException uee) {
      throw new RuntimeException(uee);
    }
  }


  /**
   * A method which writes a diagnostic on standard error if a delete
   * operation fails.  This should only be used when the delete is not
   * critical to correct operation.
   *
   * @param d file to delete
   */
  public static void delete(final File d) {
    if (d != null && !d.delete()) {
      System.err.println("Failed to delete: " + d.getPath());
    }
  }

  /**
   * Get the extension of a file.
   * @param file file to get extension of
   * @return extension (or empty string if it has none)
   */
  public static String getExtension(final File file) {
    if (file == null) {
      return null;
    }
    final String name = file.getName();
    final int lastDot = name.lastIndexOf('.');
    return lastDot == -1 ? "" : name.substring(lastDot + 1).toLowerCase(Locale.getDefault());
  }

  /**
   * Return a reader of a resource.
   * @param resource the resource to read
   * @return reader for resource
   * @throws IOException if an I/O error occurs.
   */
  public static BufferedReader reader(final String resource) throws IOException {
    final InputStream is = IOUtils.class.getClassLoader().getResourceAsStream(resource);
    return new BufferedReader(new InputStreamReader(resource.endsWith(".gz") ? new GZIPInputStream(is) : is));
  }

  /**
   * Deletes the given <code>file</code>. If <code>file</code> is a directory then
   * that directory and its contents are all deleted.
   * @param file a file/directory to delete
   * @return true if operation entirely successful
   */
  public static boolean deleteAll(final File file) {
    boolean ok = true;
    if (file != null) {
      if (file.isDirectory()) {
        final File[] files = file.listFiles();
        if (files != null) {
          for (final File x : files) {
            ok &= deleteAll(x);
          }
        }
      }
      ok &= !file.exists() || file.delete();
    }
    return ok;
  }

  /**
   * Test for the presence of non-ASCII bytes in an input stream.  If all the
   * bytes are ASCII then -1 is returned, otherwise the first non-ASCII value.
   * @param is stream
   * @return -1 or first non-ASCII value
   * @throws IOException if an I/O error occurs.
   */
  public static int isNonAscii(final InputStream is) throws IOException {
    int c;
    while ((c = is.read()) != -1) {
      if ((c < ' ' || c > '~') && c != '\n') {
        return c;
      }
    }
    return -1;
  }

  /**
   * Write an integer in little-endian order (opposite of <code>DataOutputStream</code>).
   * @param out stream
   * @param value value to write
   * @exception java.io.IOException if an I/O error occurs
   */
  public static void writeInt(final OutputStream out, final int value) throws IOException {
    out.write(value & 0xFF);
    out.write((value >>> 8) & 0xFF);
    out.write((value >>> 16) & 0xFF);
    out.write((value >>> 24) & 0xFF);
  }

  /**
   * Write a long in little-endian order (opposite of <code>DataOutputStream</code>).
   * @param out stream
   * @param value value to write
   * @exception java.io.IOException if an I/O error occurs
   */
  public static void writeLong(final OutputStream out, final long value) throws IOException {
    writeInt(out, (int) value);
    writeInt(out, (int) (value >>> 32));
  }
}
