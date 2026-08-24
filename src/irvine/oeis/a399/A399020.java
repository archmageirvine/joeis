package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a070.A070826;

/**
 * A399020 Primes p such that (p#/2)^2 - 2 is prime, where p# is the primorial of p.
 * @author Sean A. Irvine
 */
public class A399020 extends A070826 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().square().subtract(2).isProbablePrime()) {
        return Z.valueOf(mP);
      }
    }
  }
}
