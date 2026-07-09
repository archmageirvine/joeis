package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A397619 Number of permutations p of [n] such that p(i)*p(i+1) + 1 is prime for all 1 &lt;= i &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A397619 extends ParallelPermutationSequence {

  private final Fast mPrime = new Fast();

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos <= 1) {
      return true;
    }
    if ((p[pos - 1] ^ p[pos - 2]) == 0) {
      return false;
    }
    return mPrime.isPrime((long) (p[pos - 1] + 1) * (p[pos - 2] + 1) + 1);
  }
}
