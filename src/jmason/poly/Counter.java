package jmason.poly;

import java.util.ArrayList;

/**
 * Used for counting.
 * @author jmason
 */
public class Counter {

  final ArrayList<Countable> mAll;
  final Accumulator mAccum;

  final Cumulator mCu;
  final Cumulator mCuall;
  final Cumulator mCusym;
  final Cumulator mCuasym;

  public Cumulator getCu() {
    return mCu;
  }

  public Cumulator getCuall() {
    return mCuall;
  }

  public Cumulator getCusym() {
    return mCusym;
  }

  public Cumulator getCuasym() {
    return mCuasym;
  }

  public Accumulator getAccum() {
    return mAccum;
  }

  protected final CoordSet2 mHole;
  protected final int mMax;

  public Counter(final String prefix, final int max, final CoordSet2 hole) {
    mMax = max;
    mAll = new ArrayList<>();
    mHole = hole;
    mAccum = new Accumulator(max);
    mCu = new Cumulator(prefix + " counters excluding aa-symmetric", max);
    mCuall = new Cumulator(prefix + " total counters", max);
    mCusym = new Cumulator(prefix + " symmetric counters", max);
    mCuasym = new Cumulator(prefix + " asymmetric counters", max);

  }

  public void add(final Counter oc) {
    mCu.add(oc.mCu.mCounters);
    mCuall.add(oc.mCuall.mCounters);
    mCusym.add(oc.mCusym.mCounters);
    mCuasym.add(oc.mCuasym.mCounters);
  }

  public void add(final Countable c) {
    assert c.mP.mCs.connected();
    int n = c.mP.mCs.mSize;
    mAll.add(c);
    mCuall.add(n);
    if (c.mCountable) {
      mCu.add(n);
    }
    if (((CoordSet2) (c.mP.mCs)).symReflect()) {
      mCusym.add(n);
    } else {
      mCuasym.add(n);
    }
  }
}
