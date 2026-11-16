package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a007.A007530;

/**
 * A401787 a(n) is the number of prime quadruplets (q, q+2, q+6, q+8) with q strictly between p+8 and 2*(p+8), where p = A007530(n).
 * @author Sean A. Irvine
 */
public class A401787 extends A007530 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z lim = p.multiply2().add(16);
    long cnt = 0;
    for (Z q = mPrime.nextPrime(p.add(8)); q.compareTo(lim) < 0; q = mPrime.nextPrime(q)) {
      if (mPrime.isPrime(q.add(8)) && mPrime.isPrime(q.add(6)) && mPrime.isPrime(q.add(2))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
