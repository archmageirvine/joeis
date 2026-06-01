package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a008.A008726;

/**
 * A396179 Positive integers not in A008726.
 * @author Sean A. Irvine
 */
public class A396179 extends ComplementSequence {

  /** Construct the sequence. */
  public A396179() {
    super(1, Z.ONE, new A008726());
  }
}
