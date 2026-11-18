package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a396.A396578;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.Triangle;

/**
 * A399479 Triangular array read by rows. T(n,k) is the number of labeled acyclic digraphs on [n] that have exactly k isolated points, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A399479 extends Triangle {
  private final MemorySequence mDags = MemorySequence.cachedSequence(new A396578());

  @Override
  protected Z compute(final int n, final int k) {
    return Binomial.binomial(n, k).multiply(mDags.a(n - k));
  }
}
