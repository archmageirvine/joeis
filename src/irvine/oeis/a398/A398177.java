package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398177 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A398177 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398177() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(Z.EIGHT.pow(++k).subtract(1));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.multiply(7));
  }
}
