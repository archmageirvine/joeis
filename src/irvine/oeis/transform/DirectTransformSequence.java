package irvine.oeis.transform;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;

/**
 * A sequence which is the transformation of another sequence by a DirectSequence.
 * @author Georg Fischer
 */
public class DirectTransformSequence extends AbstractSequence {

  private final DirectSequence mSeqA; // outer, direct sequence 
  private final Sequence mSeqB; // inner sequence
  private final BiFunction<Integer, Z, Z> mLambda; // optional transformation depending on (n, v)
  private final Z[] mInits; // initial terms if <code>mSeqB</code> starts with a greater offset
  private final int mOffset; // first index of target sequence
  private int mInitLen; // length of <code>mInits</code>
  private int mN; // current index

  /**
   * Constructor without lambda.
   * @param offset index of first term of the resulting sequence
   * @param seqA outer, direct sequence
   * @param seqB inner sequence
   */
  public DirectTransformSequence(final int offset, final DirectSequence seqA, final Sequence seqB) {
    this(offset, seqA, seqB, null);
  }

  /**
   * Constructor with lambda.
   * @param offset index of first term of the resulting sequence
   * @param seqA outer, direct sequence
   * @param seqB inner sequence
   * @param lambda expression for the transformation of the resulting term
   */
  public DirectTransformSequence(final int offset, final DirectSequence seqA, final Sequence seqB, final BiFunction<Integer, Z, Z> lambda) {
    this(offset, seqA, seqB, lambda, new long[] {});
  }

  /**
   * Constructor with lambda.
   * @param offset index of first term of the resulting sequence
   * @param seqA outer, direct sequence
   * @param seqB inner sequence
   * @param lambda expression for the transformation of the resulting term
   * @param inits initial terms of target sequence - must be specified iff <code>offset &gt; seqB.getOffset()</code>
   */
  public DirectTransformSequence(final int offset, final DirectSequence seqA, final Sequence seqB, final BiFunction<Integer, Z, Z> lambda, final long... inits) {
    super(offset);
    mOffset = offset;
    mN = mOffset - 1;
    mSeqA = seqA;
    mSeqB = seqB;
    mLambda = lambda;
    mInitLen = inits.length; // 0 based
    mInits = new Z[mInitLen];
    for (int i = 0; i < mInitLen; ++i) {
        mInits[i] = Z.valueOf(inits[i]);
    }
    mInitLen += mOffset; // now offset based
    int ofb = seqB.getOffset();
    while (ofb < mOffset) {
      seqB.next(); // skip superfluous initial terms of <code>seqB</code>
      ++ofb;
    }
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < mInitLen) {
      return mInits[mN - mOffset];
    }
    return (mLambda == null) ? mSeqA.a(mSeqB.next()) : mLambda.apply(mN, mSeqA.a(mSeqB.next()));
  }
}
