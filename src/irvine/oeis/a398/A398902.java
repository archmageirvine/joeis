package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398902 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A398902 extends DecimalExpansionSequence {

  private static CR b(final long n) {
    final Z t = Z.ONE.shiftLeft(n);
    return CR.valueOf(new Q(t.add(1), t));
  }

  private static CR build(final long n) {
    CR v = b(n);
    for (long k = n - 1; k >= 0; --k) {
      v = b(k).pow(v);
    }
    return v;
  }

  /** Construct the sequence. */
  public A398902() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        long k = 5;
        Z t = build(k).getApprox(precision);
        while (true) {
          k += 5;
          final Z u = t;
          t = build(k).getApprox(precision);
          if (t.equals(u)) {
            return u;
          }
        }
      }
    });
  }
}
