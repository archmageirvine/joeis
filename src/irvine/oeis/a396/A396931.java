package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a279.A279662;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396931 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A396931 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396931() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A279662();
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
