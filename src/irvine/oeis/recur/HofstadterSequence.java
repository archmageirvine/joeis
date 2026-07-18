package irvine.oeis.recur;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * Compute relatives of the Hofstadter Q-sequence (A005185: a(1) = a(2) = 1; a(n) = a(n-a(n-1)) + a(n-a(n-2)) for n > 2).
 * The user must provide a method <code>compute(int n)</code> that contains the defining expression of nested calls a(a(a(___))).
 * @author Georg Fischer
 */
public abstract class HofstadterSequence extends AbstractSequence implements DirectSequence {

  private int mN;
  private ArrayList<Integer> mA;
  private int mInitLen;
  private int mLimit; // set all terms below and including this index to zero

  /** Construct the sequence. */
  public HofstadterSequence() {
    this(1, 1, 1);
  }

  /**
   * Generic constructor with parameter.
   * @param offset first index
   * @param mask bit 0: yield sequence (0) or count (1), bit 1: yield odd (1) or even (0) count, bit 2: add a(n-1) (1) or not (0)
   */
  public HofstadterSequence(final int offset, final int... inits) {
    super(offset);
    mN = 0;
    mLimit = -1; // standard for most sequences: a(n) = 0 if n < 0
    mA = new ArrayList<>();
    while (mN < offset) {
      mA.add(0);
      ++mN;
    }
    --mN; // now mN = offset - 1
    for (int i = 0; i < inits.length; ++i) {
      mA.add(inits[i]);
    }
    mInitLen = mA.size();
  }

  /**
   * Compute the new a(n).
   * @param n parameter
   * @return an int
   */
  protected abstract int compute(final int n);

  /**
   * Return an element of the sequence as Z.
   * @param n parameter
   * @return mA.get(n)
   */
  public Z a(final Z n) {
    return Z.valueOf(a(n.intValueExact()));
  }

  /**
   * Return an element of the sequence as Z.
   * @param n parameter
   * @return mA.get(n)
   */
  public Z a(final long n) {
    return Z.valueOf(a(Long.valueOf(n).intValue()));
  }

  /**
   * Return an element of the sequence as int.
   * @param n parameter
   * @return mA.get(n)
   */
  public int a(final int n) {
    if (mLimit > 0 && n <= 0) {
      return n <= -mLimit ? 0 : mLimit + n;
    }
    if (n < mInitLen) {
      return mA.get(n);
    }
    int aLen = mA.size();
    while (n >= aLen) {
      mA.add(compute(aLen++));
    }
    // now n < mA.size() 
    return mA.get(Long.valueOf(n).intValue());
  }

  /**
   * Set a non-standard, negated limit.
   * This implements the rule a(n) = max(0, n + lim) for n &lt;= 0, ...
   * @param lim new negated limit
   */
  protected void setLimit(final int lim) {
    mLimit = lim;
  }

  @Override
  public Z next() {
    return Z.valueOf(a(++mN));
  }
}
