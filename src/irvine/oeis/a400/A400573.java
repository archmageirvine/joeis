package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A400573 Smallest prime p such that lpf(p*R(p)) is the n-th prime, where R(p) is the digit reversal of p.
 * @author Sean A. Irvine
 */
public class A400573 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Functions.LPF.z(Functions.REVERSE.z(p)).compareTo(p) >= 0) {
      return p;
    }
    Z q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      if (Functions.LPF.z(Functions.REVERSE.z(q)).equals(p)) {
        return q;
      }
    }
  }
}
