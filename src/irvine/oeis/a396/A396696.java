package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396696 a(n) is the smallest prime greater than n^2*a(n-1), with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A396696 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = Functions.NEXT_PRIME.z(mA.multiply(mN * mN));
    }
    return mA;
  }
}
