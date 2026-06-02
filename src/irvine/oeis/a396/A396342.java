package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396342 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A396342 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396342() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z x = one.divide2();
        Z prod = x.divide2();
        while (true) {
          x = x.multiply(one.subtract(x)).divide(3).shiftRight(-precision);
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
