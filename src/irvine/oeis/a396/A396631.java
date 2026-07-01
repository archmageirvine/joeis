package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A396631 allocated for Andrea Cutri.
 * @author Sean A. Irvine
 */
public class A396631 extends AbstractSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private int mN = 5;
  private final Series<Q> mF = new AbstractInfiniteSeries<>() {
    private Series<Q> mS = SQ.one();
    private int mK = 0;

    @Override
    public Q coeff(final long n) {
      while (n >= mK) {
        ++mK;
        mS = SQ.multiply(mS, SQ.divide(SQ.one(), SQ.oneMinusXToTheN(new Q(1, Functions.FACTORIAL.z(mK)), mK)));
      }
      return mS.coeff(n);
    }
  };
  private final MemoryFunction1<Z> mNl = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n < 1) {
        return null;
      }
      Z s = Z.ZERO;
      for (final Z dd : Jaguar.factor(n).divisors()) {
        final long d = dd.longValue();
        s = s.add(Functions.PHI.z(n / d).multiply(f(d)));
      }
      return s.divide(n);
    }
  };
  private final MemoryFunction1<Z> mR = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int k) {
      if (k < 1) {
        return null;
      }
      final Z v;
      if ((k & 1) == 1) {
        final int m = (k - 1) / 2;
        v = Integers.SINGLETON.sum(0, m, j -> Functions.BINOMIAL.z(m, j).multiply(f(j)));
      } else {
        final int h = k / 2;
        final Z t = Integers.SINGLETON.sum(0, h - 1, j -> Functions.BINOMIAL.z(h - 1, j).multiply(f(h - 1 - j)).multiply(Z.ONE.shiftLeft(j).add((j & 1) == 0 ? Functions.BINOMIAL.z(j, j / 2) : Z.ZERO)));
        v = f(h).add(t.divide2());
      }
      return v;
    }
  };


  /** Construct the sequence. */
  public A396631() {
    super(6);
  }

  private Z f(final long n) {
    return mF.coeff(n).multiply(Functions.FACTORIAL.z(n)).toZ();
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z ee : Jaguar.factor(mN).divisors()) {
      final int e = ee.intValue();
      if (e != mN) {
        Z t = Z.ZERO;
        for (final Z dd : Jaguar.factor(e).divisors()) {
          final int d = dd.intValue();
          t = t.add(Functions.MOBIUS.z(e / d).multiply(mNl.get(d).subtract(mR.get(d))));
        }
        sum = sum.add(t);
      }
    }
    return sum.divide2();
  }
}
