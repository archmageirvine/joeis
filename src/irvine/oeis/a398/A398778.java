
package irvine.oeis.a398;

import irvine.math.z.Integers;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a006.A006455;

/**
 * A398778 allocated for Alejandro H. Morales.
 * @author Sean A. Irvine
 */
public class A398778 extends CachedSequence {

  private static final DirectSequence A006455 = DirectSequence.create(new A006455());

  /** Construct the sequence. */
  public A398778() {
    super(0, Long.class, (self, n) -> A006455.a(n).subtract(Integers.SINGLETON.sum(1, n - 1, k -> A006455.a(k).multiply(self.a(n - k)))));
  }
}
