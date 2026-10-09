package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400117 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A400117 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A400117() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        long k = -1;
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(3 * ++k).pow(3));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
