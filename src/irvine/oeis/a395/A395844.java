package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395844 Decimal expansion of the expected distance of a point uniformly selected at random in the interior of a unit-side equilateral triangle to its farthest vertex.
 * @author Sean A. Irvine
 */
public class A395844 extends DecimalExpansionSequence {

  private static final CR LOG3 = CR.THREE.log();
  private static final CR SQRT3 = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A395844() {
    super(0, LOG3.multiply(27).add(CR.THREE.sqrt().multiply(LOG3.multiply(3).add(4))).subtract(SQRT3.multiply(6).multiply(ComputableReals.SINGLETON.asinh(SQRT3))).divide(36));
  }
}
