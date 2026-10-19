package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A400384 Positive integers whose divisors can be partitioned into two disjoint subsets with sums differing by 5.
 * @author Sean A. Irvine
 */
public class A400384 extends FilterNumberSequence {

  // After Alois P. Heinz

  private static boolean is(final long n) {
    final long[] l = ZUtils.toLong(Jaguar.factor(n).divisorsSorted());
    final long[] ll = new long[l.length];
    ll[0] = l[0];
    for (int k = 1; k < l.length; ++k) {
      ll[k] = ll[k - 1] + l[k];
    }
    final MemoryFunctionInt2<Boolean> b = new MemoryFunctionInt2<>() {
      @Override
      protected Boolean compute(final int m, final int i) {
        return (i < 0 && m == 0) || (i >= 0 && m <= ll[i] && (get((int) Math.abs(m - l[i]), i - 1) || get((int) (m + l[i]), i - 1)));
      }
    };
    return b.get(5, l.length - 1);
  }

  /** Construct the sequence. */
  public A400384() {
    super(1, A400384::is);
  }
}
