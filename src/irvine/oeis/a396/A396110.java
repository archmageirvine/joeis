package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A396110 Number of digraphs on n labeled nodes such that every node is reachable from node 1.
 * @author Sean A. Irvine
 */
public class A396110 extends CachedSequence {

  /** Construct the sequence. */
  public A396110() {
    super(1, Long.class, (self, n) -> Z.ONE.shiftLeft(n * (n - 1)).subtract(Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n - 1, k - 1).multiply(self.a(k)).shiftLeft((n - k) * (n - 1)))));
  }
}
