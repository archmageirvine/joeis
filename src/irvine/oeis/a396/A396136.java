package irvine.oeis.a396;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;

/**
 * A396136 Number of digraphs on n labeled nodes such that every node is reachable from node 1 and node n is reachable from every node (node 1 = node n when n = 1).
 * @author Sean A. Irvine
 */
public class A396136 extends CachedSequence {

  private static final DirectSequence A = new A396110();
  private static final MemoryFunctionInt2<Z> L = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int m, final int n) {
      return Z.ONE.shiftLeft(n * (n + m - 1L)).subtract(Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n, k).multiply(get(m, k)).shiftLeft((n - k) * (n - 1))));
    }
  };

  /** Construct the sequence. */
  public A396136() {
    super(1, Long.class, (self, n) -> A.a(n).subtract(Integers.SINGLETON.sum(2, n - 1, k -> Binomial.binomial(n - 2, k - 2).multiply(self.a(k)).multiply(L.get(k, n - k)))));
  }
}
