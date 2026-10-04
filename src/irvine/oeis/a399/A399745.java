package irvine.oeis.a399;

import irvine.oeis.FilterPositionSequence;

/**
 * A399745 Numbers k such that the k-th Lucas number cannot be represented as a signed sum of entries from row k of Pascal's triangle, with each position used at most once.
 * @author Sean A. Irvine
 */
public class A399745 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A399745() {
    super(0, new A399744(), ZERO);
  }
}
