package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399614 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A399614 extends DecimalExpansionSequence {

  private static CR f(final long m) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -m;
        while (true) {
          k += m;
          final Z t = one.divide(Functions.FACTORIAL.z(k).square());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    };
  }

  /** Construct the sequence. */
  public A399614() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        long m = 0;
        Z prod = one;
        while (true) {
          final Z z = f(++m).getApprox(precision);
          if (z.equals(one)) {
            return prod;
          }
          prod = prod.multiply(z).shiftRight(-precision);
        }
      }
    });
  }
}

