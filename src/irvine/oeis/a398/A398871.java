package irvine.oeis.a398;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.a003.A003024;
import irvine.oeis.memory.MemorySequence;

/**
 * A398871 Total number of nodes with in-degree 1 in all acyclic digraphs on n labeled nodes.
 * @author Gregory Morse
 */
public class A398871 extends CachedSequence {
  private final MemorySequence mDags = MemorySequence.cachedSequence(new A003024());

  /** Construct the sequence. */
  public A398871() {
    super(0);
  }

  @Override
  protected Z compute(final Z n) {
    final int m = n.intValueExact();
    Z sum = Z.ZERO;
    for (int k = 1; k < m; ++k) {
      final int r = m - k;
      final Z term = mDags.a(r - 1).multiply((long) k * r).shiftLeft(r - 1).add(a(r));
      sum = sum.signedAdd((k & 1) == 1, Binomial.binomial(m, k).multiply(term).shiftLeft((long) k * (r - 1)));
    }
    return sum;
  }
}
