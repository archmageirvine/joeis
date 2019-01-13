package irvine.util.io.java;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/**
 * Allows reading of java system resources within the standard URL
 * framework.
 *
 * @author Len Trigg
 */
public class Handler extends URLStreamHandler {

  @Override
  protected URLConnection openConnection(final URL u) {
    return new JavaURLConnection(u);
  }
}

