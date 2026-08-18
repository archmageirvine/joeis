package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000010;
import irvine.oeis.a008.A008472;

/**
 * A396113 allocated for Sajid Khan Hussain.
 * @author Sean A. Irvine
 */
public class A396113 extends Combiner {

  /** Construct the sequence. */
  public A396113() {
    super(1, new A008472(), new A000010(), MULTIPLY);
  }
}
