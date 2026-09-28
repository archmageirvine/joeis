package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400128 Number of recursively defined forms of weight n, where a form is either a unit, an ordered fusion of two forms, or a propagation of one form whose weight is tripled.
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

