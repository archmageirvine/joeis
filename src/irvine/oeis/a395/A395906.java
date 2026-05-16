package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395906 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A395906 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395906() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = CR.TWO.pow(new Q(4 * ++k * (k + 1) - 3, 4)).inverse().getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

