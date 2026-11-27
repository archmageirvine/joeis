package irvine.oeis.a402;

import irvine.oeis.a401.A401012;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A402278 Continued fraction of the constant A401012 = 1 - Sum_{n&gt;=1} 2^(-floor(n*log_2(3))).
 * @author Sean A. Irvine
 */
public class A402278 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A402278() {
    super(0, new A401012());
  }
}
