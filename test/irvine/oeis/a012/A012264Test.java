package irvine.oeis.a012;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A012264Test extends AbstractSequenceTest {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  public void testSturm1() {
    final Polynomial<Q> f = RING.create(Arrays.asList(Q.TWO, new Q(-10), new Q(-20), Q.ZERO, new Q(5), Q.ONE));
    assertEquals("[2-10x-20x^2+5x^4+x^5, -10-40x+20x^3+5x^4, -4+12x^2+4x^3, 5+35x+15x^2, 44/9+68/9x, 3285/289]", A012264.sturmList(f).toString());
  }

  public void testSturm2() {
    final Polynomial<Q> f = RING.create(Arrays.asList(Q.NEG_ONE, Q.NEG_ONE, Q.ZERO, Q.ONE, Q.ONE));
    assertEquals("[-1-x+x^3+x^4, -1+3x^2+4x^3, 15/16+3/4x+3/16x^2, -64-32x, -3/16]", A012264.sturmList(f).toString());
  }

}
