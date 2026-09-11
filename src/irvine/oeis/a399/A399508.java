package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399508 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A399508 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399508() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -6;
        while (true) {
          k += 6;
          final Z t = one.divide(Functions.FACTORIAL.z(k).square());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

