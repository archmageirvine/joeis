package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class A061937Test extends TestCase {

  public void testA061937() {
    try {
      A061937.test(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertTrue(A061937.test(1));
    assertTrue(A061937.test(2));
    assertFalse(A061937.test(3));
    assertTrue(A061937.test(4));
    assertTrue(A061937.test(6));
    assertTrue(A061937.test(7));
    assertTrue(A061937.test(18));
    assertTrue(A061937.test(21));
    assertTrue(A061937.test(35));
    assertTrue(A061937.test(63));
    assertTrue(A061937.test(105));
    assertTrue(A061937.test(111));
    assertTrue(A061937.test(159));
    assertTrue(A061937.test(217));
    assertTrue(A061937.test(1183));
    assertTrue(A061937.test(1330));
    assertTrue(A061937.test(1353));
    assertTrue(A061937.test(1449));
    assertTrue(A061937.test(2023));
    assertTrue(A061937.test(7223));
    assertTrue(A061937.test(8707));
    assertTrue(A061937.test(10787));
    assertTrue(A061937.test(13881));
    assertTrue(A061937.test(58135));
    assertTrue(A061937.test(1126478));
    assertTrue(A061937.test(1135315));
    assertTrue(A061937.test(1141795));
    assertTrue(A061937.test(1938643));
  }
}
