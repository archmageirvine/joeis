package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence0;

/**
 * A396956 a(n) = n - Omega(|Re((3 + 2*i)^n)|) - Omega(|Im((3 + 2*i)^n)|), where Omega is A001222.
 * @author Sean A. Irvine
 */
public class A396956 extends Sequence0 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi C = new Zi(Z.THREE, Z.TWO);
  private Zi mA = Zi.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = G.multiply(mA, C);
    return Z.valueOf(++mN - Functions.BIG_OMEGA.l(mA.re().abs()) - Functions.BIG_OMEGA.l(mA.im().abs()));
  }
}
