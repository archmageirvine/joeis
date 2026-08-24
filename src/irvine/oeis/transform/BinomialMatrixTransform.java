package irvine.oeis.transform;

import java.util.function.LongFunction;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Peter Luschny's binomial matrix transform.
 * @author Sean A. Irvine
 */
public class BinomialMatrixTransform extends AbstractSequence {

  private final LongFunction<Z> mLambda;
  private long mN = 0;
  private long mM = -1;

  protected Z t(final long n, final long k) {
    if (n < 0 || k < 0) {
      throw new IllegalArgumentException();
    }
    final long d = Math.abs(n - k);
    final long p = Math.min(n, k);
    final boolean positive = k <= n;

    Z sum = Z.ZERO;
    for (long m = 0; m <= d; ++m) {
      Z term = Binomial.binomial(d, m).multiply(mLambda.apply(p + m));
      if (!positive && ((d - m) & 1) != 0) {
        term = term.negate();
      }
      sum = sum.add(term);
    }
    return sum;
  }

  protected BinomialMatrixTransform(final int offset, final LongFunction<Z> lambda) {
    super(offset);
    mLambda = lambda;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
