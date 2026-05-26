package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396078 Decimal expansion of x such that x^(x^3) = e^(Pi/2).
 * @author Sean A. Irvine
 */
public class A396078 extends DecimalExpansionSequence {

  private static final CR C = CR.HALF_PI.exp();

  /** Construct the sequence. */
  public A396078() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return x.pow(x.pow(3)).subtract(C);
      }
    }.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

