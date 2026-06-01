package irvine.oeis.a396;

import irvine.factor.util.FactorUtils;
import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A396381 Bi-unitary half-Zumkeller numbers: numbers whose set of bi-unitary proper divisors can be partitioned into two disjoint subsets of equal sum.
 * @author Sean A. Irvine
 */
public class A396381 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396381() {
    super(1, 2, k -> {
      final long[] u = LongUtils.toLong(FactorUtils.biunitaryDivisors(k));
      final long lim = 1L << (u.length - 1); // exclude last so we are proper only
      for (long j = 2; j < lim; j += 2) {
        long s = 0;
        long v = j;
        for (int i = 0; i < u.length - 1; ++i, v >>>= 1) {
          if ((v & 1) == 0) {
            s += u[i];
          } else {
            s -= u[i];
          }
        }
        if (s == 0) {
          return true;
        }
      }
      return false;
    });
  }
}
