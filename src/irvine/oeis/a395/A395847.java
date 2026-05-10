package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395847 Decimal expansion of the expected distance between the center of a unit-side regular pentagon to a randomly and uniformly selected point on its perimeter.
 * @author Sean A. Irvine
 */
public class A395847 extends DecimalExpansionSequence {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A395847() {
    super(0, SQRT5.add(5).multiply(10).sqrt().add(SQRT5.multiply(2).add(5).multiply(ComputableReals.SINGLETON.acosh(SQRT5.subtract(1)))).divide(20));
  }
}
