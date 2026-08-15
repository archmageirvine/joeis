package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A398356 allocated for Andre Ruiz Loera.
 * @author Sean A. Irvine
 */
public class A398356 extends ParallelPermutationSequence {

  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A398356() {
    super(0, 0, 2);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (p.length == 0) {
      return false;
    }
    if (p[0] != 0) {
      return false;
    }
    if (pos <= 1) {
      return true;
    }
    if (!mPrime.isPrime((p[pos - 1] + 1) * (p[pos - 2] + 1) + 1)) {
      return false;
    }
    if (pos == p.length && (p[p.length - 1] > p[1] || !mPrime.isPrime((p[pos - 1] + 1) * (p[0] + 1) + 1))) {
      return false;
    }
    return true;
  }
}
