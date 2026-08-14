package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A398694 allocated for Patrick X. Reymond.
 * @author Sean A. Irvine
 */
public class A398694 extends ParallelPermutationSequence {

  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A398694() {
    super(1, 2, 12);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (p[0] != 0) {
      return false;
    }
    if (pos <= 1) {
      return true;
    }
    // This next condition is the difference from A051252
    final int n = mN / 2;
    if (pos > n && p[pos - 1] + p[pos - n - 1] != mN - 1) {
      return false;
    }
    if (!mPrime.isPrime(Math.abs(p[pos - 1] + p[pos - 2] + 2))) { // +2 since our elements are 0-based
      return false;
    }
    if (pos == p.length && (p[p.length - 1] > p[1] || !mPrime.isPrime(p[p.length - 1] + 2))) { // p[0]==0
      return false;
    }
    return true;
  }
}

