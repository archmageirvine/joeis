package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396394 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A396394 extends Sequence1 {

  private static final CR C = CR.PHI.square();
  private long mN = 0;

  private Z f(final Z n) {
    return C.multiply(n).ceil();
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
