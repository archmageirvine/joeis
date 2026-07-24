package irvine.oeis.a396;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a394.A394904;

/**
 * A396779 Numbers k such that there are no pairs (x,y) whose product is k with x + y or |x - y| a square.
 * @author Sean A. Irvine
 */
public class A396779 extends ComplementSequence {

  /** Construct the sequence. */
  public A396779() {
    super(1, new A394904());
  }
}
