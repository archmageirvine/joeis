package irvine.oeis.a402;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a173.A173106;

/**
 * A402266 Indices m for which the sum of the first m deficient numbers A173106(m) is itself deficient.
 * @author Sean A. Irvine
 */
public class A402266 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A402266() {
    super(1, 1, new A173106(), Predicates.DEFICIENT::is);
  }
}
