package irvine.oeis.recur;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.function.Predicate;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A sequence where the next elements depends on the existence of values in the previous elements of the sequence.
 * Any initial terms are prepended first.
 * @author Georg Fischer
 */
public class MexSequence extends AbstractSequence implements DirectSequence {

  @FunctionalInterface
  public interface MexFunction<MexSequence, Long, Z> {
    /**
     * Apply the function.
     * @param self reference to enclosing class
     * @param n current index
     * @return value of <code>a(n)</code>
     */
    Z apply(MexSequence self, Long n);
  }

  private final MexFunction<MexSequence, Long, Z> mLambda; // maps (self, n) to next term
  private final ArrayList<Z> mA; // the existing target sequence elements: a(n-1), a(n-k) etc.
  private Z mMex; // the first non-existing element
  private final TreeSet<Z> mSparse; // the existing target sequence elements that are not members of the contiguous block below <code>mMex</code>
  private final Z[] mInits; // initial terms
  private final int mInitNo; // number of initial terms: mInits.length
  private int mIn; // index for mInits
  private long mN; // current index of target sequence a(n)

  /**
   * Creates the sequence from a condition for the new, smallest element not yet in the sequence.
   * @param offset offset of the new sequence
   * @param lambda function mapping (self, n) to the terms of the target sequence
   * @param initTerms initial terms for a(n)
   * If there are some initial terms for a(n), they are exhausted first, resulting in a target offset n.
   * Existing target terms can be accessed with <code>self.a(n-1), self.a(n-2), self.a(n-k)</code> and so on.
   */
  public MexSequence(final int offset, final MexFunction<MexSequence, Long, Z> lambda, final String initTerms) {
    super(offset);
    mLambda = lambda;
    mInits = (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Z[0] : ZUtils.toZ(initTerms);
    mA = new ArrayList<>();
    mSparse = new TreeSet<>();
    mN = -1;
    while (mN < offset - 1) {
      ++mN;
      mA.add(Z.ZERO); // adjust a(n)
    }
    // now mN = offset - 1
    mMex = Z.valueOf(mN + 1);
    mInitNo = mInits.length;
    for (int ix = 0; ix < mInitNo; ++ix) {
      add(mInits[ix]);
    }
    mIn = 0;
  }

  /**
   * Add an element to the target sequence, and maintain the contract for <code>mMex</code> and <code>mSparse</code>.
   * The minimal non-existing term <code>mMex<code> is always 1 greater than the lower contiguous block of existing target terms,
   * and <code>mSparse</code> only contains the existing elements that are greater than <code>mMex</code>.
   * @param x element to be added
   */
  private void add(final Z x) {
    mA.add(x);
    final int cmp = x.compareTo(mMex);
    if (cmp > 0) { // in the sparse range, no need to adjust mMex
      mSparse.add(x);
    } else if (cmp == 0) { // x === mMex
      mMex = mMex.add(1);
      while (!mSparse.isEmpty() && mSparse.first().equals(mMex)) { // try to increase mMex by elements from the head of mSparse
        mMex = mMex.add(1);
        mSparse.pollFirst();
      }
    } // else x < mMex: ignore
    //* System.out.print("# add: mN=" + mN + ", x=" + x + ", mMex=" + mMex + ", mSparse=");
    //* for (Z s : mSparse) {
    //*   System.out.print(s + " ");
    //* }
    //* System.out.print(", mA=");
    //* for (int i = 0; i < mA.size(); ++i) {
    //*   System.out.print(mA.get(i) + " ");
    //* }
    //* System.out.println();
  }

  /**
   * Unconditionally retrieve the minimal excluded element.
   * @return the minimal element that does not yet exist in the sequence
   */
  public Z mex() {
    //* System.out.println("# mex0: mN=" + mN + ", mMex=" + mMex);
    return mMex;
  }

  /**
   * Retrieve the minimal excluded element that fulfills a condition.
   * @param predicate condition for the element
   * @return the minimal element that does not yet exist in the sequence and that has the property <code>predicate</code>
   */
  public Z mex(final Predicate<Z> predicate) {
    Z candidate = mMex;
    while (true) {
      if (contains(candidate) || !predicate.test(candidate)) {
        candidate = candidate.add(1);
      } else {
        return candidate;
      }
    }
  }

 /**
   * Unconditionally retrieve the k-th minimal excluded element.
   * @param k apply the <code>mex()</code> operation so many times
   * @return the k-th (first, second, third) minimal element that does not yet exist in the sequence
   */
  public Z mex(final int k) {
    return mex(k, v -> true);
  }

  /**
   * Retrieve the minimal excluded element that fulfills a condition.
   * @param k apply the <code>mex()</code> operation so many times
   * @param predicate condition for the element
   * @return the k-th (first, second, third) minimal element that does not yet exist in the sequence and that has the property <code>predicate</code>
   */
  public Z mex(int k, final Predicate<Z> predicate) {
    Z candidate = mMex;
    while (true) {
      if (!contains(candidate) && predicate.test(candidate)) {
        if (--k <= 0) {
          return candidate;
        }
      }
      candidate = candidate.add(1);
    }
  }

  /**
   * Test whether an element is already in the sequence.
   * @return true if the element is <code>&lt; mMex</code> or element of <code>mSparse</code>
   */
  public boolean contains(final Z v) {
    return v.compareTo(mMex) < 0 || mSparse.contains(v);
  }

  /**
   * Retrieve an existing target sequence element.
   * @param n index of target sequence
   * @return a(n)
   */
  public Z a(final long n) {
    return mA.get((int) n);
  }

  /**
   * Retrieve an existing target sequence element.
   * @param n index of target sequence
   * @return a(n)
   */
  public Z a(final Z n) {
    return mA.get(n.intValueExact());
  }

  /**
   * Retrieve the last element of the existing sequence
   * @return <code>a(n - 1)</code>.
   */
  public Z previous() {
    return mA.get(mA.size() - 1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result;
    if (mIn < mInitNo) {
      result = mInits[mIn++];
    } else {
      result = mLambda.apply(this, mN);
      add(result); // memorize and maintain contract for mMex, mSparse
    }
    //* System.out.println("# next: mN=" + mN + ", result=" + result + ", mSparse.first()=" + (mSparse.isEmpty() ? "{}" : mSparse.first().toString()) + ", mIn=" + mIn);
    return result;
  }
}
