package irvine.oeis.a398;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398557 allocated for Iurii Kirpichev.
 * @author Sean A. Irvine
 */
public class A398557 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private long mN = 0;

  @Override
  public Z next() {
    return RING.eval(RING.diff(RING.diff(CyclotomicPolynomials.cyclotomic(++mN))), Z.ONE);
  }
}

