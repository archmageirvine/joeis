package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class A061933Test extends TestCase {

  //1, 2, 3, 9, 15, 21, 162, 495, 614, 813, 174913, 240389
  public void testA061933() {
    try {
      A061933.test(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertTrue(A061933.test(1));
    assertTrue(A061933.test(2));
    assertTrue(A061933.test(3));
    assertFalse(A061933.test(4));
    assertTrue(A061933.test(9));
    assertTrue(A061933.test(15));
    assertTrue(A061933.test(21));
    assertTrue(A061933.test(162));
    assertTrue(A061933.test(495));
    assertTrue(A061933.test(614));
    assertTrue(A061933.test(813));
    assertTrue(A061933.test(174913));
    assertTrue(A061933.test(240389));
    assertTrue(A061933.test(704162));
  }
}
