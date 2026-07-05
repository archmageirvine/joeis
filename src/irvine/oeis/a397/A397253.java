package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A397253 Decimal expansion of the limit of the area of the sequence of inscribed polygons formed by angular bisection.
 * @author Sean A. Irvine
 */
public class A397253 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A397253() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 0;
        Z s1 = CR.PI.divide(2).sin().multiply(2).getApprox(precision);
        while (true) {
          ++k;
          final Z s0 = s1;
          s1 = CR.PI.divide(Z.ONE.shiftLeft(k + 1)).sin().multiply(2).getApprox(precision);
          final Z t = s1.subtract(s0.divide2());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.divide(2).add(1));
  }
}
