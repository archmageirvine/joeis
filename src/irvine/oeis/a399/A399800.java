package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087019. If n > 0 is even, then p^n + 2 is divisible by 3 for all primes p > 3, so a(n) is either 3^n + 2 (if that is prime, i.e. n is in A051783) or -1.
 * @author Sean A. Irvine
 */
public class A399800 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      final Z t = Z.THREE.pow(mN).add(2);
      return t.isProbablePrime() ? t : Z.NEG_ONE;
    }
    Z p = Z.ONE;
    while (true) {
      p = Functions.NEXT_PRIME.z(p);
      final Z t = p.pow(mN).add(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
