package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395846 Decimal expansion of the expected distance between the center of a unit-side equilateral triangle to a randomly and uniformly selected point on its perimeter.
 * @author Sean A. Irvine
 */
public class A395846 extends DecimalExpansionSequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A395846() {
    super(0, SQRT3.multiply(2).add(SQRT3.add(2).log()).divide(12));
  }
}
