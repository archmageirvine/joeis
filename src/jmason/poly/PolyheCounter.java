package jmason.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * A counter of polyhes.
 * @author Sean A. Irvine
 */
public class PolyheCounter {

  private final List<Polyhe> mList = new ArrayList<>();
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
  public PolyheCounter(final int max) {
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
  public void run(final boolean flagFree, final boolean flagFixed, final boolean flagOneSided, final List<Polyhe> prevList, final boolean optim) {
    if (prevList == null || !optim) {
      final CoordSet2T cs = new CoordSet2T(6, flagFree, flagFixed, flagOneSided);
      cs.initMonohes();
      count(1, mMax, new Polyhe(cs), optim);
    } else {
      for (final Polyhe p : prevList) {
        // guarantee of uniqueness
        for (final Polyhe son : p.listSons()) {
          count(mMax, mMax, son, optim);
        }
      }
    }
  }

  private void count(final int c, final int max, final Polyhe p, final boolean optim) {
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
      for (final Polyhe son : p.listSons()) {
        count(c + 1, max, son, optim);
      }
    }
  }

  public List<Polyhe> getList() {
    return mList;
  }
}
