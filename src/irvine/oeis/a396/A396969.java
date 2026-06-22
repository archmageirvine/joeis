package irvine.oeis.a396;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a332.A332785;

/**
 * A396969 Intersection of A332785 and A396324.
 * @author Sean A. Irvine
 */
public class A396969 extends IntersectionSequence {

  /** Construct the sequence. */
  public A396969() {
    super(1, new A332785(), new A396324());
  }
}
