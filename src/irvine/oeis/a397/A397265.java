package irvine.oeis.a397;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397265 a(n) = r(2,n,1) where r(m,n,k) is the number of possible outcomes in a race with n participants that contains exactly k ties of size at least m.
 * @author Sean A. Irvine
 */
public class A397265 extends Sequence1 {

  private int mN = 0;
  protected final MemoryFunctionInt3<Z> mR = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int m, final int n, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, m - 1, i -> Binomial.binomial(n, i).multiply(get(m, n - i, k)))
        .add(Integers.SINGLETON.sum(m, n, i -> Binomial.binomial(n, i).multiply(get(m, n - i, k - 1))));
    }
  };

  @Override
  public Z next() {
    return mR.get(2, ++mN, 1);
  }
}
