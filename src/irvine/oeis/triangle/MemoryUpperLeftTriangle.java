package irvine.oeis.triangle;

import java.util.HashMap;

/**
 * An {@link UpperLeftTriangle} with support for a recursive function that is
 * supported by a hash map for values that were already computed
 * "option calculate" in Maple).
 * @param <R> result type
 * @author Georg Fischer
 */
public abstract class MemoryUpperLeftTriangle<R> extends UpperLeftTriangle {

  /**
   * Empty constructor.
   */
  public MemoryUpperLeftTriangle() {
    super();
    hasRAM(true);
  }

  /**
   * Constructor with corner index, descending.
   * @param row0 first row index
   */
  public MemoryUpperLeftTriangle(final int row0) {
    this(row0, row0, -1);
  }

  /**
   * Constructor with corner indices and direction-
   * @param row0 first row index
   * @param col0 first column index
   * @param dir direction: +1 = ascending, -1 = descending
   */
  public MemoryUpperLeftTriangle(final int row0, final int col0, final int dir) {
    super(row0, col0, dir);
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
