package jmason.poly;

/**
 * A cumulator object is a named set of counters, a counter for each size from 1 to max.
 * @author jmason
 */
public class Cumulator {

  final int[] mCounters;
  private final int mMax;
  protected final String mName;

  Cumulator(final String name, final int max) {
    mMax = max;
    mName = name;
    mCounters = new int[max + 1];
  }

  void add(final int[] c) {
    for (int i = 1; i <= mMax; i++) {
      mCounters[i] += c[i];
    }
  }

  void add(final int i) {
    ++mCounters[i];
  }

  void print() {
    System.err.println(mName);
    System.err.println(build());
    for (int i = 1; i <= mMax; i++) {
      System.err.println(mCounters[i]);
    }
  }

  String build() {
    return build(mCounters);
  }

  String build(final int[] a) {
    final StringBuilder s = new StringBuilder();
    for (int i = 1; i <= mMax; i++) {
      s.append(a[i]);
      if (i < mMax) {
        s.append(", ");
      }
    }
    return s.toString();
  }

  /**
   * Get the count for the given value
   * @param i index
   * @return count
   */
  public int getCounter(final int i) {
    return mCounters[i];
  }
}
