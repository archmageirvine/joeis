package irvine.oeis.memory;

import java.util.HashMap;

import irvine.oeis.AbstractSequence;

/**
 * Definition of a two argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunctionInt2Sequence<R> extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final HashMap<String, R> mCache = new HashMap<>();

  /**
   * Create a new memory sequence with specified offset.
   * @param offset the offset
   */
  protected MemoryFunctionInt2Sequence(final int offset) {
    super(offset);
  }

  /**
   * Create a new memory sequence with offset 0.
   */
  protected MemoryFunctionInt2Sequence() {
    this(DEFOFF);
  }

  /**
   * Compute the function at specified parameters.
   * @param n first parameter
   * @param m second parameter
   * @return value of function
   */
  protected abstract R compute(final int n, final int m);

  /**
   * Return the value of the function at specified parameters.
   * @param n first parameter
   * @param m second parameter
   * @return value of function
   */
  public R get(final int n, final int m) {
    final String key = n + "," + m;
    final R res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(n, m);
    mCache.put(key, r);
    return r;
  }
}


