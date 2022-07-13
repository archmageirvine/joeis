package irvine.oeis.recur;

import java.util.ArrayList;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.SequenceWithOffset;

/**
 * A recurrence equation set for <code>a(n)</code> depending on <code>a(f(n)), f(n) &lt; n</code>.
 * The recurrence may be specified by a single, a pair, a triple and so on of lambda expressions
 * for <code>[a(n)], [a(2*n), a(2*n+1)], [a(3*n), a(3*n+1), a(3*n+2)]</code> and so on.
 * @author Georg Fischer
 */
public class GeneralRecurrence extends MemorySequence implements SequenceWithOffset {

  protected int mOffset; // first index of sequence, only used for b-files
  protected final ArrayList<Function<Integer, Z>> mLambda; // tuple of lambda expressions

  /**
   * Construct a general recurrence sequence from lambda expressions.
   * @param offset first valid term has this index
   * @param initTerms initial values of <code>a[0..k]</code>
   */
  public GeneralRecurrence(final int offset, final long... initTerms) {
    super(offset, initTerms);
    mOffset = offset;
    mLambda = new ArrayList<>();
    initialize();
  }

  /**
   * Construct a general recurrence sequence from lambda expressions.
   * @param offset first valid term has this index
   * @param initTerms initial values of <code>a[0..k]</code>
   */
  public GeneralRecurrence(final int offset, final long[] initTerms, Function<Integer, Z>[] lambda) {
    super(offset, initTerms);
    mOffset = offset;
    mLambda = new ArrayList<>();
    for (int i = 0; i < lambda.length; ++i) {
      mLambda.add(lambda[i]);
    }
  }

  /**
   * Initialize the sequence, assign the lambda expression(s).
   * This code is common to all constructors.
   * The number of added lambda expressions gives the number of n-sections of the recurrence.
   */
  protected void initialize() {
    mLambda.add(n -> a(n - 1).multiply(a(n - 3)).add(a(n - 2).square()).divide(a(n - 4))); // (1,1) Somos-4
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z computeNext() {
    final int n = size() + getOffset();
    return mLambda.get(n % mLambda.size()).apply(n / mLambda.size());
  }
}
