package irvine.oeis.a398;

import irvine.oeis.FilterSequence;

/**
 * A398569 allocated for Charles Kusniec.
 * @author Sean A. Irvine
 */
public class A398569 extends FilterSequence {

  /** Construct the sequence. */
  public A398569() {
    super(1, new A398316(), ODD);
  }
}
