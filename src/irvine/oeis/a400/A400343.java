package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400343 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A400343 extends CachedSequence {

  /** Construct the sequence. */
  public A400343() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      if ((n & 1) == 1) {
        return self.a(n - 1).multiply2();
      }
      return Integers.SINGLETON.sum(0, n / 2, j -> self.a(j).multiply(self.a(n / 2 - j)));
    });
  }
}
