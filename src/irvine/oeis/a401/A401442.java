package irvine.oeis.a401;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401442 Number of ordered rooted trees with n nodes such that no two sibling subtrees are isomorphic as unordered rooted trees.
 * @author Sean A. Irvine
 */
public class A401442 extends Sequence1 {

  // S(k,m) = sum of kth powers of weights of trees with m edges.
  private final Map<Long, Z> mS = new HashMap<>();
  // E(k,m,r) = weighted elementary symmetric sum.
  // Each entry stores the entire row indexed by r.
  private final Map<Long, Z[]> mE = new HashMap<>();
  private int mN = -1;

  private static long key(final int k, final int m) {
    return ((long) k << 32) | (m & 0xFFFFFFFFL);
  }

  /**
   * Calculate E(k,m,r) for all r, and then S(k,m).
   * All required entries have smaller k*(m+1).
   * @param k moment order
   * @param m number of edges
   */
  private void compute(final int k, final int m) {
    final Z[] e = new Z[m + 1];
    for (int r = 0; r <= m; ++r) {
      e[r] = Z.ZERO;
    }
    for (int r = 1; r <= m; ++r) {
      Z total = Z.ZERO;
      for (int j = 1; j <= r; ++j) {
        final boolean positive = (j & 1) == 1;
        for (int s = 0; j * (s + 1) <= m; ++s) {
          final int em = m - j * (s + 1);
          final int er = r - j;
          // An elementary symmetric sum with too many selected objects is zero.
          if (er > em) {
            continue;
          }
          // S(k*j, s), with the zero-edge tree as base case.
          final Z powerSum;
          if (s == 0) {
            powerSum = Z.ONE;
          } else {
            powerSum = mS.get(key(k * j, s));
            assert powerSum != null : "Missing S(" + (k * j) + "," + s + ")";
          }
          // E(k, em, er).
          final Z elementary;
          if (em == 0) {
            elementary = Z.ONE;
          } else {
            final Z[] previous = mE.get(key(k, em));
            assert previous != null : "Missing E(" + k + "," + em + ")";
            elementary = previous[er];
          }
          final Z term = powerSum.multiply(elementary);
          total = positive ? total.add(term) : total.subtract(term);
        }
      }
      // Newton's identities.
      e[r] = total.divide(Z.valueOf(r));
    }
    mE.put(key(k, m), e);
    // S(k,m) = sum_r (r!)^k * E(k,m,r).
    Z sum = Z.ZERO;
    for (int r = 1; r <= m; ++r) {
      sum = sum.add(Functions.FACTORIAL.z(r).pow(k).multiply(e[r]));
    }
    mS.put(key(k, m), sum);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }

    // Calculate all new entries satisfying k*(m+1) = mN+1.
    final int q = mN + 1;
    for (int d = 1; d <= q / d; ++d) {
      if (q % d != 0) {
        continue;
      }
      // k = d
      final int m1 = q / d - 1;
      if (m1 > 0) {
        compute(d, m1);
      }
      // k = q/d
      final int k2 = q / d;
      final int m2 = d - 1;
      if (m2 > 0 && k2 != d) {
        compute(k2, m2);
      }
    }
    return mS.get(key(1, mN));
  }
}
