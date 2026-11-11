package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398806.
 * @author Sean A. Irvine
 */
public class A398835 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398835() {
    super(1, k -> Predicates.SQUARE_FREE.is(Z.THREE.pow(k).subtract(1).divide2()));
  }
}
