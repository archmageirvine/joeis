package irvine.math.polynomial;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PolynomialTest extends TestCase {

  public void testShiftZero() {
    final Polynomial<Z> zero = Polynomial.create(0);
    assertEquals(zero.toString(), zero.shift(0).toString());
    assertEquals(zero.toString(), zero.shift(1).toString());
    assertEquals(zero.toString(), zero.shift(2).toString());
  }

  public void testShiftNegative() {
    assertEquals("2x", Polynomial.create(Z.THREE, Z.ZERO, Z.TWO).shift(-1).toString());
  }
}
