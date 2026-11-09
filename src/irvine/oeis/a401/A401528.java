package irvine.oeis.a401;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a382.A382286;

/**
 * A401528 Numbers k such that A382286(k) is a square.
 * @author Sean A. Irvine
 */
public class A401528 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401528() {
    super(1, 1, new A382286(), SQUARE);
  }
}
