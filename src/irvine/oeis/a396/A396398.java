package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396398 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A396398 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return CR.SQRT2.multiply(n).round();
  }

  private Z r(final long n, final long k) {
    if (n == 1) {
      return f(Z.valueOf(k));
    }
    return f(r(n - 1, k));
  }

  @Override
  public Z next() {
    return r(++mN, mN);
  }
}
