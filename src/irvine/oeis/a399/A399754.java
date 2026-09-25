package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a210.A210666;

/**
 * A399754 Near-repdigit Smith numbers.
 * @author Sean A. Irvine
 */
public class A399754 extends FilterSequence {

  /** Construct the sequence. */
  public A399754() {
    super(1, new A210666(), Predicates.SMITH::is);
  }
}
