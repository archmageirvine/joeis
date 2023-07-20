package irvine.oeis.closure;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * Multiplicative closure of an increasing sequence.
 * @author Sean A. Irvine
 */
public class MultiplicativeClosureSequence extends MemorySequence {

  private final MemorySequence mSeq;
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mTerm;

  /**
   * Construct the multiplicative closure of another sequence.
   * @param seq underlying sequence
   */
  public MultiplicativeClosureSequence(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
    mTerm = mSeq.next();
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    if (mTerm != null && (mA.isEmpty() || mA.first().compareTo(mTerm) >= 0)) {
      for (final Z t : this) {
        mA.add(t.multiply(mTerm));
      }
      mTerm = mSeq.next();
    }
    final Z res = mA.pollFirst();
    for (final Z t : mSeq) {
      if (t == null) {
        break;
      }
      if (!Z.ONE.equals(res)) {
        mA.add(res.multiply(t));
      }
    }
    return res;
  }
}
