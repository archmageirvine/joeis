package jmason.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * A counter of polyominoes.
 * @author jmason
 */
public class PolyiamondCounter {

  private final ArrayList<Polyiamond> mList = new ArrayList<>();
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
  public PolyiamondCounter(final int max) {
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
  public void run(final boolean flagFree, final boolean flagFixed, final boolean flagOneSided, final List<Polyiamond> prevList, final boolean optim) {
    if (prevList == null || !optim) {
      final CoordSet2T cs = new CoordSet2T(1, flagFree, flagFixed, flagOneSided);
      cs.initMonoiamond();
      count(1, mMax, new Polyiamond(cs), optim);
    } else {
      for (final Polyiamond p : prevList) {
        // guarantee of uniqueness
        for (final Polyiamond son : p.listSons(0)) {
          count(mMax, mMax, son, optim);
        }
      }
    }
  }

  private void count(final int c, final int max, final Polyiamond p, final boolean optim) {
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
      for (final Polyiamond son : p.listSons(0 /* onlyIfColour */)) {
        count(c + 1, max, son, optim);
      }
    }
  }

  public List<Polyiamond> getList() {
    return mList;
  }
}
