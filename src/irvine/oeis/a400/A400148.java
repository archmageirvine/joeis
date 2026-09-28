package irvine.oeis.a400;

import irvine.oeis.DirectSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000142;
import irvine.oeis.a399.A399803;

/**
 * A400148 Smallest prime that is the sum of n distinct elements from the union of powers of 2 and factorials.
 * @author Sean A. Irvine
 */
public class A400148 extends A399803 {

  /** Construct the sequence. */
  public A400148() {
    super(DirectSequence.create(0, new UnionSequence(new A000079(), new A000142())));
  }
}

