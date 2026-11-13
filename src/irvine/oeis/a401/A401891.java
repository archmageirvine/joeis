package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401891 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A401891 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401891() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = -1;
        while (true) {
          final Z t = one.divide(Z.ONE.shiftLeft(++k).add(2));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

