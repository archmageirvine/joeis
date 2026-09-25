package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397683 a(n) = f(2*n-1) where f(1)=1 and otherwise f(m) is the number of x, 1 &lt;= x &lt; m, such that gcd(x,m) = gcd(x+1,m) = 1 and ord_m(x) = ord_m(x+1).
 * @author Sean A. Irvine
 */
public class A397683 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1 && Functions.GCD.l(k + 1, mN) == 1 && Functions.ORDER.l(mN, k) == Functions.ORDER.l(mN, k + 1)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

