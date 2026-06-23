package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397186 Array read by ascending antidiagonals: A(n,k) = ((k + 1)^prime(n) - k^prime(n) - 1)/prime(n).
 * @author Sean A. Irvine
 */
public class A397186 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    final long p = Functions.PRIME.l(n);
    return Z.valueOf(k + 1).pow(p).subtract(Z.valueOf(k).pow(p)).subtract(1).divide(p);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM + 1, mM + 1);
  }
}
