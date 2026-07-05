package irvine.oeis.a397;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397462 allocated for Thomas Scheuerle.
 * @author Sean A. Irvine
 */
public class A397462 extends CachedSequence {

  protected final Map<Z, Long> mCounts = new HashMap<>();

  /** Construct the sequence. */
  public A397462() {
    super(0);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n == 0) {
      mCounts.put(Z.ZERO, 1L);
      return Z.ZERO;
    }
    final Z v = a(n - 1);
    final long res = mCounts.get(v);
    for (long k = 0; k < n; ++k) {
      mCounts.merge(a(k).multiply(res), 2L, Long::sum);
    }
    mCounts.merge(Z.valueOf(res).square(), 1L, Long::sum);
    return Z.valueOf(res);
  }
}
