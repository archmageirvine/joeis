package irvine.oeis.a402;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A087450.
 * @author Sean A. Irvine
 */
public class A402040 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A402040() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence p = new A402041();
        final Sequence q = new A402042();
        Z u = Z.ZERO;
        while (true) {
          final Z v = CR.valueOf(p.next()).divide(CR.valueOf(q.next())).getApprox(precision);
          if (v.equals(u)) {
            return u;
          }
          u = v;
        }
      }
    });
  }
}
