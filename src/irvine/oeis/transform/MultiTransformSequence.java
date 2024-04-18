package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A sequence comprising the transform of zero, one or more other sequences.
 * This program is similar to {@link SimpleTransformSequence}, but the terms
 * of the target sequence and of several underlying sequences can be used
 * in the lambda expression.
 * <p />
 * Any initial terms are prepended first. If there is a recurrence, or
 * if a source sequence has a higher offset than the target sequence,
 * a sufficient number of initial terms must be specified.
 * The offsets are handled automatically, that means the indexes n of all involved
 * sequences are aligned.
 * @author Georg Fischer
 */
public class MultiTransformSequence extends AbstractSequence {

  @FunctionalInterface
  public interface MultiFunction<MultiTransformSequence, Integer, Z> {
    /**
     * Apply the function.
     * @param self reference to enclosing class
     * @param n current index
     * @return value of <code>a(n)</code>
     */
    Z apply(MultiTransformSequence self, Integer n);
  }

  private final MultiFunction<MultiTransformSequence, Integer, Z> mLambda; // maps (self, n) to next term
  private final AbstractSequence[] mSeqs; // underlying source sequences 
  private final int mOffset; // offset of target sequence
  private final int[] mOffsets; // offsets of mSeqs
  private final int mSeqNo; // number of underlying sequences s(i) + 1
  private final Z[] mTerms; // terms of of the source sequences
  private final ArrayList<Z> mA; // existing target sequence elements: a(n-1), a(n-k) etc.
  private final Z[] mInits; // initial terms
  private final int mInitNo; // mInits.length
  private int mIn; // index for mInits
  private int mN; // current index of target sequence a(n)
  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  /** seq1 + seq2 */
  public static final MultiFunction<MultiTransformSequence, Integer, Z> ADD = (self, n) -> self.s(0).add(self.s(1));
  /** seq1 - seq2 */
  public static final MultiFunction<MultiTransformSequence, Integer, Z> SUB = (self, n) -> self.s(0).subtract(self.s(1));

  /**
   * An indicator that instead of the current term of a sequence <code>s[i]</code>,
   * the previous terms of the sequence <code>s[i-1]</code> should be used.
   * A sufficient number of initial terms must be specified.
   * THis class cannot handle negative offsets.
   */
  public static final AbstractSequence PREVIOUS = null;

  /**
   * Creates a target sequence from an expression of source sequences.
   * @param offset offset of the new sequence
   * @param lambda function mapping (self, n) to the terms of the target sequence
   * @param initTerms initial terms for a(n)
   * @param seqs list underlying source sequences seq0, seq1, seq2 and so on
   *
   * A typical pattern for the call is:
   * <code>super(1, (self, n) -> f(n, self.s(0), self.s(1), self.s(2)), "1", new A999990(), new A999991(), new A999992())</code>
   * The terms of the source sequences in the lambda expression are accessed by self.s(1), self.s(2) and so on.
   * <p />
   * If there are some initial terms for a(n), they are exhausted first, resulting in a target offset n.
   * When a source sequence has an offset &gt; n, an appropriate number of initial target terms must be specified.
   * When a source sequence has an offset &lt; n, an appropriate number of the source sequence&apos;s terms are consumed,
   * and possibly filled into the <code>PREVIOUS</code> elements (c.f. below).
   * <p />
   * In order to avoid duplicate instances of the same sequence, there is the mnemonic
   * <code>PREVIOUS</code> (internally = <code>null</code>) which plays a special role in the list of source sequences.
   * <code>PREVIOUS</code> indicates that not <code>Axxxxxx(n)</code>, but <code>Axxxxxx(n-1)</code> should be taken,
   * where <code>Axxxxxx</code> is the source sequence before <code>PREVIOUS</code>.
   * A second <code>PREVIOUS</code> would access <code>Axxxxxx(n-2)</code> and so on.
   * In order to access <code>Axxxxxx(n+1), Axxxxxx(n)</code> one can use <code>new Axxxxxx.skip(), new Axxxxxx()</code>.
   * In this case <code>PREVIOUS</code> cannot retrieve the skipped term, and the sequence must be duplicated.
   * <p />
   * Existing target terms can be accessed with <code>self.a(n-1), self.a(n-2), self.a(n-k)</code> and so on,
   * thus allowing recurrences and memorized terms.
   */
  public MultiTransformSequence(final int offset, final MultiFunction<MultiTransformSequence, Integer, Z> lambda,
                                final String initTerms, final AbstractSequence... seqs) {
    super(offset);
    mOffset = offset;
    mA = new ArrayList<>();
    mN = -1;
    while (mN < mOffset - 1) {
      ++mN;
      mA.add(Z.ZERO); // adjust a(n)
    }
    // now mN = mOffset - 1
    mLambda = lambda;
    mSeqNo = seqs.length;
    mSeqs = new AbstractSequence[mSeqNo];
    mOffsets = new int[mSeqNo];
    mTerms = new Z[mSeqNo];
    for (int ix = 0; ix < mSeqNo; ++ix) {
      final AbstractSequence seq = seqs[ix];
      mSeqs[ix] = seq;
      if (seq != PREVIOUS) {
        mOffsets[ix] = seq.getOffset();
      }
      mTerms[ix] = Z.ZERO;
    }
    mIn = -1;
    mInits = (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Z[0] : ZUtils.toZ(initTerms);
    mInitNo = mInits.length;
    int ix = 0;
    while (ix < mSeqNo) {
      ix = alignSourceSequence(ix, mOffset + mInitNo);
    }
  }

  /**
   * Constructor without source sequences.
   * @param offset offset of the new sequence
   * @param lambda function mapping (self, n) to the terms of the target sequence
   * @param initTerms initial terms for a(n)
   */
  public MultiTransformSequence(final int offset, final MultiFunction<MultiTransformSequence, Integer, Z> lambda,
                                final String initTerms) {
    this(offset, lambda, initTerms, new AbstractSequence[]{});
  }

  /**
   * Retrieve and existing target sequence element.
   * @param n index of target sequence
   * @return a(n)
   */
  public Z a(final int n) {
//  if (VERBOSE) {
//    System.out.println("# a(" + n + ") -> " + mA.get(n));
//  }
    return mA.get(n);
  }

  /**
   * Retrieve a source sequence element.
   * @param ix number of source sequence
   * @return <code>seqs[ix].a(n)</code>
   */
  public Z s(final int ix) {
//  if (VERBOSE) {
//    System.out.println("# s(" + ix + ") -> " + mTerms[ix]);
//  }
    return mTerms[ix];
  }

  /**
   * Align a source sequence mSeqs[ix] (that is call <code>mSeqs[ix].next()</code>)
   * until <code>mTerms[ix]</code> contains mSeqs[].a(n), and shift into the <code>PREVIOUS</code>
   * terms appropriately.
   * @param ix number of the source sequence
   * @param targetN desired index
   * @return next index (behind any <code>PREVIOUS</code> elements)
   */
  private int alignSourceSequence(final int ix, final int targetN) {
    final int lo = ix;
    int hi = ix + 1;
    while (hi < mSeqNo && mSeqs[hi] == PREVIOUS) {
      ++hi;
    }
    int soff = mOffsets[ix];
    while (soff <= targetN) {
      for (int i = hi - 1; i > lo; --i) {
        mTerms[i] = mTerms[i - 1];
      }
      mTerms[lo] = mSeqs[ix].next();
      ++soff;
    }
//  if (VERBOSE) {
//    System.out.println("# alignSourceSequence(" + ix + ", " + targetN 
//        + ") -> lo=" + lo + ", hi=" + hi 
//        + ", mOffsets[" + ix + "]=" + mOffsets[ix]
//        + ", mTerms[" + ix   + "]=" +   mTerms[ix]);
//  }
    return hi;
  }

  @Override
  public Z next() {
    ++mN;
    ++mIn;
    Z result = null;
    if (mIn < mInitNo) {
      result = mInits[mIn];
    } else {
      result = mLambda.apply(this, mN);
//    if (VERBOSE) {
//      System.out.println("# next() -> mN=" + mN + ", result=" + result);
//    }
      for (int ix = mSeqNo - 1; ix >= 0; --ix) { // shift into previous source elements
        if (mSeqs[ix] == PREVIOUS) {
          mTerms[ix] = mTerms[ix - 1];
        } else {
          mTerms[ix] = mSeqs[ix].next();
        }
      }
    }
    mA.add(result); // memorize
    return result;
  }
}
