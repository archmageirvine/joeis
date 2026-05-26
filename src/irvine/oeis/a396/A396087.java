package irvine.oeis.a396;

import irvine.oeis.a003.A003033;

/**
 * A396087 Smallest integer m such that the product of every 5 consecutive integers &gt; m has a prime factor &gt; prime(n).
 * @author Sean A. Irvine
 */
public class A396087 extends A003033 {

  @Override
  protected int getNumberOfConsecutivePrimes() {
    return 5;
  }
}
