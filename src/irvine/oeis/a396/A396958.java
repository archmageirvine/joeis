package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence0;

/**
 * A396958 a(n) = n - Omega(|Re((5 + 2*i)^n)|) - Omega(|Im((5 + 2*i)^n)|), where Omega is A001222.
 * @author Sean A. Irvine
 */
public class A396958 extends Sequence0 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi C = new Zi(Z.FIVE, Z.TWO);
  private Zi mA = Zi.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = G.multiply(mA, C);
    return Z.valueOf(++mN - Functions.BIG_OMEGA.l(mA.re().abs()) - Functions.BIG_OMEGA.l(mA.im().abs()));
  }
}
