package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400400 allocated for Pontus von Br\u00f6mssen.
 * @author Sean A. Irvine
 */
public class A400400 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A400400() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        final CR t = x.multiply(CR.SQRT2);
        return CrFunctions.BESSEL_I0.cr(t).subtract(CR.SQRT2.multiply(CrFunctions.BESSEL_I.cr(1, t)));
      }
    }.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

