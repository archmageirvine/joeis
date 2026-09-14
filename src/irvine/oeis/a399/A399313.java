package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008479;

/**
 * A399313 Numbers k = rad(k) * p(k) * q(k) such that A008479(k) = 5, where rad = A007947, p = least prime factor of k, q = second smallest distinct prime factor of k.
 * @author Sean A. Irvine
 */
public class A399313 extends A008479 {

  private long mK = 0;

  private Z second(long k) {
    final long f1 = Functions.LPF.l(k);
    do {
      k /= f1;
    } while (k % f1 == 0);
    return Functions.LPF.z(k);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (super.next().equals(Z.FIVE) && Functions.RAD.z(mK).multiply(Functions.LPF.z(mK)).multiply(second(mK)).equals(mK)) {
        return Z.valueOf(mK);
      }
    }
  }
}
