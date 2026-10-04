package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A400372 Expansion of Product_{k&gt;=0} (1 + Sum_{j&gt;=0} x^(3^(k+j))).
 * @author Sean A. Irvine
 */
public class A400372 extends GfSequence {

  private static Series<Q> inner(final long k) {
    return new AbstractInfiniteSeries<>() {
      @Override
      public Q coeff(long n) {
        if (n == 0) {
          return Q.ONE;
        }
        long j = 0;
        while (n % 3 == 0) {
          n /= 3;
          ++j;
        }
        return n == 1 && j >= k ? Q.ONE : Q.ZERO;
      }
    };
  }

  /** Construct the sequence. */
  public A400372() {
    super(0, new AbstractInfiniteSeries<>() {
      private Series<Q> mS = SQ.one();
      private long mK = 0;
      private long mL = 1;

      @Override
      public Q coeff(final long n) {
        while (n >= mL) {
          mS = SQ.multiply(mS, inner(mK));
          ++mK;
          mL *= 3;
        }
        return mS.coeff(n);
      }
    });
  }
}

