package irvine.oeis.a397;

import irvine.oeis.FilterSequence;

/**
 * A397932 Numbers k that are neither squarefree nor powerful such that rad(k)*omega(k) = k, where rad = A007947 and omega = A001221.
 * @author Sean A. Irvine
 */
public class A397932 extends FilterSequence {

  /** Construct the sequence. */
  public A397932() {
    super(1, new A397221(), COMPOSITE);
  }
}
