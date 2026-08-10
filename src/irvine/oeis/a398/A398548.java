package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398548 allocated for Shixuan Gao.
 * @author Sean A. Irvine
 */
public class A398548 extends CachedSequence {

  // todo sequence definition does not make sense

  /** Construct the sequence. */
  public A398548() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ZERO;
      }
      Z max = Z.ZERO;
      for (long m = n; m < 2 * n; ++m) {
        Z min = Z.valueOf(m);
        for (final Z p : Jaguar.factor(m).toZArray()) {
          final Z t = self.a(m / p.longValue());
          min = min.min(t);
        }
        max = max.max(min);
      }
      return max;
    });
  }
}


// a(n) = Max{Min{a(m/p) | p is a prime factor of m} | n<=m<2n} with a(1)=0.
