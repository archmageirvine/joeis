package irvine.oeis.a398;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398237 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A398237 extends Sequence1 {

  private int mN = 0;
  private int mK = 0;

  private Z t(final int n, final int k) {
    long cnt = 0;
    final Set<Z> t = new HashSet<>();
    A398232.b(n, n, Math.min(k, n), Z.ONE, Functions.FACTORIAL.z(n), t);
    final HashSet<Z> s = new HashSet<>();
    final HashSet<Z> s1 = new HashSet<>();
    for (final Z a : t) {
      for (final Z b : t) {
        final Z r = a.add(b);
        if (!s.add(r) && s1.add(r)) {
          ++cnt;
        }
        if (a.equals(b)) {
          break;
        }
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return t(mN, mK);
  }
}
