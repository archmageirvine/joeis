package irvine.oeis.a398;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398263 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A398263 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;

  private static void b(final int r, final int p, final Z d, final Z nf, final Set<Z> t) {
    if (r == 0) {
      t.add(nf.divide(d));
      return;
    }
    for (int i = Math.min(p, r); i >= 1; --i) {
      b(r - i, i, d.multiply(Functions.FACTORIAL.z(i)), nf, t);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int n = mN;
    final Set<Z> t = new TreeSet<>();
    b(n, n, Z.ONE, Functions.FACTORIAL.z(n), t);
    final TreeMap<Z, Integer> s = new TreeMap<>();
    long max = 0;
    for (final Z a : t) {
      for (final Z b : t) {
        final Z sum = a.add(b);
        s.merge(sum, 1, Integer::sum);
        if (a.equals(b)) {
          break;
        }
      }
      while (!s.isEmpty() && s.firstKey().compareTo(a) <= 0) {
        max = Math.max(max, s.pollFirstEntry().getValue());
      }
    }
    max = Math.max(max, IntegerUtils.max(s.values()));
    return Z.valueOf(max);
  }
}
