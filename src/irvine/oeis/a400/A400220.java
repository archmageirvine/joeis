package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400220 Nondecreasing sequence of positive integers in which each k &gt;= 1 occurs exactly Sum_{d|k} a(d) times.
 * @author Sean A. Irvine
 */
public class A400220 extends CachedSequence {

  /** Construct the sequence. */
  public A400220() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      final Z a = self.a(n - 1);
      Z sum = Z.ZERO;
      for (long d = 1; d <= a.longValueExact(); ++d) {
        sum = sum.add(self.a(d).multiply(a.divide(d)));
      }
      return sum.equals(n - 1) ? a.add(1) : a;
    });
  }
}

