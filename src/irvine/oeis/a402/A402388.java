package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A402388 allocated for Vicenzo P DeMaar.
 * @author Sean A. Irvine
 */
public class A402388 extends CachedSequence {

  /** Construct the sequence. */
  public A402388() {
    super(0, Long.class, (self, n) -> {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return (n & 1) == 1 ? self.a(n / 2).add(self.a(n / 2 - 1)) : self.a(n / 2).add(self.a(n / 2 - 1)).subtract(self.a((n / 2 - 1) / 2));
    });
  }
}

