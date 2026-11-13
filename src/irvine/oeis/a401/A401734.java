package irvine.oeis.a401;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401734 Number of factorizations of n into factors that have the same prime signature.
 * @author Sean A. Irvine
 */
public class A401734 extends Sequence1 {

  private long mN = 0;

  /**
   * Count multiplicative partitions whose parts all have the same prime signature.
   * @param n remaining product
   * @param min smallest permitted next factor
   * @param signature required prime signature, or null
   * @return number of completions
   */
  private long count(final long n, final long min, final Z signature) {
    long total = 0;

    // Use n itself as the final factor
    final Z sig = FactorUtils.leastPrimeSignature(Z.valueOf(n));
    if (n >= min && (signature == null || signature.equals(sig))) {
      ++total;
    }

    // Try all possible smaller factors
    for (long d = min; d * d <= n; ++d) {
      if (n % d == 0) {
        final Z dsig = FactorUtils.leastPrimeSignature(Z.valueOf(d));
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
