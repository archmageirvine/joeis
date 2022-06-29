package jmason.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * A counter of polyominoes.
 * @author jmason
 */
public class PolytriamondCounter {

  private final List<Polytriamond> mList = new ArrayList<>();
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
  public PolytriamondCounter(final int max) {
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
  public void run(final boolean flagFree, final boolean flagFixed, final boolean flagOneSided, final List<Polytriamond> prevList, final boolean optim) {
    if (prevList == null || !optim) {
      final CoordSet2T cs = new CoordSet2T(3, flagFree, flagFixed, flagOneSided);
      cs.initMonotriamond();
      count(1, mMax, new Polytriamond(cs), optim);
    } else {
      for (final Polytriamond p : prevList) {
        // guarantee of uniqueness
        for (final Polytriamond son : p.listSons(0)) {
          count(mMax, mMax, son, optim);
        }
      }
    }
  }

  private void count(final int c, final int max, final Polytriamond p, final boolean optim) {
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
      for (final Polytriamond son : p.listSons(0 /* onlyIfColour */)) {
        count(c + 1, max, son, optim);
      }
    }
  }

  public List<Polytriamond> getList() {
    return mList;
  }
}
