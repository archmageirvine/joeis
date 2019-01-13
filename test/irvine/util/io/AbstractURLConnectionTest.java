package irvine.util.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

import junit.framework.TestCase;

/**
 * Unit Test for class Handler.
 *
 * @author Richard Allen
 */
public abstract class AbstractURLConnectionTest extends TestCase {

  /** Returns opens a connection to a URL */
  protected abstract URLConnection openConnection(final String url) throws IOException;

  /** Returns an array of String URLs that are valid (i.e.: data can be read from them) */
  protected abstract String[] getValidURLs();

  /** Returns an array of String URLs that are invalid (i.e.: data cannot be read from them) */
  protected abstract String[] getInvalidURLs();

  /**
   * Tests that the appropriate protocols and URL syntaxes are
   * accepted.
   */
  public void testGetInputStream() throws IOException {
    String[] urls = getValidURLs();
    assertNotNull(urls);
    for (final String url : urls) {
      final URLConnection conn = openConnection(url);
      assertNotNull(conn);
      try (InputStream is = conn.getInputStream()) {
        assertNotNull(is);
      }
    }

    urls = getInvalidURLs();
    assertNotNull(urls);
    for (final String url : urls) {
      try {
        final URLConnection conn = openConnection(url);
        conn.getInputStream().close();
        fail("Allowed getting input stream from invalid url: " + url);
      } catch (final IOException ioe) {
        assertTrue(ioe.getMessage().startsWith("Incorrect protocol field:"));
      }
    }
  }

}
