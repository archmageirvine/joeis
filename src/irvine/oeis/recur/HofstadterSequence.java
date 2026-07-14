package irvine.oeis.recur;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Compute relatives of the Hofstadter Q-sequence (A005185: a(1) = a(2) = 1; a(n) = a(n-a(n-1)) + a(n-a(n-2)) for n > 2).
 * The user must provide a method <code>compute(int n)</code> that contains the defining expression of nested calls a(a(a(___))).
 * @author Georg Fischer
 */
public abstract class HofstadterSequence extends AbstractSequence {

  private int mN;
  private ArrayList<Integer> mA;
  private int mLen;


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
    mA = new ArrayList<>();
    while (mN < offset) {
      mA.add(0);
      ++mN;
    }
    --mN;
    for (int i = 0; i < inits.length; ++i) {
      mA.add(inits[i]);
    }
    mLen = mA.size();
  }

  /**
   * Compute the new a(n).
   * @param n parameter
   * @return an int
   */
  protected abstract int compute(final int n);

  /**
   * Return an element of the sequence as int.
   * @param n parameter
   * @return mA.get(n)
   */
  protected int a(final int n) {
    return mA.get(n);
  }

  @Override
  public Z next() {
    final int result;
    ++mN;
    if (mN < mLen) {
      result = mA.get(mN);
    } else {
      result = compute(mN);
      mA.add(result);
    }
    return Z.valueOf(result);
  }
}
