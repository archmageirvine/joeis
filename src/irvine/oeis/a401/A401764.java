package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401764 Decimal expansion of the positive real root of x^(x+1) = x^2 + 1.
 * @author Sean A. Irvine
 */
public class A401764 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401764() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.pow(x.add(1)).subtract(x.multiply(x)).subtract(1);
      }
    }.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

