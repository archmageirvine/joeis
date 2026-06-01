package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396365 Decimal expansion of the alpha constant in the SELU activation function.
 * @author Sean A. Irvine
 */
public class A396365 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396365() {
    super(1, CR.TWO.divide(CR.PI).sqrt().divide(CR.ONE.subtract(CrFunctions.ERFC.cr(CR.SQRT2.inverse()).multiply(CR.HALF.exp()))));
  }
}
