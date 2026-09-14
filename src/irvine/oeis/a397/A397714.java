package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A397714 Decimal expansion of the unique real solution c &gt; 1 of (c-1)*exp(2*c) = 2*(c+1).
 * @author Sean A. Irvine
 */
public class A397714 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A397714() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.subtract(1).multiply(x.multiply(2).exp()).subtract(x.add(1).multiply(2));
      }
    }.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}
