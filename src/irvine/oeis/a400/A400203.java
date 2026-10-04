package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400203 Triangle read by rows: T(n,d) = Sum_{x=1..floor(n/d), gcd(x,d)=1} mu(x) where mu(x) is the M\u00f6bius function.
 * @author Sean A. Irvine
 */
public class A400203 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    long sum = 0;
    for (long k = 1; k <= mN / mM; ++k) {
      if (Functions.GCD.l(k, mM) == 1) {
        sum += Functions.MOBIUS.i(k);
      }
    }
    return Z.valueOf(sum);
  }
}
