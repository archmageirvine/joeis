package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396451 Decimal expansion of Sum_{k&gt;=0} 1/(k!)^6.
 * @author Sean A. Irvine
 */
public class A396451 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396451() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(++k).pow(6));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

