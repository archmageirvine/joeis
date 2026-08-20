package irvine.oeis.a398;

import irvine.oeis.FilterSequence;

/**
 * A398787 allocated for Charles Kusniec.
 * @author Sean A. Irvine
 */
public class A398787 extends FilterSequence {

  /** Construct the sequence. */
  public A398787() {
    super(1, new A398316(), EVEN);
  }
}
