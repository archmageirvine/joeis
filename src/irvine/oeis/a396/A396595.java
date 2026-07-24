package irvine.oeis.a396;

import java.util.Collection;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396595 Number of distinct subsets of {2,3,...,n+1} obtainable by choosing exactly one forbidden residue class modulo each k = 2,3,...,n.
 * @author Sean A. Irvine
 */
public class A396595 extends Sequence1 {

  private int mN = 0;

  private Collection<Z> localOptions(final int n, final int k) {
    final HashSet<Z> res = new HashSet<>();
    for (long a = 0; a < k; ++a) {
      Z sum = Z.ZERO;
      for (int m = k + 1; m <= n + 1; ++m) {
        if (m % k == a) {
          sum = sum.setBit(m - 2);
        }
      }
      res.add(sum);
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    HashSet<Z> banned = new HashSet<>();
    banned.add(Z.ZERO);
    for (int k = 2; k <= mN; ++k) {
      final Collection<Z> opts = localOptions(mN, k);
      final HashSet<Z> newSet = new HashSet<>();
      for (final Z b : banned) {
        for (final Z mask : opts) {
          newSet.add(b.or(mask));
        }
      }
      banned = newSet;
    }
    return Z.valueOf(banned.size());
  }
}
