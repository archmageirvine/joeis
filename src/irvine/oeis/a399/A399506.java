package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399506 Decimal expansion of Sum_{k&gt;=0} 1/((4*k)!)^2.
 * @author Sean A. Irvine
 */
public class A399506 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399506() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -4;
        while (true) {
          k += 4;
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

