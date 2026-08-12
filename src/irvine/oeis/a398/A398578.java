package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A398578 Base-12 happy numbers.
 * @author Sean A. Irvine
 */
public class A398578 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398578() {
    super(1, k -> Predicates.HAPPY.is(12, k));
  }
}
