package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008479;

/**
 * A398804 Numbers k such that A008479(k) = 4.
 * @author Sean A. Irvine
 */
public class A398804 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A398804() {
    super(1, new A008479(), Z.FOUR::equals);
  }
}
