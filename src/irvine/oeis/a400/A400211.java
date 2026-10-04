package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400211 a(n) = x^3 - m*(m+1)*x, where m = floor(sqrt(n)) and x = n - m*(m+1).
 * @author Sean A. Irvine
 */
public class A400211 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long m = Functions.SQRT.l(++mN);
    final Z x = Z.valueOf(mN - m * (m + 1));
    return x.pow(3).subtract(x.multiply(m * (m + 1)));
  }
}
