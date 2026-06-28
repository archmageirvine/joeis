package irvine.oeis.a397;

import irvine.oeis.FilterSequence;

/**
 * A397050 Prime numbers in A397046.
 * @author Sean A. Irvine
 */
public class A397050 extends FilterSequence {

  /** Construct the sequence. */
  public A397050() {
    super(1, new A397046(), PRIME);
  }
}
