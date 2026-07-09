package irvine.oeis.a397;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003277;

/**
 * A397387 Sophie Germain cyclic numbers: numbers k such that k and 2*k+1 are both cyclic numbers (A003277).
 * @author Sean A. Irvine
 */
public class A397387 extends FilterSequence {

  /** Construct the sequence. */
  public A397387() {
    super(1, new A003277(), k -> Predicates.CYCLIC.is(k.multiply2().add(1)));
  }
}
