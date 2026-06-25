package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a202.A202689;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396933 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A396933 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396933() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A202689();
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
