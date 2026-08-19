package irvine.oeis.a396;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A396951 allocated for Hamza Gul Hassan.
 * @author Sean A. Irvine
 */
public class A396951 extends CachedSequence {

  /** Construct the sequence. */
  public A396951() {
    super(0, Long.class, (self, n) -> {
      final Set<Long> seen = new HashSet<>();
      if ((n & 3) == 1) {
        for (long k = 1; k * k <= n; ++k) {
          seen.add(self.a(n - k * k).longValueExact());
        }
      } else {
        if (3 <= n) {
          seen.add(self.a(n - 3).longValueExact());
        }
        if (8 <= n) {
          seen.add(self.a(n - 8).longValueExact());
        }
        if (9 <= n) {
          seen.add(self.a(n - 9).longValueExact());
        }
      }
      return Z.valueOf(LongUtils.mex(seen));
    });
  }
}
