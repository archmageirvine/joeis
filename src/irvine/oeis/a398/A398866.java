package irvine.oeis.a398;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.a003.A003024;
import irvine.oeis.memory.MemorySequence;

/**
 * A398866 Sum of 2^(in-degree of v) over nodes v in all acyclic digraphs on n labeled nodes.
 * @author Gregory Morse
 */
public class A398866 extends CachedSequence {
  private final MemorySequence mDags = MemorySequence.cachedSequence(new A003024());

  /** Construct the sequence. */
  public A398866() {
    super(0);
  }

  @Override
  protected Z compute(final Z n) {
    final int m = n.intValueExact();
    Z sum = Z.ZERO;
    for (int k = 1; k <= m; ++k) {
      final int r = m - k;
      Z term = mDags.a(r).multiply(k).shiftLeft((long) k * r);
      if (r > 0) {
        term = term.add(a(r).multiply(Z.THREE.pow(k)).shiftLeft((long) k * (r - 1)));
      }
      sum = sum.signedAdd((k & 1) == 1, Binomial.binomial(m, k).multiply(term));
    }
    return sum;
  }
}
