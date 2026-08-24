package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A397413 a(n) is the number of circular arrangements of 1, 2, ..., 2n such that every pair of adjacent numbers sums to a prime and every pair of antipodal (diametrically opposite) numbers differs by n, up to rotations and reflections.
 * @author Sean A. Irvine
 */
public class A397413 extends ParallelPermutationSequence {

  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A397413() {
    super(1, 2, 2);
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
    if (pos > n && Math.abs(p[pos - 1] - p[pos - n - 1]) != n) {
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

