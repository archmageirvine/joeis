package irvine.oeis.a401;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401743 Triangle read by rows: for n&gt;0 and 0&lt;=k&lt;=n, T(n,k) is the number of circular (n+k)-bit strings with k 1's that, when circularly shifted by 2 bits, do not have any coincident 1's when placed over the original bit string.
 * @author Sean A. Irvine
 */
public class A401743 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction1<Polynomial<Z>> mLucas = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return Polynomial.create(2);
      }
      if (n == 1) {
        return Polynomial.create(1);
      }
      return RING.add(get(n - 1), get(n - 2).shift(1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final long p = Functions.GCD.l(mN + mM, 2);
    return RING.pow(mLucas.get((mN + mM) / p), p, mM).coeff(mM);
  }
}
