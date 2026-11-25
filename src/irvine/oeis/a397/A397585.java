package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A397585 allocated for Pierre Colmant.
 * @author Sean A. Irvine
 */
public class A397585 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A397585() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence c = new A002808();
        long k = 0;
        Z prod = CR.ONE.getApprox(precision);
        while (true) {
          final Z t = CR.valueOf(c.next()).pow(new Q(1, Z.ONE.shiftLeft(++k))).getApprox(precision);
          final Z p = prod;
          prod = prod.multiply(t).shiftRight(-precision);
          if (prod.equals(p)) {
            return prod;
          }
        }
      }
    });
  }
}
