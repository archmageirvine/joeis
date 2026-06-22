package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396976 Decimal expansion of (-1)*Integral_{x=0..1} log(-log(x))/(1 + x^2 + 2*x*cos(1)) dx.
 * @author Sean A. Irvine
 */
public class A396976 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396976() {
    super(0, CrFunctions.GAMMA.cr(CR.HALF.subtract(CR.TAU.inverse())).square().multiply(CR.HALF.cos()).divide(CR.PI).log().multiply(CR.PI).subtract(CR.TAU.log()).divide(CR.ONE.sin().multiply(2)));
  }
}
