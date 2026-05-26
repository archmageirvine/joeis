package irvine.oeis.a396;

import irvine.math.MemoryFunction1;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396159 Numerators in the asymptotic expansion of Gamma(1 + 2*x)/(Gamma(1 + x)*Gamma(2 + x)) = (4^x/sqrt(Pi))*Sum_{k&gt;=0} (1/x)^(3/2+k)*a(k)/A061549(k).
 * @author Sean A. Irvine
 */
public class A396159 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private final MemoryFunction1<Q> mS = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      if (n == 0) {
        return Q.ONE;
      }
      return Rationals.SINGLETON.sum(1, n, k -> mB.get(k + 1).divide(k + 1).multiply(new Q(1, Z.ONE.shiftLeft(k)).subtract(2)).add(Z.NEG_ONE.pow(k)).multiply(get(n - k))).divide(n);
    }
  };
  private int mN = -1;

  @Override
  public Z next() {
    return mS.get(++mN).num();
  }
}
