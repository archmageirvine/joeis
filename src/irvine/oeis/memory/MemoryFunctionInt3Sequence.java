package irvine.oeis.memory;

import java.util.HashMap;

import irvine.oeis.AbstractSequence;

/**
 * Definition of a three argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunctionInt3Sequence<R> extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final HashMap<String, R> mCache = new HashMap<>();

  /**
   * Create a new memory sequence with specified offset.
   * @param offset the offset
   */
  protected MemoryFunctionInt3Sequence(final int offset) {
    super(offset);
  }

  /**
   * Create a new memory sequence with offset 0.
   */
  protected MemoryFunctionInt3Sequence() {
    this(DEFOFF);
  }

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @return value of function
   */
  protected abstract R compute(final int a, final int b, final int c);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @return value of function
   */
  public R get(final int a, final int b, final int c) {
    final String key = a + "," + b + "," + c;
    final R res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b, c);
    mCache.put(key, r);
    return r;
  }
}


