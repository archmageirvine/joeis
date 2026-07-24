package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397263 a(n) = min {nextprime(n^2)-n^2, (n+1)^2-prevprime((n+1)^2)}: distance of the primes in the interval [n^2, (n+1)^2] from its border.
 * @author Sean A. Irvine
 */
public class A397263 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z n2 = Z.valueOf(mN).square();
    return n2.subtract(Functions.PREV_PRIME.z(n2)).min(Functions.NEXT_PRIME.z(n2).subtract(n2));
  }
}
