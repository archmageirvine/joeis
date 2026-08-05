package irvine.oeis.a397;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397896 For each positive integer n, let a(n) be the minimum number of nonnegative integers (suffixes) needed so that, for every positive integer m, at least one of those suffixes can be appended to the decimal representation of m to produce a multiple of n. We must prioritize the smallest suffixes when possible.
 * @author Sean A. Irvine
 */
public class A397896 extends Sequence1 {

  private int mN = 0;

  private static long concat(final long a, final int b) {
    if (b == 0) {
      return 10 * a;
    }
    long p = 10;
    int t = b;
    while (t >= 10) {
      p *= 10;
      t /= 10;
    }
    return a * p + b;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final int[] v = new int[mN + 1];
    Arrays.fill(v, -1);

    int remaining = mN - 1;
    long k = 1;
    while (remaining > 0) {
      int m = (int) (k % mN);
      if (m == 0) {
        m = mN;
      }
      if (v[m] == -1) {
        int f = 0;
        while (concat(k, f) % mN != 0) {
          ++f;
        }
        v[m] = f;
        --remaining;
      }
      ++k;
    }

    final HashSet<Integer> s = new HashSet<>();
    for (int i = 1; i <= mN; ++i) {
      if (v[i] >= 0) {
        s.add(v[i]);
      }
    }
    return Z.valueOf(s.size());
  }
}
