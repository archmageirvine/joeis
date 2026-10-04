package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400350 a(0) = a(1) = 1; a(2*n) = Sum_{j=0..n} a(j) * a(n-j), a(2*n+1) = a(2*n-1) + a(n).
 * @author Sean A. Irvine
 */
public class A400350 extends CachedSequence {

  /** Construct the sequence. */
  public A400350() {
    super(0, Long.class, (self, n) -> {
      if (n <= 1) {
        return Z.ONE;
      }
      if ((n & 1) == 1) {
        return self.a(n / 2).add(self.a(n - 2));
      }
      return Integers.SINGLETON.sum(0, n / 2, j -> self.a(j).multiply(self.a(n / 2 - j)));
    });
  }
}

