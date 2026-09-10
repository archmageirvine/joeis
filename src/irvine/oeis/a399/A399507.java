package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399507 Decimal expansion of Sum_{k&gt;=0} 1/((5*k)!)^2.
 * @author Sean A. Irvine
 */
public class A399507 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399507() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -5;
        while (true) {
          k += 5;
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

