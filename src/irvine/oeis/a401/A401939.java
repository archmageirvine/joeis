package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401939 Decimal expansion of the fixed point of the cosine function when the angle is measured in gradians.
 * @author Sean A. Irvine
 */
public class A401939 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401939() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CR.PI.multiply(x).divide(200).cos().subtract(x);
      }
    }.inverseMonotone(CR.HALF, CR.ONE).execute(CR.ZERO));
  }
}

