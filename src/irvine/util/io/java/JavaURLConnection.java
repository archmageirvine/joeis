package irvine.util.io.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;

/**
 * Allows reading of java system resources within the standard URL
 * framework. The URL format is:<p>
 *
 * <code>
 * java:resource_name
 * </code>
 *
 * where <code>resource_name</code> is the name of any resource
 * normally reachable by
 * <code>ClassLoader.getResourceAsStream()</code><p>
 *
 * @author Len Trigg
 */
public class JavaURLConnection extends URLConnection {

  private static final String PROTOCOL = "java";

  JavaURLConnection(final URL url) {
    super(url);
  }

  @Override
  public void connect() {
  }

  @Override
  public InputStream getInputStream() throws IOException {
    final String check = url.getProtocol().toLowerCase(Locale.getDefault());
    if (!PROTOCOL.equals(check)) {
      throw new IOException("Incorrect protocol field: " + check);
    }
    String resource = url.getFile();
    if (resource.startsWith("/")) {
      resource = resource.substring(1);
    }
    //System.err.println("RESOURCE: " + resource);
    final InputStream input = getClass().getClassLoader().getResourceAsStream(resource);
    if (input == null) {
      throw new IOException("No system resource with name: " + url + " was found.");
    }
    return input;
  }
}

