package irvine.util.io;

import junit.framework.TestCase;

/**
 * Unit Test for class CustomURLStreamHandlerFactory
 *
 * @author Len Trigg
 */
public class CustomURLStreamHandlerFactoryTest extends TestCase {

  public void testGetInstance() {
    assertNotNull(CustomURLStreamHandlerFactory.getInstance());
  }

  public void testCreateURLStreamHandler() {
    final CustomURLStreamHandlerFactory c = new CustomURLStreamHandlerFactory();
    assertNull(c.createURLStreamHandler("java"));
    c.registerHandler("java", irvine.util.io.java.Handler.class);
    assertNotNull(c.createURLStreamHandler("java"));
  }

  public void testRegisterHandler() {
    final CustomURLStreamHandlerFactory c = new CustomURLStreamHandlerFactory();
    try {
      c.registerHandler(null, irvine.util.io.java.Handler.class);
      fail("accepted null protocol");
    } catch (final NullPointerException e) {
      assertEquals("Null protocol", e.getMessage());
    }

    try {
      c.registerHandler("java", null);
      fail("accepted null handler class");
    } catch (final NullPointerException e) {
      assertEquals("Null handlerClass", e.getMessage());
    }
  }
}
