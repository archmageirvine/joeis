package irvine.oeis.a397;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a399.A399633;

/**
 * A397831 Indices of ones in A399633.
 * @author Sean A. Irvine
 */
public class A397831 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A397831() {
    super(1, new A399633(), 1);
  }
}

