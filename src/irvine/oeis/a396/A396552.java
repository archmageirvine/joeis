package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396552 Decimal expansion of lim_{n-&gt;oo} L_n(0), where L_n is the Lebesgue function associated with the interpolation nodes 1!, 2!, ..., n!.
 * @author Sean A. Irvine
 */
public class A396552 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396552() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          ++k;
          Q prod = Q.ONE;
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
          sum = sum.add(t.abs());
        }
      }
    });
  }
}

