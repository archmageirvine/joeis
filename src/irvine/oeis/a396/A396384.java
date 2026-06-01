package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396384 Decimal expansion of the constant D = Sum_{n&gt;=0} 1/(2*n! + 1).
 * @author Sean A. Irvine
 */
public class A396384 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396384() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = one.divide(Functions.FACTORIAL.z(++k).multiply2().add(1));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
