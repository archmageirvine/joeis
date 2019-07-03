package jmason.poly;

import java.util.*;

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

  public int getCounter(int i) {
    return mCounters[i];
  }

  public Accumulator(int max) {
    mA = new ArrayList<>();
    mUt = new UTest();
    mMax = max;
    mCounters = new int[max + 1];

  }

  public void add(final ArrayList<Countable> b) {
    for (Countable c : b) {
      add(c);
    }
  }

  public boolean add(final Countable c) {
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

  public void print() {
    for (int i = 1; i <= mMax; i++) {
      System.err.println(mCounters[i]);
    }
  }
}
