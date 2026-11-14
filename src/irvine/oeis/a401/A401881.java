package irvine.oeis.a401;

import irvine.oeis.InverseSequence;

/**
 * A399911.a(n) is the number of k with 1 <= k <= n/2 such that the product of digits of n is the sum of the product of digits of k and the product of digits of n-k.
 * @author Sean A. Irvine
 */
public class A401881 extends InverseSequence {

  /** Construct the sequence. */
  public A401881() {
    super(0, 0, new A401862(), 1);
  }
}
