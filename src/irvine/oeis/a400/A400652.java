package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400652 a(0) = 1; a(n) = a(n-1)*a(floor(n/2)) + n for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A400652 extends CachedSequence {

  /** Construct the sequence. */
  public A400652() {
    super(0, Long.class, (self, n) -> n == 0 ? Z.ONE : self.a(n - 1).multiply(self.a(n / 2)).add(n));
  }
}
