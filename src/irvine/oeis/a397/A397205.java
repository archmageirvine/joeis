package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397205 Maximum value of |S|*|T| over subsets S,T of {1,...,n} such that the products s*t are pairwise distinct with s in S and t in T.
 * @author Sean A. Irvine
 */
public class A397205 extends Sequence1 {

  // After Kenta Kitamura

  private int mN = 0;

  private static void generate(final int[] set, final int pos, final int[] subset, final int len, final List<int[]> subsets) {
    if (len == subset.length) {
      subsets.add(subset.clone());
      return;
    }
    for (int k = pos; k <= set.length - (subset.length - len); ++k) {
      subset[len] = set[k];
      generate(set, k + 1, subset, len + 1, subsets);
    }
  }

  private static List<int[]> subsets(final int n) {
    final int[] set = new int[n];
    for (int k = 0; k < n; ++k) {
      set[k] = k + 1;
    }
    final List<int[]> res = new ArrayList<>();
    for (int k = 0; k <= n; ++k) {
      generate(set, 0, new int[k], 0, res);
    }
    return res;
  }

  private static boolean productDistinct(final int[] a, final int[] b) {
    final HashSet<Integer> seen = new HashSet<>();
    for (final int x : a) {
      for (final int y : b) {
        if (!seen.add(x * y)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final List<int[]> subsets = subsets(++mN);
    int best = 0;
    for (final int[] a : subsets) {
      for (final int[] b : subsets) {
        final int value = a.length * b.length;
        if (value > best && productDistinct(a, b)) {
          best = value;
        }
      }
    }
    return Z.valueOf(best);
  }
}
