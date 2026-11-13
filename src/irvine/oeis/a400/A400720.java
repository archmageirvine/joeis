package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400720 Numbers k such that 3^k-2^k is squarefree.
 * @author Sean A. Irvine
 */
public class A400720 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400720() {
    super(1, k -> Predicates.SQUARE_FREE.is(Z.THREE.pow(k).subtract(Z.ONE.shiftLeft(k))));
  }
}
