package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398630 Lexicographically earliest sequence such that no four terms at symmetrically-spaced indices are equal.
 * @author Sean A. Irvine
 */
public class A398630 extends CachedSequence {

  /** Construct the sequence. */
  public A398630() {
    super(1, Long.class, (self, n) -> {
      long m = 0;
      while (true) {
        ++m;
        boolean ok = true;
        for (long d1 = 1; 2 * d1 < n; ++d1) {
          final long p1 = n - d1;
          if (self.a(p1).equals(m)) {
            for (long d2 = 1; 2 * d1 + d2 < n; ++d2) {
              final long p2 = p1 - d2;
              if (self.a(p2).equals(m)) {
                final long p3 = p2 - d1;
                if (self.a(p3).equals(m)) {
                  ok = false;
                }
              }
            }
          }
        }
        if (ok) {
          return Z.valueOf(m);
        }
      }
    });
  }
}

