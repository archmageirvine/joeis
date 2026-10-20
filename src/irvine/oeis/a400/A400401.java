package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400401 Decimal expansion of e^(-3*T/2) * Sum_{k &gt;= 1} I_k(T*sqrt(2))/2^(k/2), where T = 1.455378... is the constant given by A400400 and I_k is the order-k modified Bessel function of the first kind.
 * @author Sean A. Irvine
 */
public class A400401 extends DecimalExpansionSequence {

  private static final CR T0 = new A400400().getCR();

  /** Construct the sequence. */
  public A400401() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final CR tsqrt2 = T0.multiply(SQRT2);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final Z t = CrFunctions.BESSEL_I.cr(++k, tsqrt2).divide(CR.SQRT2.pow(k)).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.multiply(T0.multiply(new Q(-3, 2)).exp()));
  }
}
