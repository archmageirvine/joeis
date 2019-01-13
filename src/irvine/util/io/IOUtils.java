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
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.GZIPInputStream;

import irvine.util.io.java.Handler;

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

  /** The property prefix used to define the set of URL handlers we will try to install. */
  public static final String PROP_HANDLERS = "irvine.util.handler";

  /** The property name for specifying protocol handler package path */
  private static final String URL_HANDLER_PROPERTY = "java.protocol.handler.pkgs";

  /** True once URL handlers have been enabled */
  private static boolean sHandlersEnabled = false;

  /**
   * If true, try to register our handlers via the property method,
   * otherwise via the custom URL stream handler factory.
   * <code>enableURLHandlers</code> depends on this being true initially.
   */
  private static boolean sRegisterViaProperty = true;

  static {
    enableURLHandlers();
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
   * Creates a URL using our customized URL protocol handlers.
   *
   * @param file a <code>File</code>.
   * @return the <code>URL</code>.
   * @exception MalformedURLException if a URL could not be constructed.
   */
  public static URL getURL(final File file) throws MalformedURLException {
    return getURL(file.toURI());
  }


  /**
   * Creates a URL from a String argument that could be either a URL
   * specification or a simple filename. Usually this method is just
   * used from <code>main()</code> for argument handling.
   *
   * @param spec a <code>String</code> specifying either a
   * <code>URL</code> or a filename.
   * @return the <code>URL</code>.
   * @exception MalformedURLException if a URL could not be constructed.
   */
  public static URL getURLFromAny(final String spec) throws MalformedURLException {
    final File maybeFile = new File(spec);
    return (maybeFile.isFile() || maybeFile.isDirectory()) ? getURL(maybeFile) : getURL(spec);
  }


  /**
   * Creates a URL using our customized URL protocol handlers.
   *
   * @param spec a <code>String</code> specifying the
   * <code>URL</code>.
   * @return the <code>URL</code>.
   * @exception MalformedURLException if a URL could not be constructed.
   */
  public static URL getURL(final String spec) throws MalformedURLException {
    return getURL(null, spec);
  }


  /**
   * Creates a URL using our customized URL protocol handlers.
   *
   * @param context a <code>URL</code> used as a context to resolve
   * relative <code>URL</code>s.
   * @param spec a <code>String</code> specifying the
   * <code>URL</code>.
   * @return the <code>URL</code>.
   * @exception MalformedURLException if a URL could not be constructed.
   */
  public static URL getURL(final URL context, final String spec) throws MalformedURLException {
    try {
      return getURL(context, new URI(spec));
    } catch (final URISyntaxException use) {
      throw new MalformedURLException("Malformed URI: " + spec);
    }
  }


  /**
   * Creates a URL using our customized URL protocol handlers.
   *
   * @param uri a <code>URI</code> specifying the <code>URL</code>.
   * @return the <code>URL</code>.
   * @exception MalformedURLException if a URL could not be constructed.
   */
  public static URL getURL(final URI uri) throws MalformedURLException {
    return getURL(null, uri);
  }


  /**
   * Creates a URL using our customized URL protocol handlers.
   *
   * @param context a <code>URL</code> used as a context to resolve
   * relative <code>URL</code>s.
   * @param uri a <code>URI</code> specifying the <code>URL</code>.
   * @return the <code>URL</code>.
   * @exception MalformedURLException if a URL could not be constructed.
   */
  public static URL getURL(final URL context, final URI uri) throws MalformedURLException {
    final String scheme = uri.getScheme();
    final URLStreamHandler handler = CustomURLStreamHandlerFactory.getInstance().createURLStreamHandler(scheme);
    if (handler != null) {
      return new URL(context, uri.toString(), handler);
    } else {
      return new URL(context, uri.toString());
    }
  }

  /**
   * Enable any custom URL handlers we have implemented. This method
   * registers a set of custom URL protocols so they are available to
   * the <code>getURL</code> methods in this class. In addition, it attempts to
   * register the protocols with the JVM built-in URL protocol
   * resolver. This last step is not guaranteed to succeed,
   * particularly when running in a controlled environment, such as a
   * servlet container. In this case, the protocols will not be
   * available for URLs created by other code.
   */
  public static synchronized void enableURLHandlers() {
    if (!sHandlersEnabled) {
      sHandlersEnabled = true;

      // Try to add our java handlers via package
      registerURLHandler(Handler.class);

      try {
        new URL("java:/test/url");
      } catch (final MalformedURLException me) {
        sRegisterViaProperty = false;
        final CustomURLStreamHandlerFactory cf = CustomURLStreamHandlerFactory.getInstance();
        try {
          URL.setURLStreamHandlerFactory(cf);
        } catch (final Throwable t) {
          // That didn't work either
        }
      }
    }
  }


  /**
   * Registers a URL handler class for a URL protocol.
   *
   * @param handlerClassName the name of a URLStreamHandler class. The
   * final package name must be the name of the protocol that the
   * handler will be registered for.
   */
  public static synchronized void registerURLHandler(final String handlerClassName) {
    Class<? extends URLStreamHandler> c = null;
    try {
      c = Class.forName(handlerClassName).asSubclass(URLStreamHandler.class);
    } catch (final Throwable t) {
    }
    if (c != null) {
      registerURLHandler(c);
    }
  }


  /**
   * Registers a URL handler class for a URL protocol.
   *
   * @param handlerClass a URLStreamHandler class. The final package
   * name must be the name of the protocol that the handler will be
   * registered for.
   */
  public static synchronized void registerURLHandler(final Class<? extends URLStreamHandler> handlerClass) {
    enableURLHandlers();
    if (handlerClass == null) {
      throw new NullPointerException();
    }
    final String handlerName = handlerClass.getName();
    if (!handlerName.endsWith("Handler")) {
      throw new IllegalArgumentException("Handler class must be called Handler");
    }

    final String handlerPackage;
    // Used to determine package name through the getPackage() method, but
    // this may fail for a custom class loader; therefore provide an alternative
    // string based method
    int lastDot = handlerName.lastIndexOf('.');
    if (lastDot <= 0) {
      throw new IllegalArgumentException("Problem getting package name.");
    }
    handlerPackage = handlerName.substring(0, lastDot);

    lastDot = handlerPackage.lastIndexOf('.');
    if (lastDot <= 0) {
      throw new IllegalArgumentException("Not enough package name to determine protocol name.");
    }

    final String protocol = handlerPackage.substring(lastDot + 1);
    final String packagePath = handlerPackage.substring(0, lastDot);

    if (sRegisterViaProperty) {
      registerViaProperty(packagePath);
    }
    // Always register with our factory as well, so that getURL
    // methods in this class function.
    registerViaFactory(protocol, handlerClass);
  }


  /**
   * Registers a package as containing URL protocol handlers as
   * subpackages. This method works by editing a system property:
   * java.protocol.handler.pkgs.
   *
   * @param packageName the package name to register.
   */
  private static void registerViaProperty(final String packageName) {
    final Properties p = System.getProperties();
    String s = (String) p.get(URL_HANDLER_PROPERTY);
    if (s == null) {
      s = packageName;
      p.put(URL_HANDLER_PROPERTY, s);
    } else if (!s.contains(packageName)) {
      s = s + "|" + packageName;
      p.put(URL_HANDLER_PROPERTY, s);
    }
  }


  /**
   * Registers a URL protocol handler by adding it to our custom URL
   * stream handler factory.
   *
   * @param protocol the name of the protocol to register.
   * @param handlerClass the handler class to handle the protocol.
   */
  private static void registerViaFactory(final String protocol, final Class<? extends URLStreamHandler> handlerClass) {
    CustomURLStreamHandlerFactory.getInstance().registerHandler(protocol, handlerClass);
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
   * Get an already decompressed input steam.  Works with both compressed
   * and uncompressed files.
   * @param file file name
   * @return decompressed file stream
   * @exception IOException if an I/O error occurs
   */
  @SuppressWarnings("resource")
  public static InputStream decompressedStream(final File file) throws IOException {
    final FileInputStream fis = new FileInputStream(file);
    return file.getName().endsWith(".gz") ? new GZIPInputStream(fis) : fis;
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
