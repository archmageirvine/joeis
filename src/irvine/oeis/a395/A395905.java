package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395905 Decimal expansion of Jacobi theta function theta_3(0, 1/2) where theta_3 is the 3rd Jacobi theta function.
 * @author Sean A. Irvine
 */
public class A395905 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395905() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = one;
        long k = 0;
        while (true) {
          final Z t = one.shiftRight(++k * k - 1);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

