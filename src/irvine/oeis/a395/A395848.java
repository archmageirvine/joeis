package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395848 Decimal expansion of the expected distance between the center of a unit-side regular hexagon to a randomly and uniformly selected point on its perimeter.
 * @author Sean A. Irvine
 */
public class A395848 extends DecimalExpansionSequence {


  /** Construct the sequence. */
  public A395848() {
    super(0, CR.THREE.log().multiply(3).add(4).divide(8));
  }
}
