package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399059 Decimal expansion of Sum_{k&gt;=2} d(k-1)/prime(k)!.
 * @author Sean A. Irvine
 */
public class A399059 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399059() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 1;
        while (true) {
          final Z t = Functions.SIGMA0.z(k++).shiftLeft(-precision).divide(Functions.FACTORIAL.z(Functions.PRIME.l(k)));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
