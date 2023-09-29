package irvine.oeis.transform;

import java.util.function.BiFunction;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the simple transform of another sequence.
 * Example include negating terms, taking the absolute values, adding a
 * constant, multiplying by a constant, squaring terms etc.
 * @author Sean A. Irvine
 */
public class SimpleTransformSequence extends AbstractSequence {

  private int mN;
  private final Sequence mSeq;
  private final Function<Z, Z> mLambda;
  private final BiFunction<Integer, Z, Z> mLambda2;

  /**
   * Creates a simple transform of an existing sequence.
   * @param offset offset of new sequence
   * @param seq underlying sequence
   * @param lambda function converting a specific value to its new value
   */
  public SimpleTransformSequence(final int offset, final Sequence seq, final Function<Z, Z> lambda) {
    super(offset);
    mSeq = seq;
    mLambda = lambda;
    mLambda2 = null;
  }

  /**
   * Creates a simple transform of an existing sequence.
   * @param seq underlying sequence
   * @param lambda function converting a specific value to its new value
   */
  public SimpleTransformSequence(final Sequence seq, final Function<Z, Z> lambda) {
    this(seq.getOffset(), seq, lambda);
  }

  /**
   * Creates a simple transform of an existing sequence.
   * @param offset offset of new sequence
   * @param seq underlying sequence
   * @param lambda2 function converting a specific value to its new value
   */
  public SimpleTransformSequence(final int offset, final Sequence seq, final BiFunction<Integer, Z, Z> lambda2) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mLambda = null;
    mLambda2 = lambda2;
  }

  /**
   * Creates a simple transform of an existing sequence.
   * @param seq underlying sequence
   * @param lambda2 function converting a specific value to its new value
   */
  public SimpleTransformSequence(final Sequence seq, final BiFunction<Integer, Z, Z> lambda2) {
    this(seq.getOffset(), seq, lambda2);
  }

  @Override
  public Z next() {
    if (mLambda != null) {
      final Z t = mSeq.next();
      return t == null ? null : mLambda.apply(t);
    } else {
      assert mLambda2 != null;
      ++mN;
      final Z t = mSeq.next();
      return t == null ? null : mLambda2.apply(mN, t);
    }
  }
}
