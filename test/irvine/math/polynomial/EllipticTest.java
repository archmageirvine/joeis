package irvine.math.polynomial;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EllipticTest extends TestCase {

  public void testK() {
    final PolynomialRingField<Q> ring = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1+1/4x^2+9/64x^4+25/256x^6+1225/16384x^8+3969/65536x^10", Elliptic.ellipticK(ring.x(), 10).toString());
  }
}
