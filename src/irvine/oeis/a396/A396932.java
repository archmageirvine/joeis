package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a279.A279663;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396932 Decimal expansion of the sum of the reciprocals of A279663.
 * @author Sean A. Irvine
 */
public class A396932 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396932() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A279663();
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(s.next());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
