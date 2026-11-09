package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A401553 Positions of 2's in A401552.
 * @author Sean A. Irvine
 */
public class A401553 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401553() {
    super(1, new A401552(), Z.TWO::equals);
  }
}
