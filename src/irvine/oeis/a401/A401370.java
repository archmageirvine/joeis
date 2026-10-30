package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401370 allocated for Iurii Kirpichev.
 * @author Sean A. Irvine
 */
public class A401370 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private long mN = 0;

  @Override
  public Z next() {
    return RING.eval(CyclotomicPolynomials.cyclotomic(++mN), Functions.FIBONACCI.z(mN));
  }
}

