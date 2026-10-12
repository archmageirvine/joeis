package irvine.oeis.a398;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002133;

/**
 * A398920 allocated for David Bevan.
 * @author Sean A. Irvine
 */
public class A398920 extends PartialSumSequence {

  /** Construct the sequence. */
  public A398920() {
    super(1, new A002133());
  }
}

