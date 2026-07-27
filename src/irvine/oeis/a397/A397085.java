package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397085 a(n) = (-1)^(n-floor(sqrt(n))^2-1) if n is not a perfect square and 0 otherwise.
 * @author Sean A. Irvine
 */
public class A397085 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Predicates.SQUARE.is(++mN) ? Z.ZERO : Z.NEG_ONE.pow(mN - Functions.SQRT.l(mN) * Functions.SQRT.l(mN) - 1);
  }
}

