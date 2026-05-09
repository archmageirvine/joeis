package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395605 allocated for Simone Cammarasana.
 * @author Sean A. Irvine
 */
public class A395845 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395845() {
    super(1, CR.SQRT2.multiply(9).subtract(CR.FIVE.sqrt().multiply(4)).subtract(ComputableReals.SINGLETON.asinh(CR.HALF).multiply(8)).add(ComputableReals.SINGLETON.asinh(CR.ONE).multiply(9)).subtract(ComputableReals.SINGLETON.asinh(CR.TWO)).divide(6));
  }
}
