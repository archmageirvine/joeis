package irvine.oeis.transform;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the transform of a tuple of other sequences.
 * This program is similar to {@link TupleTransformSequence}, but the terms
 * of several underlying sequence can be used in the lambda expression:
 * @author Georg Fischer
 */
public class TupleTransformSequence extends AbstractSequence {

  private final BiFunction<Integer, Z[], Z> mLambda; // (n, s) -> f(n, s[0], s[1] ...)
  private final Sequence[] mSeqs; // underlying source sequences s[0], s[1] ..
  private final int mSeqNo; // number of underlying sequences s[i]
  private final Z[] mTerms; // terms of s[i]
  private final Z[] mInits; // initial terms
  private final int mInitNo; // mInits.length
  private int mIn; // index for mInits
  private int mN; // current index of target sequence a(n)

  /** Pairing function <code>(t, u) -&gt; ((t + u)^2 + 2 - t - 3*u) / 2</code>. */
  // u.add(v).square().add(2).subtract(u).subtract(v.multiply(3)).divide2();
  public static final BiFunction<Integer, Z[], Z> PAIR = (n, s) -> s[0].add(s[1]).square().add(2).subtract(s[0]).subtract(s[1].multiply(3)).divide2();
  /** The same like PAIR, but with t and u exchanged */
  public static final BiFunction<Integer, Z[], Z> PAIREX = (n, s) -> s[1].add(s[0]).square().add(2).subtract(s[1]).subtract(s[0].multiply(3)).divide2();
  /** Increment: terms + 1 */
  public static final BiFunction<Integer, Z[], Z> INC = (n, s) -> s[0].add(s[1]);
  /** Decrement: terms - 1 */
  public static final BiFunction<Integer, Z[], Z> DEC = (n, s) -> s[0].subtract(s[1]);
  /** Double: terms * 2 */
  public static final BiFunction<Integer, Z[], Z> DOUBLE = (n, s) -> s[0].add(s[1]);
  /** Halve: terms / 2 */
  public static final BiFunction<Integer, Z[], Z> HALVE = (n, s) -> s[0].subtract(s[1]);

  /*
   * An indicator that instead of the current term of a sequence <code>s[i]</code>,
   * the previous terms of the sequence <code>s[i-1]</code> should be used.
   * The
   * At the beginning of the list (when <code>s[0] == s[1] == ... s[i] = PREVIOUS</code>), use <code>a(n - i - 1)</code>.
   * In that case, a suffient number of inital terms must be specified.
   */
  public static final Sequence PREVIOUS = null;

  /**
   * Creates a simple transform of an existing sequence.
   * @param offset offset of new sequence
   * @param lambda function mapping (n,v) to the term of the target sequence
   * @param initTerms initial terms for a(n)
   * @param seqs underlying source sequences v0, v1, v2 and so on
   * A typical pattern for the call is:
   * <code>super(1, (n, s) -> f(n, s[0], s[1], s[2]), "1", new A999990(), new A999991(), new A999992())</code>
   * The terms of the underlying sequences are accessed by s[0], s[1] and so on.
   * If there are some initial terms for a(n), the s[i] are NOT evaluated for the corresponding indexes of a(n),
   * and the s[i] must be skipped accordingly.
   * In general, the indexes n of a(n) and of s[i](n) must be aligned carefully.
   * If the sequence list starts with <code>k</code> indicators<code>PREVIOUS</code>
   * (that means there is a recurrence <code>a(n) = f(a(n-1), a(n-2), a(n-k))</code>), <code>k</code> initial terms must be specified,
   * and the <code>s[i]</code> should be brought (skipped) to index <code>n + k</code>.
   * Furthermore, any <code>s[i]</code> that is followed by m indicators<code>PREVIOUS</code> will internally be advanced by <code>m</code> terms
   * such that the sequences called <code>s[i], s[i + 1], s[i + m]</code> deliver the terms<code>s[i](n + m - 1), s[i](n + m), s[i](n)</code>.
   */
  public TupleTransformSequence(final int offset, final BiFunction<Integer, Z[], Z> lambda, final String initTerms, final Sequence... seqs) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
    mSeqs = seqs;
    mSeqNo = mSeqs.length;
    mTerms = new Z[mSeqNo];
    mIn = -1;
    mInits = (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Z[0] : ZUtils.toZ(initTerms);
    mInitNo = mInits.length;
    int iseq = 0;
    while (iseq < mSeqNo && mSeqs[iseq] == PREVIOUS) { // there is a recurrence a(n) = f(a(n-1), ...)
      mTerms[mInitNo - 1 - iseq] = mInits[iseq]; // fill with initial terms (backwards)
      ++iseq;
    }
    Sequence multiSeq = null; // a sequence with multiple indexes n, n+1, n+2 ...
    while (iseq < mSeqNo) { // there are some underlying sequences
      if (mSeqs[iseq] != PREVIOUS) {
        multiSeq = mSeqs[iseq++];
      } else {
        int jseq = iseq + 1;
        while (jseq < mSeqNo && mSeqs[jseq] == PREVIOUS) {
          ++jseq;
        }
        final int isave = jseq; // now jseq -> first non-PREVIOUS behind iseq, or behind the list
        while (--jseq >= iseq) {
          mTerms[jseq] = multiSeq.next(); // fill with s[i](n), s[i](n+1) etc.
        }
        iseq = isave;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    ++mIn;
    if (mIn < mInitNo) {
      return mInits[mIn];
    }
    for (int iseq = 0; iseq < mSeqNo; ++iseq) {
      if (mSeqs[iseq] != PREVIOUS) {
        mTerms[iseq] = mSeqs[iseq].next();
      }
    }
    final Z result = mLambda.apply(mN, mTerms);
    // now shift the terms involved in recurrences and the PREVIOUS terms
    int iseq = 0;
    Z curr = result;
    while (iseq < mSeqNo) {
      if (mSeqs[iseq] == PREVIOUS) {
        Z prev = mTerms[iseq];
        mTerms[iseq] = curr;
        curr = prev;
      } else {
        curr = mTerms[iseq];
      }
      ++iseq;
    }
    return result;
  }
}
