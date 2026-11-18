package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a056.A056576;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401012 Decimal expansion of 1 - Sum_{n&gt;=1} 2^(-floor(n*log_2(3))).
 * @author Sean A. Irvine
 */
public class A401012 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401012() {
    super(0, CR.ONE.subtract(new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A056576().skip();
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.shiftRight(s.next().longValueExact());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }));
  }
}
