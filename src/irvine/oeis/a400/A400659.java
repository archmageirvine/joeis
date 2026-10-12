package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A400659 Smallest exponent k &gt;= 1 such that (product of the first n-1 primes) * prime(n)^k - 1 is prime; or -1 is no such prime exists.
 * @author Sean A. Irvine
 */
public class A400659 extends A000040 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    mProd = mProd.multiply(mP);
    super.next(); // updates mP
    long k = 0;
    Z t = mProd;
    while (true) {
      ++k;
      t = t.multiply(mP);
      if (t.subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
