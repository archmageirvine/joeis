package irvine.oeis.a401;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401745 allocated for Michael A. Allen.
 * @author Sean A. Irvine
 */
public class A401745 extends Sequence1 {

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
    final long p = Functions.GCD.l(mN + mM, 4);
    return RING.pow(mLucas.get((mN + mM) / p), p, mM).coeff(mM);
  }
}
