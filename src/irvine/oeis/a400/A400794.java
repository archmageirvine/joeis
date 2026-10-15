package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;

/**
 * A400794 Positions of primorials in A400792.
 * @author Sean A. Irvine
 */
public class A400794 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A400794() {
    super(1, 0, new A400792(), Predicates.PRIMORIAL::is);
  }
}

