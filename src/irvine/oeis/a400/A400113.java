package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400113 allocated for Vincenzo Manto.
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

