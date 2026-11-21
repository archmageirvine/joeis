package irvine.oeis.a402;

import irvine.oeis.DirectSequence;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a006.A006577;

/**
 * A402035 Numbers k such that 3*k reaches 1 in exactly one Collatz step fewer than k: A006577(3*k) = A006577(k) - 1.
 * @author Sean A. Irvine
 */
public class A402035 extends FilterNumberSequence {

  private static final DirectSequence A006577 = new A006577();

  /** Construct the sequence. */
  public A402035() {
    super(1, k -> A006577.a(3 * k).equals(A006577.a(k).subtract(1)));
  }
}
