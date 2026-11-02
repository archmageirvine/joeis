package irvine.oeis.a400;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a033.A033950;

/**
 * A400864 allocated for Maxwell C. P. Brown.
 * @author Sean A. Irvine
 */
public class A400864 extends IntersectionSequence {

  /** Construct the sequence. */
  public A400864() {
    super(new A400859(), new A033950());
  }
}
