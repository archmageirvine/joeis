package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400346 a(0) = 1; a(2*n) = a(2*n-2) + a(n), a(2*n+1) = Sum_{j=0..n} a(j) * a(n-j).
 * @author Sean A. Irvine
 */
public class A400346 extends CachedSequence {

  /** Construct the sequence. */
  public A400346() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      if ((n & 1) == 0) {
        return self.a(n / 2).add(self.a(n - 2));
      }
      return Integers.SINGLETON.sum(0, n / 2, j -> self.a(j).multiply(self.a(n / 2 - j)));
    });
  }
}
