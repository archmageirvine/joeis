package irvine.oeis.transform;

import java.util.List;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.memory.MemorySequence;

/**
 * Apply the Stirling-Bernoulli transform to another sequence.
 * @author Sean A. Irvine
 */
public class StirlingBernoulliTransform extends Sequence0 {

  /**
   * Apply the Stirling-Bernoulli transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @param n term limit
   * @return the next term in the transformed sequence
   */
  public static Z transform(final List<Z> seq, final int n) {
    Z sum = Z.ZERO;
    Z fk = Z.ONE;
    for (int k = 0; k <= n; ++k) {
      if (k > 1) {
        fk = fk.multiply(k);
      }
      sum = sum.signedAdd((k & 1) == 0, fk.multiply(Stirling.secondKind(n + 1, k + 1)).multiply(seq.get(k)));
    }
    return sum;
  }

  /**
   * Apply the Stirling-Bernoulli transform to the given sequence
   * returning the next term of the sequence.
   * @param seq the original sequence
   * @return the next term in the transformed sequence
   */
  public static Z transform(final List<Z> seq) {
    return transform(seq, seq.size() - 1);
  }

  private int mN = -1;
  private final MemorySequence mSeq;

  protected StirlingBernoulliTransform(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z fk = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 1) {
        fk = fk.multiply(k);
      }
      sum = sum.signedAdd((k & 1) == 0, fk.multiply(Stirling.secondKind(mN + 1, k + 1)).multiply(mSeq.a(k)));
    }
    return sum;
  }
}
