package jmason.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * A counter of polyhes.
 * @author Sean A. Irvine
 */
public class PolyhesCounter {

  private final List<Polyhes> mList = new ArrayList<>();
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
  public PolyhesCounter(final int max) {
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
  public void run(final boolean flagFree, final boolean flagFixed, final boolean flagOneSided, final List<Polyhes> prevList, final boolean optim) {
    if (prevList == null || !optim) {
      final CoordSet2T cs = new CoordSet2T(6, flagFree, flagFixed, flagOneSided);
      cs.initMonohes();
      count(1, mMax, new Polyhes(cs), optim);
    } else {
      for (final Polyhes p : prevList) {
        // guarantee of uniqueness
        for (final Polyhes son : p.listSons()) {
          count(mMax, mMax, son, optim);
        }
      }
    }
  }

  private void count(final int c, final int max, final Polyhes p, final boolean optim) {
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
      for (final Polyhes son : p.listSons( /* onlyIfColour */)) {
        count(c + 1, max, son, optim);
      }
    }
  }

  public List<Polyhes> getList() {
    return mList;
  }
}
