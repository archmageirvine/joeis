package irvine.oeis.a398;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A398238 a(n) is the number of distinct unordered pairwise sums with repetition of the distinct multinomial coefficient values of order n having more than one representation.
 * @author Sean A. Irvine
 */
public class A398238 extends AbstractSequence {

  // After Felix Huber

  private int mN = 4;
  private int mM = 0;
  private Z[] mRow = {};

  /** Construct the sequence. */
  public A398238() {
    super(5);
  }

  private static void b(final int r, final int p, final Z d, final Z nf, final Set<Z> t) {
    if (r == 0) {
      t.add(nf.divide(d));
      return;
    }
    for (int i = Math.min(p, r); i >= 1; --i) {
      b(r - i, i, d.multiply(Functions.FACTORIAL.z(i)), nf, t);
    }
  }

  private Z[] row(final int n) {
    final Set<Z> t = new HashSet<>();
    b(n, n, Z.ONE, Functions.FACTORIAL.z(n), t);
    final Map<Z, Integer> s = new HashMap<>();
    for (final Z a : t) {
      for (final Z b : t) {
        final Z sum = a.add(b);
        s.merge(sum, 1, Integer::sum);
        if (a.equals(b)) {
          break;
        }
      }
    }
    final int a = IntegerUtils.max(s.values());
    final long[] c = new long[a];
    for (final long v : s.values()) {
      for (int k = 1; k < v; ++k) {
        ++c[k];
      }
    }
    return ZUtils.toZ(c);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = row(++mN);
      mM = 1;
    }
    return mRow[mM];
  }
}
