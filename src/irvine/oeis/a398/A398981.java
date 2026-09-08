package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398981 a(n) is the number k such that 2*(k*n+v) = Sum_{d|n} (k*d+v), where k and v are coprime and not both are 0.
 * @author Sean A. Irvine
 */
public class A398981 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Functions.SIGMA0.z(++mN).subtract(2);
    return s.divide(Functions.GCD.z(s, Z.valueOf(2 * mN).subtract(Functions.SIGMA1.z(mN))));
  }
}
