package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a398.A398173;

/**
 * A399437 allocated for Pawe\u0142 Kwaczy\u0144ski.
 * @author Sean A. Irvine
 */
public class A399437 extends A398173 {

  // After Pawe&#x142; Kwaczy&#x144;ski

  private int mP = 2;

  private boolean usf(final List<Integer> a, final int p) {
    final int[] r = new int[p];
    for (int i = 0; i < a.size(); ++i) {
      final int e = a.get(i);
      for (int j = i; j < a.size(); ++j) {
        final int b = a.get(j);
        ++r[(e + b) % p];
      }
    }
    for (final int x : r) {
      if (x == 1) {
        return false;
      }
    }
    return true;
  }

  private String canon(final List<Integer> a, final int p) {
    String best = null;
    for (int u = 1; u < p; ++u) {
      for (int v = 0; v < p; ++v) {
        final int[] b = new int[a.size()];
        for (int i = 0; i < a.size(); ++i) {
          b[i] = (u * a.get(i) + v) % p;
        }
        Arrays.sort(b);
        final StringBuilder sb = new StringBuilder();
        for (final int x : b) {
          sb.append(x).append(',');
        }
        final String s = sb.toString();
        if (best == null || s.compareTo(best) < 0) {
          best = s;
        }
      }
    }
    return best;
  }

  private void combinations(final int next, final int left, final int p, final List<Integer> a, final Set<String> result) {
    if (left == 0) {
      if (usf(a, p)) {
        result.add(canon(a, p));
      }
      return;
    }
    if (p - next < left) {
      return;
    }
    for (int x = next; x < p; ++x) {
      a.add(x);
      combinations(x + 1, left - 1, p, a, result);
      a.remove(a.size() - 1);
    }
  }

  private long a(final int p, final int k) {
    final Set<String> canonicals = new HashSet<>();
    final List<Integer> a = new ArrayList<>(k);
    a.add(0);
    a.add(1);
    combinations(2, k - 2, p, a, canonicals);
    return canonicals.size();
  }

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.i(mP);
    final int k = super.next().intValueExact();
    return Z.valueOf(a(mP, k));
  }
}
