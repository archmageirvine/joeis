package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400652 allocated for Timjan Jay.
 * @author Sean A. Irvine
 */
public class A400652 extends CachedSequence {

  /** Construct the sequence. */
  public A400652() {
    super(0, Long.class, (self, n) -> n == 0 ? Z.ONE : self.a(n - 1).multiply(self.a(n / 2)).add(n));
  }
}
