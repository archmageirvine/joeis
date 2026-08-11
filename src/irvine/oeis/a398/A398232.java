package irvine.oeis.a398;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398232 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A398232 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;
  private int mK = 0;

  static void b(final int r, final int p, final int q, final Z d, final Z nf, final Set<Z> t) {
    if (r == 0) {
      t.add(nf.divide(d));
      return;
    }
    if (q == 0) {
      return;
    }
    for (int i = Math.min(p, r); i >= 1; --i) {
      b(r - i, i, q - 1, d.multiply(Functions.FACTORIAL.z(i)), nf, t);
    }
  }

  private Z t(final int n, final int k) {
    final Set<Z> t = new HashSet<>();
    b(n, n, Math.min(k, n), Z.ONE, Functions.FACTORIAL.z(n), t);
    final HashSet<Z> s = new HashSet<>();
    for (final Z a : t) {
      for (final Z b : t) {
        s.add(a.add(b));
        if (a.equals(b)) {
          break;
        }
      }
    }
    return Binomial.binomial(t.size() + 1, 2).subtract(s.size());
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
