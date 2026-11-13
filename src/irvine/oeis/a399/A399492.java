
package irvine.oeis.a399;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399492 a(0) = 0, a(1) = 1; for n &gt;= 2, a(n) = a(n-1) + 1 + c(n), where c(n) is the number of pairs 0 &lt;= i &lt; j &lt; n with a(j) - a(i) = a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A399492 extends CachedSequence {

  private final HashMap<Long, Long> mDiffCounts = new HashMap<>();

  /** Construct the sequence. */
  public A399492() {
    super(0);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n <= 1) {
      if (n == 0) {
        return Z.ZERO;
      }
      mDiffCounts.put(1L, 1L);
      return Z.ONE;
    }
    final Z a1 = a(n - 1);
    final Z a2 = a(n - 2);
    final Z a = a1.add(1).add(mDiffCounts.get(a1.subtract(a2).longValueExact()));
    for (long k = 0; k < n; ++k) {
      mDiffCounts.merge(a.subtract(a(k)).longValueExact(), 1L, Long::sum);
    }
    return a;
  }
}
