package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a007.A007504;

/**
 * A400132 Numbers k such that A007504(k) - 1 is a perfect square.
 * @author Sean A. Irvine
 */
public class A400132 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A400132() {
    super(1, 0, new A007504(), k -> Predicates.SQUARE.is(k.subtract(1)));
  }
}
