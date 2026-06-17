package irvine.oeis.a396;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a173.A173024;

/**
 * A396939 allocated for Chai Wah Wu.
 * @author Sean A. Irvine
 */
public class A396939 extends ComplementSequence {

  /** Construct the sequence. */
  public A396939() {
    super(1, new A173024());
  }
}
