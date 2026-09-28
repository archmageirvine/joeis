package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399752 Decimal expansion of Sum_{k&gt;=0} 6^k/(6*k)! (reciprocals of A210279).
 * @author Sean A. Irvine
 */
public class A399752 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399752() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = Z.SIX.pow(++k).shiftLeft(-precision).divide(Functions.FACTORIAL.z(6 * k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
