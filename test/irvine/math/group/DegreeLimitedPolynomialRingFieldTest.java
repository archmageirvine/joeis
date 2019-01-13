package irvine.math.group;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class DegreeLimitedPolynomialRingFieldTest extends TestCase {

  public void test() {
    final DegreeLimitedPolynomialRingField<Z> ring = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, 1);
    assertNull(ring.size());
    assertTrue(ring.isAbelian());
    assertTrue(ring.contains(ring.zero()));
    assertTrue(ring.contains(ring.x()));
    assertFalse(ring.contains(null));
    final Polynomial<Z> onePlusX = Polynomial.create(1, 1);
    final Polynomial<Z> ans = Polynomial.create(1, 2);
    assertEquals(ans, ring.multiply(onePlusX, onePlusX));
    assertEquals(ans, ring.pow(onePlusX, 2));
    try {
      ring.pow(onePlusX, 2147483648L);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

}
