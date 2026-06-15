package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396324 Numbers k for which there exists a residue class r (mod k) with s = r+m*k, m &gt;= 0, such that rad(s) | gcd(s,k), where rad = A007947.
 * @author Sean A. Irvine
 */
public class A396324 extends Sequence1 {

  private long mN = 3;

  private boolean isMember(final long k) {
    final FactorSequence fs = Jaguar.factor(k);
    final long rad = fs.squareFreeKernel().longValue();
    final long[][] lists = new long[fs.omega()][];

    int pos = 0;
    for (final Z pp : fs.toZArray()) {
      final long p = pp.longValueExact();
      final Set<Long> seen = new HashSet<>();
      final ArrayList<Long> cycle = new ArrayList<>();
      long x = 1;
      cycle.add(x);
      seen.add(x);
      do {
        x = (p * x) % k;
        cycle.add(x);
      } while (seen.add(x));
      lists[pos++] = LongUtils.toLong(cycle);
    }

    final Set<Long> t = new HashSet<>();
    buildProducts(lists, 0, 1, k, t);
    for (long x = 0; x < k; x += rad) {
      if (!t.contains(x)) {
        return true;
      }
    }
    return false;
  }

  private void buildProducts(final long[][] lists, final int pos, final long prod, final long mod, final Set<Long> t) {
    if (pos == lists.length) {
      t.add(prod);
      return;
    }
    for (final long v : lists[pos]) {
      buildProducts(lists, pos + 1,
        (prod * v) % mod, mod, t);
    }
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (!fs.isSquareFree() && isMember(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

