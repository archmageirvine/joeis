package irvine.oeis.a402;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A402329 Decimal expansion of Sum_{n&gt;=1} sqrt(4*n^2+1)/2^(n+2).
 * @author Sean A. Irvine
 */
public class A402329 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A402329() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final Z t = CR.valueOf(4L * ++k * k + 1).sqrt().getApprox(precision + k + 2);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
