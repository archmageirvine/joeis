package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402378 Number of permutations of {1..n} such that all primes are in nonprime positions.
 * @author Sean A. Irvine
 */
public class A402378 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long pi = Functions.PRIME_PI.l(++mN);
    return mN >= 2 * pi ? Functions.FACTORIAL.z(mN - pi).square().divide(Functions.FACTORIAL.z(mN - 2 * pi)) : Z.ZERO;
  }
}

