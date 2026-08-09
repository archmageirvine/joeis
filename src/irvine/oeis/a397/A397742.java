package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008479;

/**
 * A397742 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A397742 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A397742() {
    super(1, new A008479(), Z.THREE::equals);
  }
}
