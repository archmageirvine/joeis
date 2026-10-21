package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401042 allocated for Jan Snellman.
 * @author Sean A. Irvine
 */
public class A401042 extends Sequence2 {

  // After Jan Snellman, cf. A401040

  private long mN = 2;
  private long mM = -1;

  private long phi(final long k, final long n) {
    long cnt = 0;
    final long q = Functions.PRIME.l(k);
    for (long m = 1; m <= n; ++m) {
      boolean ok = true;
      for (long p = 2; p <= q; p = Functions.NEXT_PRIME.l(p)) {
        if (m % p == 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        ++cnt;
      }
    }
    return cnt;
  }

  private Z t(final long n, final long i) {
    if (i == 0) {
      return Z.ONE;
    }
    final long r = Functions.PRIME_PI.l(n);
    return Integers.SINGLETON.sum(1, r, k -> Binomial.binomial(r - k, i - 1).multiply(phi(k, n)));
  }

  @Override
  public Z next() {
    if (++mM > Functions.PRIME_PI.l(mN)) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
