package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398226 Increasing greedy sequence starting with a(1) = 1 whose equally spaced triples are coprime.
 * @author Sean A. Irvine
 */
public class A398226 extends CachedSequence {

  /** Construct the sequence. */
  public A398226() {
    super(1, Long.class, (self, n) -> {
      if (n <= 5) {
        return Z.valueOf(n);
      }
      Z k = self.a(n - 1);
      while (true) {
        k = k.add(1);
        boolean ok = true;
        for (long d = 1; 2 * d < n; ++d) {
          if (!Functions.GCD.z(k, self.a(n - d), self.a(n - 2 * d)).isOne()) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return k;
        }
      }
    });
  }
}
