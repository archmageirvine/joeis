package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397105 a(n) = 3^(n-1)*(Fibonacci(n+2) - 1).
 * @author Sean A. Irvine
 */
public class A397105 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Z.THREE.pow(mN - 1).multiply(Functions.FIBONACCI.z(mN + 2).subtract(1));
  }
}
