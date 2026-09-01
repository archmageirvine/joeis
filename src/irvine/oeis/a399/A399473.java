package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399473 Decimal expansion of Product_{k&gt;=2} 1/(1-1/k!^3).
 * @author Sean A. Irvine
 */
public class A399473 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399473() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z prod = one;
        long k = 1;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(++k).pow(3));
          if (t.isZero()) {
            return prod;
          }
          prod = prod.multiply(one.subtract(t)).shiftRight(-precision);
        }
      }
    }.inverse());
  }
}
