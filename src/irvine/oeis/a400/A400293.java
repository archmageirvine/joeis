package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400293 Least prime p such that there are n-1 smaller primes for which the reciprocals 1/p have the same period length in base 10.
 * @author Sean A. Irvine
 */
public class A400293 extends A400291 {

  @Override
  public Z next() {
    step();
    return mRow.get(mRow.size() - 1);
  }
}

