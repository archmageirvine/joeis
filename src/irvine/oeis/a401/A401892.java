package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401892 Decimal expansion of 5/4 + A065442/2 + Sum_{k&gt;=1} 1/(2^k + 1).
 * @author Sean A. Irvine
 */
public class A401892 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401892() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        while (true) {
          final Z t = one.divide(Z.ONE.shiftLeft(++k).add(1));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.add(new A401890().getCR()));
  }
}

