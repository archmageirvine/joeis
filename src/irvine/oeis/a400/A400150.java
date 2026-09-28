package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400150 a(n) = |2*a(n-1) - a(n-2) - 2|, with a(0) = 0 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A400150 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long k = (Functions.SQRT.l(4 * ++mN + 1) - 1) / 2;
    return Z.valueOf(mN - k * (k + 1)).multiply(2 * k + 2 - mN + k * (k + 1));
  }
}

