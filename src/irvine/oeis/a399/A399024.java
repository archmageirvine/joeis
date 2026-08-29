package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399024 Decimal expansion of the exponential growth rate of A396406.
 * @author Sean A. Irvine
 */
public class A399024 extends DecimalExpansionSequence {

  private static final UnaryCrFunction B = new UnaryCrFunction() {
    @Override
    public CR execute(final CR x) {
      return new CR() {
        @Override
        protected Z approximate(final int precision) {
          Z sum = Z.ZERO;
          int k = -1;
          CR prod = CR.ONE;
          while (true) {
            if (++k > 0) {
              prod = prod.multiply(CR.ONE.subtract(x.pow(2 * k - 1))).multiply(CR.ONE.subtract(x.pow(2 * k)));
            }
            final CR z = x.subtract(1).pow(k).multiply(x.pow(k * k));
            final Z t = z.divide(prod).getApprox(precision - k);
            if (t.isZero()) {
              return sum;
            }
            sum = sum.add(t);
          }
        }
      };
    }
  };

  /** Construct the sequence. */
  public A399024() {
    super(1, B.inverseMonotone(CR.valueOf(0.1), CR.valueOf(0.9)).execute(CR.ZERO).sqrt().inverse());
  }
}

