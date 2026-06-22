package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396964 Decimal expansion of (-1)*Integral_{x=0..1} log(-log(x))/(1 + x^2 + 2*x*cos(4)) dx.
 * @author Sean A. Irvine
 */
public class A396964 extends DecimalExpansionSequence {

  private static final CR TWO_OVER_PI = CR.TWO.divide(CR.PI);

  /** Construct the sequence. */
  public A396964() {
    super(1, ComputableReals.SINGLETON.csc(CR.FOUR).multiply(CR.HALF_PI)
      .multiply(CR.TAU.pow(CR.TWO.subtract(CR.FOUR.divide(CR.PI)))
        .multiply(CrFunctions.GAMMA.cr(CR.valueOf(new Q(3, 2)).subtract(TWO_OVER_PI)))
        .divide(CrFunctions.GAMMA.cr(TWO_OVER_PI.subtract(CR.HALF))).log()));
  }
}

