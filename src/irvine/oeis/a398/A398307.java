package irvine.oeis.a398;

import irvine.oeis.FilterPositionSequence;

/**
 * A398307 Indices of zero terms in the Van Eck-like sequence A398259 whose lookup key is the decimal digit sum of the previous term.
 * @author Sean A. Irvine
 */
public class A398307 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A398307() {
    super(1, new A398259(), ZERO);
  }
}
