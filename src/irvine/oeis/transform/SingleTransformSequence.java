package irvine.oeis.transform;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A sequence comprising the transform of an other sequence.
 * This program is similar to {@link SimpleTransformSequence}, but with
 * the parameter structure of {@link MultiTransformSequence}.
 * There is no recursion, and the terms of the source and the target sequences
 * are aligned automatically.
 * <p />
 * Any initial terms are prepended first. If the source sequence has a
 * higher offset than the target sequence,
 * a sufficient number of initial terms must be specified.
 * The offsets are handled automatically, that means the indexes n
 * of both sequences are aligned.
 * @author Georg Fischer
 */
public class SingleTransformSequence extends AbstractSequence {

  private final BiFunction<Z, Integer, Z> mLambda;
  private final AbstractSequence mSeq; // underlying source sequences 
  private final Z[] mInits; // initial terms
  private final int mInitNo; // mInits.length
  private int mIn; // index for mInits
  private int mN; // current index of target sequence a(n)

  /**
   * Creates a target sequence from an expression of the source sequence.
   * @param offset offset of the new sequence
   * @param lambda function mapping (term, n) to the terms of the target sequence
   * @param initTerms initial terms for a(n)
   * @param seq underlying source sequence
   * If there are some initial terms for a(n), they are exhausted first, resulting in a target offset n.
   * When the source sequence has an offset &gt; n, an appropriate number of initial target terms must be specified.
   * When the source sequence has an offset &lt; n, an appropriate number of the source sequence&apos;s terms are consumed.
   */
  public SingleTransformSequence(final int offset, final BiFunction<Z, Integer, Z> lambda,
                                 final String initTerms, final AbstractSequence seq) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mLambda = lambda;
    int srcOff = seq.getOffset();
    while (srcOff < offset) { // shift the source offset up to the target offset
      mSeq.next();
      ++srcOff;
    }
    mIn = -1;
    mInits = (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Z[0] : ZUtils.toZ(initTerms);
    mInitNo = mInits.length;
  }

  /**
   * Convenience constructor without initial terms.
   * @param offset offset of the new sequence
   * @param lambda function mapping (self, n) to the terms of the target sequence
   * @param seq underlying source sequence
   */
  public SingleTransformSequence(final int offset, final BiFunction<Z, Integer, Z> lambda,
                                 final AbstractSequence seq) {
    this(offset, lambda, "", seq);
  }

  @Override
  public Z next() {
    ++mN;
    ++mIn;
    final Z result;
    if (mIn < mInitNo) {
      result = mInits[mIn];
      mSeq.next();
    } else {
      final Z term = mSeq.next();
      result = term == null ? null : mLambda.apply(term, mN);
    }
    return result;
  }
}
