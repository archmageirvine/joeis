package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A401774 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401774() {
    super(1, new A401802(), Z.NEG_ONE::equals);
  }
}
