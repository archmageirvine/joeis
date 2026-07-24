package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397569 a(1) = 1; for n &gt;= 2, a(n) is the smallest number whose Hamming distance from a(n-1) is Fibonacci(n)).
 * @author Sean A. Irvine
 */
public class A397569 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.xor(Z.ONE.shiftLeft(Functions.FIBONACCI.l(mN)).subtract(1));
    }
    return mA;
  }
}
