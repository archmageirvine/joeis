package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395849 Decimal expansion of the expected distance between the center of a unit-side regular pentagon to a randomly and uniformly selected point in its interior.
 * @author Sean A. Irvine
 */
public class A395849 extends DecimalExpansionSequence {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A395849() {
    super(0, SQRT5.add(5).multiply(10).sqrt().add(SQRT5.multiply(2).add(5).multiply(ComputableReals.SINGLETON.asinh(CR.FIVE.subtract(SQRT5.multiply(2)).sqrt()))).divide(30));
  }
}
