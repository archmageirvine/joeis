package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396622 a(n) = r(n,n), where r(1,k)=f(k)=floor(k*c), r(n,k)=f(r(n-1,k)), c=sqrt(3).
 * @author Sean A. Irvine
 */
public class A396622 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private long mN = 0;

  private Z f(final Z n) {
    return SQRT3.multiply(n).floor();
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
