package irvine.math.group;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a019.A019447;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class MultivariatePolynomialRingTest extends TestCase {

  public void test() {
    final MultivariatePolynomialRing ring = new MultivariatePolynomialRing(IntegerField.SINGLETON, 2);
    assertNull(ring.size());
    assertTrue(ring.isAbelian());
    assertTrue(ring.isCommutative());
    assertTrue(ring.isIntegralDomain());
    assertTrue(ring.contains(ring.zero()));
    assertTrue(ring.contains(ring.var(0)));
    assertTrue(ring.contains(ring.var(1)));
    assertFalse(ring.contains(null));
    assertEquals("\\Z[xyz...]", ring.toString());
    assertTrue(ring.zero() == ring.zero());
    assertTrue(ring.one() == ring.one());
    try {
      ring.add(null, ring.one());
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      ring.add(ring.one(), null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      ring.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testToeplitz() {
    // Fairly strong test of adding and multiplying multivariate polynomials
    final Sequence s = new A019447();
    assertEquals(Z.ONE, s.next());
    assertEquals(Z.TWO, s.next());
    assertEquals(Z.FOUR, s.next());
    assertEquals(Z.valueOf(12), s.next());
  }
}
