package irvine.util.io.java;

import irvine.util.io.AbstractURLConnectionTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Unit Test for class JavaURLConnection
 *
 * @author Len Trigg
 */
public class JavaURLConnectionTest extends AbstractURLConnectionTest {

  @Override
  protected URLConnection openConnection(final String url) throws IOException {
    final Handler h = new Handler();
    return h.openConnection(new URL(null, url, h));
  }

  @Override
  protected String[] getInvalidURLs() {
    return new String[] {
      "boingo:irvine/util/ion/java/JavaURLConnectionTest.class",
      "zip:java:/com/reeltwo/contentTestFiles/example.zip!/-",  // Not a file: suburl
    };
  }

  @Override
  protected String[] getValidURLs() {
    return new String[] {
      "java:irvine/util/io/java/JavaURLConnectionTest.class",
      "java:/irvine/util/io/java/JavaURLConnectionTest.class",
    };
  }

  public void testDeep() throws IOException {
    final URLConnection c = openConnection("java:/irvine/JavaURLConnectionTest.class");
    try {
      c.getInputStream();
    } catch (final IOException e) {
      assertEquals("No system resource with name: java:/irvine/JavaURLConnectionTest.class was found.", e.getMessage());
    }
  }

  public void testDeepValid() throws IOException {
    final URLConnection c = openConnection("java:/irvine/util/AllTests.class");
    final InputStream i = c.getInputStream();
    assertNotNull(i);
    try {
      assertEquals(202, i.read());
    } finally {
      i.close();
    }
  }

}
