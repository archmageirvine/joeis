package irvine.oeis.a397;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397474 a(1) = 0. For n &gt; 1, a(n) is the number of ways to write a(n-1) as the product of two previous terms with distinct positions in the sequence.
 * @author Sean A. Irvine
 */
public class A397474 extends CachedSequence {

  protected final Map<Z, Long> mCounts = new HashMap<>();

  /** Construct the sequence. */
  public A397474() {
    super(0);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n == 0) {
      return Z.ZERO;
    }
    final Z v = a(n - 1);
    final long res = mCounts.getOrDefault(v, 0L);
    for (long k = 0; k < n; ++k) {
      mCounts.merge(a(k).multiply(res), 1L, Long::sum);
    }
    return Z.valueOf(res);
  }
}
