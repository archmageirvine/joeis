package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396485 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A396485 extends DecimalExpansionSequence {

  private static final CR SQRT7 = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A396485() {
    super(1, CR.SIX.subtract(CR.HALF_PI.multiply(SQRT7).tanh().multiply(CR.PI.multiply(4)).divide(SQRT7)));
  }
}
