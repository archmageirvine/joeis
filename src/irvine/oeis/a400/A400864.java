package irvine.oeis.a400;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a033.A033950;

/**
 * A400864 Subsequence of A036438 numbers of the form W = k * d(k), where both k and W are refactorable (A033950), and k satisfies d(k/d(k)) = d(d(k)) where d(x) is the divisor count of x.
 * @author Sean A. Irvine
 */
public class A400864 extends IntersectionSequence {

  /** Construct the sequence. */
  public A400864() {
    super(new A400859(), new A033950());
  }
}
