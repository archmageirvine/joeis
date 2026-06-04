package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396533 allocated for Thomas Scheuerle.
 * @author Sean A. Irvine
 */
public class A396533 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396533() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          Q prod = Q.valueOf(++k);
          long j = 0;
          while (true) {
            if (++j != k) {
              final Q v = new Q(Functions.FACTORIAL.z(j), Functions.FACTORIAL.z(j).subtract(Functions.FACTORIAL.z(k)));
              if (CR.valueOf(v).getApprox(precision).equals(one)) {
                break;
              }
              prod = prod.multiply(v);
            }
          }
          final Z t = CR.valueOf(prod).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.subtract(t);
        }
      }
    });
  }
}

