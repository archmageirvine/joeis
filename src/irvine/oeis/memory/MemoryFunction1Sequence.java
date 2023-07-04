package irvine.oeis.memory;

import java.util.ArrayList;

import irvine.oeis.AbstractSequence;

/**
 * Definition of a single argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunction1Sequence<R> extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final ArrayList<R> mCache = new ArrayList<>();

  /**
   * Create a new memory sequence with specified offset.
   * @param offset the offset
   */
  protected MemoryFunction1Sequence(final int offset) {
    super(offset);
  }

  /**
   * Create a new memory sequence with offset 0.
   */
  protected MemoryFunction1Sequence() {
    this(DEFOFF);
  }

  /**
   * Compute the function at specified parameter.
   * @param n parameter
   * @return value of function
   */
  protected abstract R compute(final int n);

  /**
   * Return the value of the function at specified parameter.
   * @param n parameter
   * @return value of function
   */
  public R get(final int n) {
    while (n >= mCache.size()) {
      mCache.add(compute(mCache.size()));
    }
    return mCache.get(n);
  }
}


