package irvine.oeis.a402;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A402034 Decimal expansion of -Integral_{x=1..infinity} log(abs(sin(Pi*x)))/x^2 dx.
 * @author Sean A. Irvine
 */
public class A402034 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A402034() {
    super(0, CR.PI.square().divide(2).subtract(CR.TAU.log()).subtract(1).subtract(
      new CR() {
        @Override
        protected Z approximate(final int precision) {
          Z sum = Z.ZERO;
          long k = 0;
          while (true) {
            final Z t = CrFunctions.ZETA.cr(2 * ++k).subtract(1).divide(2 * k - 1).getApprox(precision);
            if (t.isZero()) {
              return sum;
            }
            sum = sum.add(t);
          }
        }
      }.multiply(2)
    ));
  }
}

