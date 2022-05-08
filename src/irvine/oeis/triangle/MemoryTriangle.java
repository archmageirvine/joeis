package irvine.oeis.triangle;

import java.util.HashMap;

/**
 * A {@link Triangle} with support for a recursive function that is
 * supported by a hash map for values that were already computed
 * "option calculate" in Maple).
 * @param <R> result type
 * @author Georg Fischer
 */
public abstract class MemoryTriangle<R> extends Triangle {

  /**
   * Empty constructor.
   */
  public MemoryTriangle() {
    hasRAM(true);
  }

  protected HashMap<String, R> mMemory = new HashMap<>();

  protected R retrieve(final int a) {
    final String key = String.valueOf(a);
    final R res = mMemory.get(key);
    if (res != null) {
      return res;
    }
    final R r = calculate(a);
    mMemory.put(key, r);
    return r;
  }

  protected R retrieve(final int a, final int b) {
    final String key = a + "," + b;
    final R res = mMemory.get(key);
    if (res != null) {
      return res;
    }
    final R r = calculate(a, b);
    mMemory.put(key, r);
    return r;
  }

  protected R retrieve(final int a, final int b, final int c) {
    final String key = a + "," + b + "," + c;
    final R res = mMemory.get(key);
    if (res != null) {
      return res;
    }
    final R r = calculate(a, b, c);
    mMemory.put(key, r);
    return r;
  }

  protected R retrieve(final int a, final int b, final int c, final int d) {
    final String key = a + "," + b + "," + c + "," + d;
    final R res = mMemory.get(key);
    if (res != null) {
      return res;
    }
    final R r = calculate(a, b, c, d);
    mMemory.put(key, r);
    return r;
  }

  protected R calculate(final int a) {
    return null;
  }

  protected R calculate(final int a, final int b) {
    return null;
  }

  protected R calculate(final int a, final int b, final int c) {
    return null;
  }

  protected R calculate(final int a, final int b, final int c, final int d) {
    return null;
  }
}
