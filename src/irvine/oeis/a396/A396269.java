package irvine.oeis.a396;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a390.A390949;

/**
 * A396269 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A396269 extends FilterSequence {

  /** Construct the sequence. */
  public A396269() {
    super(1, new A390949(), Predicates.CUBE_FREE::is);
  }
}
