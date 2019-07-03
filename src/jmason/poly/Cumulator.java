package jmason.poly;

/**
 * A cumulator object is a named set of counters, a counter for eache mSize from 1 to max.
 * @author jmason
 */
public class Cumulator {

  final int[] mCounters;
  final int mMax;
  final String mName;

  Cumulator(final String name, final int max) {
    mMax = max;
    mName = name;
    mCounters = new int[max + 1];
  }

  public void add(final int[] c) {
    for (int i = 1; i <= mMax; i++) {
      mCounters[i] += c[i];
    }
  }

  public void add(final int i) {
    mCounters[i]++;
  }

  void print() {
    System.err.println(mName);
    System.err.println(build());
    for (int i = 1; i <= mMax; i++) {
      System.err.println(mCounters[i]);
    }
  }

  public String build() {
    return build(mCounters);
  }

  public String build(final int[] a) {
    final StringBuilder s = new StringBuilder();
    for (int i = 1; i <= mMax; i++) {
      s.append(a[i]);
      if (i < mMax) {
        s.append(", ");
      }
    }
    return s.toString();
  }

  public int getCounter(final int i) {
    return mCounters[i];
  }
}
