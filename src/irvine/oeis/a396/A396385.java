package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396385 a(n) = r(n,n), where r(1,k)=f(k)=floor(k*c), r(n,k)=f(r(n-1,k)), c=3/2.
 * @author Sean A. Irvine
 */
public class A396385 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return n.multiply(3).divide2();
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
