package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A399756 Numbers k such that 2^k-2 is a practical number.
 * @author Sean A. Irvine
 */
public class A399756 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399756() {
    super(1, 2, k -> Predicates.PRACTICAL.is(Z.ONE.shiftLeft(k).subtract(2)));
  }
}
