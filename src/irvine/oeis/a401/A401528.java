package irvine.oeis.a401;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a382.A382286;

/**
 * A401528 allocated for Hassan Baloui.
 * @author Sean A. Irvine
 */
public class A401528 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401528() {
    super(1, 1, new A382286(), SQUARE);
  }
}
