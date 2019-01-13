package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class A029497Test extends TestCase {

  public void testA029497() {
    try {
      A029497.test(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertTrue(A029497.test(1));
    assertTrue(A029497.test(2));
    assertTrue(A029497.test(3));
    assertFalse(A029497.test(4));
    assertTrue(A029497.test(11));
    assertTrue(A029497.test(207));
    assertTrue(A029497.test(1239));
    assertTrue(A029497.test(7947));
    assertTrue(A029497.test(9233));
    assertTrue(A029497.test(49883));
    assertTrue(A029497.test(118669));
    assertTrue(A029497.test(315629));
    assertTrue(A029497.test(2640670));
  }
}
