package irvine.oeis.a402;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A402264 Positive integers equal to the sum of the p-th powers of their first k divisors for some positive integers p and k.
 * @author Sean A. Irvine
 */
public class A402264 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A402264() {
    super(1, k -> {
      if (k == 1) {
        return true;
      }
      final long[] d = ZUtils.toLong(Jaguar.factor(k).divisorsSorted());
      long p = 0;
      while (LongUtils.pow(d[1], ++p) < k) {
        long s = 1;
        int j = 1;
        while (s < k && j < d.length) {
          s += LongUtils.pow(d[j++], p);
        }
        if (s == k) {
          return true;
        }
      }
      return false;
    });
  }
}
