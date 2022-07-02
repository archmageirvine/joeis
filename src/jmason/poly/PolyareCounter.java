package jmason.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * A counter of polyares.
 * @author Sean A. Irvine
 */
public class PolyareCounter {

  private final List<Polyare> mList = new ArrayList<>();
  private final UniquenessTester mUt = new UniquenessTester();
  private final Cumulator mCu;
  private final int mMax;

  public Cumulator getCu() {
    return mCu;
  }

  /**
   * Construct a new counter.
   * @param max size
   */
  public PolyareCounter(final int max) {
    mCu = new Cumulator("counters", max);
    mMax = max;
  }

  /**
   * Run the search.
   * @param flagFree free
   * @param flagFixed fixed
   * @param flagOneSided one-sided
   * @param prevList previous results
   * @param optim optimization flag
   */
  public void run(final boolean flagFree, final boolean flagFixed, final boolean flagOneSided, final List<Polyare> prevList, final boolean optim) {
    if (prevList == null || !optim) {
      final CoordSet2 cs = new CoordSet2(4, flagFree, flagFixed, flagOneSided);
      cs.initMonoare();
      count(1, mMax, new Polyare(cs), optim, flagOneSided);
    } else {
      for (final Polyare p : prevList) {
        // guarantee of uniqueness
        for (final Polyare son : p.listSons(flagOneSided)) {
          count(mMax, mMax, son, optim, flagOneSided);
        }
      }
    }
  }

  private void count(final int c, final int max, final Polyare p, final boolean optim, final boolean oneSided) {
    p.mCs.verify();
    if (!mUt.add(p.mUniq)) {
      return;
    }

    mCu.add(c);
    if (optim) {
      mList.add(p);
    }

    if (c < max) {
      // guarantee of uniqueness
      for (final Polyare son : p.listSons(oneSided)) {
        count(c + 1, max, son, optim, oneSided);
      }
    }
  }

  public List<Polyare> getList() {
    return mList;
  }
}
