package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400958 a(n) = Sum_{i=1..10^n} Moebius(i)*Moebius(i+1), where Moebius(n) = A008683(n).
 * @author Sean A. Irvine
 */
public class A400958 extends Sequence0 {

  private long mSum = 0;
  private long mN = 1;
  private long mLim = 1;

  @Override
  public Z next() {
    while (mN <= mLim) {
      mSum += (long) Functions.MOBIUS.i(mN) * Functions.MOBIUS.i(++mN);
    }
    mLim *= 10;
    return Z.valueOf(mSum);
  }
}

