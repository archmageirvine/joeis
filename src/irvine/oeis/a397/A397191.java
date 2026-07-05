package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A397191 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A397191 extends DecimalExpansionSequence {

  private static CR f(final long m) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final Z t = CR.valueOf(Functions.FACTORIAL.z(++k)).inverse().pow(m).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    };
  }

  /** Construct the sequence. */
  public A397191() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z prod = CR.ONE.getApprox(precision);
        long m = 0;
        while (true) {
          final Z t = f(++m).getApprox(precision);
          final Z p = prod;
          prod = prod.multiply(t).shiftRight(-precision);
          if (p.equals(prod)) {
            return p;
          }
        }
      }
    });
  }
}

