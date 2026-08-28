package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a029.A029908;

/**
 * A397678 allocated for Haotong Wang.
 * @author Sean A. Irvine
 */
public class A397678 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A397678() {
    super(1, new A029908(), Z.FIVE::equals);
  }
}

