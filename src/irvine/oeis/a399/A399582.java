package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A399582 Numbers k not divisible by 3 such that at least one of 3+2k and 3+4k is composite.
 * @author Sean A. Irvine
 */
public class A399582 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399582() {
    super(1, k -> k % 3 != 0 && (!Predicates.PRIME.is(2 * k + 3) || !Predicates.PRIME.is(4 * k + 3)));
  }
}
