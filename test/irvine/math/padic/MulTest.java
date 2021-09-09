package irvine.math.padic;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MulTest extends TestCase {

  public void test0() {
    final PAdic p = PAdic.create(7, 3, 2);
    final PAdic zero = PAdic.create(7);
    assertEquals(zero, Mul.multiply(p, zero));
    assertEquals(zero, Mul.multiply(zero, p));
  }

  public void test1() {
    final PAdic p = PAdic.create(7, 3, 2);
    final PAdic one = PAdic.create(7, 1);
    assertEquals("3,2,0,0,0", Mul.multiply(p, one).toString(4));
  }

  public void testSquare() {
    final PAdic p = PAdic.create(7, 123);
    assertEquals("2,5,0,2,6", Mul.multiply(p, p).toString(4));
  }
}
