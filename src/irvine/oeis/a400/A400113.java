package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400113 a(1) = 1; for n &gt; 1: if a(n-1) is odd, a(n) = a(n-1) + n else a(n) = floor(abs(a(n-1) - n)/2).
 * @author Sean A. Irvine
 */
public class A400113 extends CachedSequence {

  /** Construct the sequence. */
  public A400113() {
    super(1, Long.class, (self, n) -> {
      if (n <= 1) {
        return Z.ONE;
      }
      final Z a = self.a(n - 1);
      if (a.isOdd()) {
        return a.add(n);
      } else {
        return a.subtract(n).abs().divide2();
      }
    });
  }
}

