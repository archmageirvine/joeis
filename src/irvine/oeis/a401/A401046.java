package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a104.A104010;

/**
 * A401046 allocated for Peer Stelldinger.
 * @author Sean A. Irvine
 */
public class A401046 extends FilterSequence {

  /** Construct the sequence. */
  public A401046() {
    super(1, new A104010(), Predicates.SQUARE::is);
  }
}
