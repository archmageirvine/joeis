package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397121.
 * @author Sean A. Irvine
 */
public class A399846 extends CachedSequence {

  /** Construct the sequence. */
  public A399846() {
    super(0, Long.class, (self, n) -> n <= 1 ? Z.valueOf(n) : (n & 1) == 0 ? self.a(n / 2) : Z.ONE.subtract(self.a(n / 2 - self.a(n / 2 - 1).longValue())));
  }
}

