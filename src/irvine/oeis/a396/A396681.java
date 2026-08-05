package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396681 Number of iterations for the n-th prime to reach 2 under the function f(p) = smallest odd prime factor of 5*p+1 or 2 if 5*p+1 is a power of 2.
 * @author Sean A. Irvine
 */
public class A396681 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (p.compareTo(Z.TWO) > 0) {
      p = Functions.LPF.z(p.multiply(5).add(1).makeOdd());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
