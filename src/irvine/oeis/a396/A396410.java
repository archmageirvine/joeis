package irvine.oeis.a396;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a002.A002182;
import irvine.oeis.a033.A033833;

/**
 * A396410 Numbers that are both highly factorable numbers (A033833) and highly composite numbers (A002182).
 * @author Sean A. Irvine
 */
public class A396410 extends IntersectionSequence {

  /** Construct the sequence. */
  public A396410() {
    super(1, new A002182(), new A033833());
  }
}
