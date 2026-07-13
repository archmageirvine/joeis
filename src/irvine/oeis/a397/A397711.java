package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397711 allocated for Tyler Satchel Orden.
 * @author Sean A. Irvine
 */
public class A397711 extends Sequence0 {

  // After Tyler Satchel Orden

  private final int mK;
  private int mN = -1;

  protected A397711(final int k) {
    mK = k;
  }

  /** Construct the sequence. */
  public A397711() {
    this(2);
  }

  private Z f(final int p, final int q) {
    return Integers.SINGLETON.sum(1, mK, i -> Binomial.binomial(p + q, i).subtract(Binomial.binomial(q, i)));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }

    final Z[][] h = new Z[mN + 1][mN + 1];
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN; ++j) {
        h[i][j] = Z.ZERO;
      }
    }

    for (int m = 1; m <= mN; ++m) {
      h[m][m] = Binomial.binomial(mN, m);
    }

    for (int u = 1; u < mN; ++u) {
      for (int p = 1; p <= u; ++p) {
        if (h[u][p].isZero()) {
          continue;
        }
        final int q = u - p;
        final Z fpq = f(p, q);
        Z pow = Z.ONE;
        for (int m = 1; m <= mN - u; ++m) {
          pow = pow.multiply(fpq);
          h[u + m][m] = h[u + m][m].add(h[u][p].multiply(Binomial.binomial(mN - u, m)).multiply(pow));
        }
      }
    }

    Z sum = Z.ZERO;
    for (int p = 1; p <= mN; ++p) {
      sum = sum.add(h[mN][p]);
    }
    return sum;
  }
}
