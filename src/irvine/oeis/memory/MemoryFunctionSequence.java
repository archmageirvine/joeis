package irvine.oeis.memory;

import java.util.HashMap;

import irvine.oeis.AbstractSequence;

/**
 * Definition of a one argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <S> argument type
 * @param <R> result type
 */
public abstract class MemoryFunctionSequence<S, R> extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final HashMap<S, R> mCache = new HashMap<>();

  /**
   * Create a new memory sequence with specified offset.
   * @param offset the offset
   */
  protected MemoryFunctionSequence(final int offset) {
    super(offset);
  }

  /**
   * Create a new memory sequence with offset 0.
   */
  protected MemoryFunctionSequence() {
    this(DEFOFF);
  }

  /**
   * Compute the function at specified parameters.
   * @param key first parameter
   * @return value of function
   */
  protected abstract R compute(final S key);

  /**
   * Return the current value of the function at specified parameters.
   * No attempt is made to compute the value if it is not currently present.
   * @param key first parameter
   * @return value of function
   */
  protected R getUncached(final S key) {
    return mCache.get(key);
  }

  /**
   * Return the value of the function at specified parameters.
   * @param key first parameter
   * @return value of function
   */
  public R get(final S key) {
    final R res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(key);
    mCache.put(key, r);
    return r;
  }
}
