package irvine.util.io.java;

import java.net.URL;

import junit.framework.TestCase;

/**
 * Unit test for class Handler.
 *
 * @author Len Trigg
 */
public class HandlerTest extends TestCase {

  /**
   * Tests that the type of connection returned by <code>openConnection</code> is
   * of the right class.
   */
  public void testOpenConnection() throws Exception {
    final Handler h = new Handler();
    assertNotNull(h.openConnection(new URL(null, "dummy:", h)));
  }
}
