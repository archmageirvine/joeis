package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396955 a(n) = n - Omega(|Re((2 + i)^n)|) - Omega(|Im((2 + i)^n)|), where Omega is A001222.
 * @author Sean A. Irvine
 */
public class A396955 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;
  private Z mU = Z.TWO;
  private Z mV = Z.ONE;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).subtract(Functions.BIG_OMEGA.l(mU.abs())).subtract(Functions.BIG_OMEGA.l(mV.abs()));
    final Z b = mU.multiply2().subtract(mV);
    mV = mU.add(mV.multiply2());
    mU = b;
    return t;
  }
}
