package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397854 Smallest positive integer that is a primitive root modulo p but not modulo p^2, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A397854 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 1;
    while (!(Functions.GCD.l(k, p) == 1 && Functions.ORDER.z(p, k).equals(p.subtract(1)) && Z.valueOf(k).modPow(p.subtract(1), p.square()).isOne())) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
