package irvine.math.padic;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DivTest extends TestCase {

  public void test0() {
    final PAdic p = PAdic.create(7, 3, 2);
    final PAdic zero = PAdic.create(7);
    assertEquals(zero, Div.divide(zero, p));
    try {
      Div.divide(p, zero);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
  }

  public void testUnitResult() {
    final PAdic p = PAdic.create(7, 123);
    assertEquals("1,0,0,0,0", Div.divide(p, p).toString(4));
  }

  public void test1() {
    final PAdic p = PAdic.create(5, 12);
    final PAdic one = PAdic.create(5, 1);
    assertEquals("3,4,2,4,2", Div.divide(one, p).toString(4));
  }

  public void test2() {
    final PAdic a = PAdic.create(5, 7);
    final PAdic b = PAdic.create(5, 12);
    assertEquals("1,2,0,2,0", Div.divide(a, b).toString(4));
  }
}
