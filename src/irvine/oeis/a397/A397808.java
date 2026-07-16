package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397808 allocated for David Castellon.
 * @author Sean A. Irvine
 */
public class A397808 extends CachedSequence {

  /** Construct the sequence. */
  public A397808() {
    super(1, Long.class, (self, n) -> n == 1 ? Z.ZERO : (n & 1) == 0 ? self.a(n / 2).multiply2().add(1) : self.a(3 * n + 1).multiply2());
  }
}
