package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A399798 Primes p such that nextprime(2^tau(p - 2)) == 1 (mod (p-1)), where tau = A000005.
 * @author Sean A. Irvine
 */
public class A399798 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.NEXT_PRIME.z(Z.ONE.shiftLeft(Functions.SIGMA0.l(p.subtract(2)))).mod(p.subtract(1)).isOne()) {
        return p;
      }
    }
  }
}

