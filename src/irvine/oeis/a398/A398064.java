package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A397049.
 * @author Sean A. Irvine
 */
public class A398064 extends DecimalExpansionSequence {

  // (Pi+log(3-2*sqrt(2)))/(sqrt(2)*Gamma(3/4)

  /** Construct the sequence. */
  public A398064() {
    super(0, CR.THREE.subtract(CR.SQRT2.multiply(2)).log().add(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).multiply(CR.SQRT2)));
  }
}
