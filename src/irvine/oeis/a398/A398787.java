package irvine.oeis.a398;

import irvine.oeis.FilterSequence;

/**
 * A398787 Even numbers m such that A001221(m) &gt;= 3 and A001222(m) = A001221(m) + 1.
 * @author Sean A. Irvine
 */
public class A398787 extends FilterSequence {

  /** Construct the sequence. */
  public A398787() {
    super(1, new A398316(), EVEN);
  }
}
