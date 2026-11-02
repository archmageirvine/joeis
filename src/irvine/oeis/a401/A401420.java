package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A401420 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A401420 extends FilterSequence {

  /** Construct the sequence. */
  public A401420() {
    super(1, new A000217(), t -> Predicates.POWER.is(t.subtract(1)) || Predicates.POWER.is(t.add(1)));
  }
}
