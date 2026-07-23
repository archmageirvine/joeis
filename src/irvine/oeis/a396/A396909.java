package irvine.oeis.a396;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a001.A001318;

/**
 * A396909 allocated for Thotsaphon Thongjunthug.
 * @author Sean A. Irvine
 */
public class A396909 extends TwoParameterFormSequence {

  private static final DirectSequence A001318 = new A001318();

  /** Construct the sequence. */
  public A396909() {
    super(1, 1, 1, (x, y) -> A001318.a(x).add(A001318.a(y)));
  }
}

