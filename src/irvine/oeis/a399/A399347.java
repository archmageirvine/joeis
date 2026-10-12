package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399347 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A399347 extends Sequence1 {

  private long mN = 0;

  private long f(final long k) {
    long max = 0;
    for (long i = 1; i <= k; ++i) {
      final long v = Functions.PRIME.l(i) * Functions.PRIME.l(2 * k + 1 - i);
      if (v > max) {
        max = v;
      }
    }
    return max;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (f(k + 1) <= mN) {
      ++k;
    }
    return Functions.PRIME_PI.z(mN).add(1 - k);
  }
}
