package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398174 Decimal expansion of the sum of reciprocals of repunit numbers base 5, Sum_{k&gt;=1} 4/(5^k - 1).
 * @author Sean A. Irvine
 */
public class A398174 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398174() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(Z.FIVE.pow(++k).subtract(1));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.multiply(4));
  }
}
