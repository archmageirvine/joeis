package irvine.oeis.a398;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a134.A134808;

/**
 * A398378 Cyclops Smith numbers.
 * @author Sean A. Irvine
 */
public class A398378 extends FilterSequence {

  /** Construct the sequence. */
  public A398378() {
    super(1, new A134808().skip(), Predicates.SMITH::is);
  }
}
