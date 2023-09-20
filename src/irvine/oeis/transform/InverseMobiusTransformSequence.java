package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the inverse Mobius transform of another sequence.
 * @author Sean A. Irvine
 */
public class InverseMobiusTransformSequence extends AbstractSequence {

  private static final int DEFOFF = 1;

  private final Sequence mSeq;
  private final ArrayList<Z> mTerms = new ArrayList<>();
  private final Z mInitialTerm;

  /**
   * Creates a new inverse Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public InverseMobiusTransformSequence(final int offset, final Sequence seq, final int skip, final Z initialTerm) {
    super(offset);
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mInitialTerm = initialTerm;
  }

  /**
   * Creates a new inverse Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   * @param initialTerm initial term to return
   */
  public InverseMobiusTransformSequence(final Sequence seq, final int skip, final Z initialTerm) {
    this(DEFOFF, seq, skip, initialTerm);
  }

  /**
   * Creates a new inverse Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public InverseMobiusTransformSequence(final int offset, final Sequence seq, final int skip) {
    this(offset, seq, skip, Z.ZERO);
  }

  /**
   * Creates a new inverse Mobius transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public InverseMobiusTransformSequence(final Sequence seq, final int skip) {
    this(DEFOFF, seq, skip, Z.ZERO);
  }

  @Override
  public Z next() {
    if (mTerms.isEmpty()) {
      mTerms.add(Z.ZERO);
      return mInitialTerm;
    }
    Z s = Z.ZERO;
    final int n = mTerms.size();
    final Z t = mSeq.next();
    if (t == null) {
      return null;
    }
    mTerms.add(t);
    for (final Z d : Jaguar.factor(n).divisors()) {
      s = s.add(mTerms.get(d.intValue()));
    }
    return s;
  }
}
