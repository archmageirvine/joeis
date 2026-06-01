package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396392 a(n) = r(n,n), where r(1,k)=f(k)=round(k*c), r(n,k)=f(r(n-1,k)), c=golden ratio.
 * @author Sean A. Irvine
 */
public class A396392 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return CR.PHI.multiply(n).round();
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
