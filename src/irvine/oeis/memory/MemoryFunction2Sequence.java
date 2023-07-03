package irvine.oeis.memory;

import java.util.HashMap;

import irvine.oeis.AbstractSequence;
import irvine.util.Pair;

/**
 * Definition of a two argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <S> argument type
 * @param <R> result type
 */
public abstract class MemoryFunction2Sequence<S, R> extends AbstractSequence {

  private static final int DEFOFF = 0;
  protected final HashMap<Pair<S, S>, R> mCache = new HashMap<>();

  /**
   * Create a new memory sequence with specified offset.
   * @param offset the offset
   */
  protected MemoryFunction2Sequence(final int offset) {
    super(offset);
  }

  /**
   * Create a new memory sequence with offset 0.
   * @param offset the offset
   */
  protected MemoryFunction2Sequence() {
    this(DEFOFF);
  }

  /**
   * Compute the function at specified parameters.
   * @param n first parameter
   * @param m second parameter
   * @return value of function
   */
  protected abstract R compute(final S n, final S m);

  /**
   * Return the value of the function at specified parameters.
   * @param n first parameter
   * @param m second parameter
   * @return value of function
   */
  public R get(final S n, final S m) {
    final Pair<S, S> key = new Pair<>(n, m);
    final R res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(n, m);
    mCache.put(key, r);
    return r;
  }

  /**
   * Clear the cache.
   */
  public void clear() {
    mCache.clear();
  }
}


