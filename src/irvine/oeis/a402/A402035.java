package irvine.oeis.a402;

import irvine.oeis.DirectSequence;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a006.A006577;

/**
 * A087450.
 * @author Sean A. Irvine
 */
public class A402035 extends FilterNumberSequence {

  private static final DirectSequence A006577 = new A006577();

  /** Construct the sequence. */
  public A402035() {
    super(1, k -> A006577.a(3 * k).equals(A006577.a(k).subtract(1)));
  }
}
