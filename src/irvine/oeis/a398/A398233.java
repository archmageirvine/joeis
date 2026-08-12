package irvine.oeis.a398;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398233 a(n) is the total collision excess among unordered pairwise sums with repetition of the distinct multinomial coefficient values of order n.
 * @author Sean A. Irvine
 */
public class A398233 extends Sequence1 {

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
}
