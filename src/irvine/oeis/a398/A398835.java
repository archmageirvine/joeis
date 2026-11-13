package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398835 Numbers k such that (3^k - 1)/2 is squarefree.
 * @author Sean A. Irvine
 */
public class A398835 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398835() {
    super(1, k -> Predicates.SQUARE_FREE.is(Z.THREE.pow(k).subtract(1).divide2()));
  }
}
