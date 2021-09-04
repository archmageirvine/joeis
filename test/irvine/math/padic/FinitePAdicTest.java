package irvine.math.padic;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FinitePAdicTest extends TestCase {

  public void test() {
    final PAdic p = new FinitePAdic(5, 1, 2, 3);
    assertEquals(5, p.p());
    assertEquals("1,2,3,0,0,0", p.toString(5));
  }

  public void testBadConstructor() {
    try {
      new FinitePAdic(3, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      new FinitePAdic(11, 0, 2, 3, 12);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }
}
