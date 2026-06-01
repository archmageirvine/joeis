package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396386 a(n) = r(n,n), where r(1,k)=f(k)=round(k*c), r(n,k)=f(r(n-1,k)), c=3/2, using banker's rounding.
 * @author Sean A. Irvine
 */
public class A396386 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return new Q(n.multiply(3), 2).bankersRound();
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
