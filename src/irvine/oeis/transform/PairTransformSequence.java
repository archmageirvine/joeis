package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Pair;

/**
 * A sequence that combines two underlying sequences u and v by using a lambda expression
 * <code>(n, u, v) -&gt; f(n, u, v)</code>.
 * The default is to use the pairing function <code>(u, v) -&gt; ((u + v)^2 + 2 - u - 3*v) / 2</code>.
 * In addition, there is a method <em>nextPair()</em> that returns the next pair
 * <code>(u(n), v(n))</code> of terms from the underlying sequences.
 * Example: A285729 Compound filter: a(n) = T(A032742(n), A046523(n)), where T(n,k) is sequence A000027 used as a pairing function.
 * a(n) = (1/2)*(2 + ((A032742(n)+A046523(n))^2) - A032742(n) - 3*A046523(n)).
 * @author Georg Fischer
 */
public class PairTransformSequence extends AbstractSequence {

  @FunctionalInterface
  public interface TriFunction<Integer, Z> {
    public Z apply(Integer n, Z u, Z v);
  }

  private int mN;
  private AbstractSequence mSeqU;
  private AbstractSequence mSeqV;
  protected TriFunction<Integer, Z> mLambda;
  private long[] mInitTerms; // initial terms
  private int mInitLen; // number of initial terms
  private int mIn; // index for initial terms

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seqU first underlying sequence
   * @param seqV second underlying sequence
   */
  public PairTransformSequence(final int offset, final AbstractSequence seqU, final AbstractSequence seqV) {
    super(offset);
    mLambda = (n, u, v) -> u.add(v).square().add(2).subtract(u).subtract(v.multiply(3)).divide2();
    mN = offset - 1;
    mSeqU = seqU;
    mSeqV = seqV;
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seqU first underlying sequence
   * @param seqV second underlying sequence
   * @param lambda expression for the triple (n, u(n), v(n)
   */
  public PairTransformSequence(final int offset, final AbstractSequence seqU, final AbstractSequence seqV,
                               final TriFunction<Integer, Z> lambda) {
    this(offset, seqU, seqV, lambda, new long[0]);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seqU first underlying sequence
   * @param seqV second underlying sequence
   * @param lambda expression for the triple (n, u(n), v(n)
   */
  public PairTransformSequence(final int offset, final AbstractSequence seqU, final AbstractSequence seqV,
                               final TriFunction<Integer, Z> lambda, final long... initTerms) {
    super(offset);
    mInitTerms = initTerms;
    mInitLen = mInitTerms.length;
    mIn = -1;
    mLambda = lambda;
    mN = offset - 1;
    mSeqU = seqU;
    mSeqV = seqV;
  }

  /**
   * Return the next pair of terms from the underlying sequences
   * @return [u(n), v(n)]
   */
  public Pair<Z, Z> nextPair() {
    return new Pair<Z, Z>(mSeqU.next(), mSeqV.next());
  }

  @Override
  public Z next() {
    ++mN;
    ++mIn;
    if (mIn < mInitLen) {
      return Z.valueOf(mInitTerms[mIn]);
    }
    final Pair<Z, Z> p = nextPair();
    return mLambda.apply(mN, p.left(), p.right());
  }
}
