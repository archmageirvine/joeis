package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A398434 a(n) is the maximum cardinality of a Sidon subset of the set of positive divisors of n.
 * @author Sean A. Irvine
 */
public class A398434 extends Sequence1 {

  private long mN = 0;

  private boolean isEmptyIntersection(final Set<Long> u, final Set<Long> v) {
    if (u.size() > v.size()) {
      return isEmptyIntersection(v, u);
    }
    for (final long a : u) {
      if (v.contains(a)) {
        return false;
      }
    }
    return true;
  }

  private long r(final long[] d, final int p, final List<Long> c, final HashSet<Long> u, final int k, long b) {
    if (k + d.length - p <= b) {
      return b;
    }
    if (k > b) {
      b = k;
    }
    for (int i = p; i < d.length; ++i) {
      if (k + d.length - i <= b) {
        return b;
      }
      final long x = d[i];
      final HashSet<Long> v = new HashSet<>();
      v.add(2 * x);
      for (int q = 0; q < k; ++q) {
        v.add(x + c.get(q));
      }
      if (isEmptyIntersection(u, v)) {
        c.add(x);
        u.addAll(v);
        b = r(d, i + 1, c, u, k + 1, b);
        u.removeAll(v);
        c.remove(x);
      }
    }
    return b;
  }

  @Override
  public Z next() {
    return Z.valueOf(r(ZUtils.toLong(Jaguar.factor(++mN).divisors()), 0, new ArrayList<>(), new HashSet<>(), 0, 0));
  }
}
