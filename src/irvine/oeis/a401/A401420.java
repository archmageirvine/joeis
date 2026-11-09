package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A401420 Triangular numbers t such that either t-1 or t+1 is a perfect power (A001597).
 * @author Sean A. Irvine
 */
public class A401420 extends FilterSequence {

  /** Construct the sequence. */
  public A401420() {
    super(1, new A000217(), t -> Predicates.POWER.is(t.subtract(1)) || Predicates.POWER.is(t.add(1)));
  }
}
