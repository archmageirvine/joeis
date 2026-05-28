package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000196;
import irvine.oeis.a048.A048656;

/**
 * A396253 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A396253 extends Combiner {

  /** Construct the sequence. */
  public A396253() {
    super(1, new A000196().skip(), new A048656(), MULTIPLY);
  }
}
