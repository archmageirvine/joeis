package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396424 a(n) = r(n,n), where r(1,k)=f(k)=ceiling(k*c), r(n,k)=f(r(n-1,k)), c=5/3.
 * @author Sean A. Irvine
 */
public class A396424 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return n.multiply(5).add(2).divide(3);
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
