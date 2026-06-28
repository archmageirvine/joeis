package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397046 Numbers k with digital sum not divisible by any smaller term of the sequence, with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A397046 extends CachedSequence {

  /** Construct the sequence. */
  public A397046() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.TWO;
      }
      long k = self.a(n - 1).longValueExact();
      outer:
      while (true) {
        final long ds = Functions.DIGIT_SUM.l(++k);
        for (long j = 1; j < n; ++j) {
          if (ds % self.a(j).longValue() == 0) {
            continue outer;
          }
        }
        return Z.valueOf(k);
      }
    });
  }
}
