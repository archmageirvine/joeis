package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400128 allocated for Byron Pickell.
 * @author Sean A. Irvine
 */
public class A400128 extends CachedSequence {

  /** Construct the sequence. */
  public A400128() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n - 1, k -> self.a(k).multiply(self.a(n - k))).add(n % 3 == 0 ? self.a(n / 3) : Z.ZERO);
    });
  }
}

