package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a167.A167484;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396930 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A396930 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396930() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A167484();
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
