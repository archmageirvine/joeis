package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401733 Number of factorizations of n into factors that have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A401733 extends Sequence1 {

  private long mN = 0;

  private long count(final long n, final long min, final Z signature) {
    long total = 0;

    // Use n itself as the final factor
    final Z sig = Functions.SIGMA0.z(n);
    if (n >= min && (signature == null || signature.equals(sig))) {
      ++total;
    }

    // Try all possible smaller factors
    for (long d = min; d * d <= n; ++d) {
      if (n % d == 0) {
        final Z dsig = Functions.SIGMA0.z(d);
        if (signature == null || signature.equals(dsig)) {
          total += count(n / d, d, dsig);
        }
      }
    }
    return total;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.valueOf(count(mN, 2, null));
  }
}
