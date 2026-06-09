package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396705 allocated for Yunjae Shin.
 * @author Sean A. Irvine
 */
public class A396705 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396705() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final Z t = Zeta.zeta(2L * ++k + 1).subtract(1).multiply(Binomial.binomial(2L * k, k)).divide(k + 1).getApprox(precision + 2 * k + 1);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.add(CR.HALF));
  }
}
