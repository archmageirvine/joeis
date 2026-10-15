package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400875 Array read by ascending antidiagonals: A(n,k) = numerator((n^2 - 2*n*k - k^2)/(n^2 + k^2)), with k &gt; 0.
 * @author Sean A. Irvine
 */
public class A400875 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Q t(final long n, final long m) {
    return new Q(n * n - 2 * n * m - m * m, n * n + m * m);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(t(mN - mM + 1, mM + 1));
  }
}

