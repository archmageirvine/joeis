package irvine.oeis.a398;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398238 a(n) is the number of distinct unordered pairwise sums with repetition of the distinct multinomial coefficient values of order n having more than one representation.
 * @author Sean A. Irvine
 */
public class A398238 extends Sequence1 {

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
    final Set<Z> t = new HashSet<>();
    b(mN, mN, Z.ONE, Functions.FACTORIAL.z(mN), t);
    long cnt = 0;
    final HashSet<Z> s = new HashSet<>();
    final HashSet<Z> s1 = new HashSet<>();
    for (final Z a : t) {
      for (final Z b : t) {
        final Z sum = a.add(b);
        if (!s.add(sum) && s1.add(sum)) {
          ++cnt;
        }
        if (a.equals(b)) {
          break;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
