package irvine.oeis.a401;

import irvine.oeis.FilterPositionSequence;

/**
 * A401250 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A401250 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401250() {
    super(1, 1, new A401249(), k -> !k.isOne());
  }
}

