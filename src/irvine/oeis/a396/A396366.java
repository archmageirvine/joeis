package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396366 Decimal expansion of the lambda (scale) constant in the SELU activation function.
 * @author Sean A. Irvine
 */
public class A396366 extends DecimalExpansionSequence {

  private static final CR E1 = CrFunctions.ERFC.cr(CR.SQRT2.inverse());
  private static final CR E2 = E1.multiply(CR.HALF.exp());
  private static final CR E3 = CrFunctions.ERFC.cr(CR.SQRT2).multiply(CR.TWO.exp());
  private static final CR TWO_OVER_PI = CR.TWO.divide(CR.PI);

  /** Construct the sequence. */
  public A396366() {
    super(1, CR.TWO.divide(CR.ONE.add(TWO_OVER_PI.divide(CR.ONE.subtract(E2).square()).multiply(CR.ONE.subtract(E2.multiply(2)).add(E3)))).sqrt());
  }
}

