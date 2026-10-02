package irvine.oeis.a396;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a002.A002182;
import irvine.oeis.a033.A033833;

/**
 * A396410 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A396410 extends IntersectionSequence {

  /** Construct the sequence. */
  public A396410() {
    super(1, new A002182(), new A033833());
  }
}
