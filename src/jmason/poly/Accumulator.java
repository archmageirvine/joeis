package jmason.poly;

import java.util.ArrayList;

/**
 * An accumulator object will count polyominoes of different sizes (if the "countable"
 * object they arrive in so indicates).
 * It will crash if the same polyomino arrives twice.
 * @author jmason
 */
public class Accumulator {

  final ArrayList<Countable> mA;
  final UTest mUt;
  final int[] mCounters;
  final int mMax;

  /**
   * Get the count for the given index
   * @param i index
   * @return count
   */
  public int getCounter(final int i) {
    return mCounters[i];
  }

  /**
   * Construct a new accumulator with the specified numbers of values.
   * @param max maximum index
   */
  public Accumulator(final int max) {
    mA = new ArrayList<>();
    mUt = new UTest();
    mMax = max;
    mCounters = new int[max + 1];
  }

  void add(final ArrayList<Countable> b) {
    for (final Countable c : b) {
      add(c);
    }
  }

  boolean add(final Countable c) {
    if (!mUt.put(c.mP.mUniq)) {
      if (c.mCountable) {
        throw new RuntimeException(c.mP.mCs.makeDiagram());
      }
      return false;
    }
    mA.add(c);

    if (c.mCountable) {
      mCounters[c.mP.size()]++;
    }
    return true;
  }

//  void print() {
//    for (int i = 1; i <= mMax; i++) {
//      System.err.println(mCounters[i]);
//    }
//  }
}
