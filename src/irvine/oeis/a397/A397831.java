package irvine.oeis.a397;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a400.A400000;

/**
 * A397831 Indices of ones in A400000.
 * @author Sean A. Irvine
 */
public class A397831 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A397831() {
    super(1, new A400000(), 1);
  }
}

