package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A401648
 * @author Sean A. Irvine
 */
public class A401553 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401553() {
    super(1, new A401552(), Z.TWO::equals);
  }
}
