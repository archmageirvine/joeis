package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396341 Decimal expansion of the x(0)*Product_{k&gt;=0} x(k)*(1-x(k)) where x(k) = x(k-1)*(1-x(k-1))/5 with x(0)=1/2.
 * @author Sean A. Irvine
 */
public class A396341 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396341() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z x = one.divide2();
        Z prod = x.divide2();
        while (true) {
          x = x.multiply(one.subtract(x)).divide(5).shiftRight(-precision);
          final Z prev = prod;
          final Z t = one.subtract(x);
          prod = prod.multiply(t).shiftRight(-precision);
          if (prod.equals(prev)) {
            return prod;
          }
        }
      }
    });
  }
}
