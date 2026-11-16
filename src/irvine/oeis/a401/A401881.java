package irvine.oeis.a401;

import irvine.oeis.InverseSequence;

/**
 * A401881 a(n) is the least number k such that there are exactly n numbers j, 1 &lt;= j &lt;= k/2, such that the product of digits of k is the sum of the product of digits of j and the product of digits of k-j, or -1 if there is no such k.
 * @author Sean A. Irvine
 */
public class A401881 extends InverseSequence {

  /** Construct the sequence. */
  public A401881() {
    super(0, 0, new A401862(), 1);
  }
}
