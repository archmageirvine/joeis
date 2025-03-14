package jmason.poly;

import java.util.ArrayList;

/**
 * A counter of polyominoids.
 * @author jmason
 * @author Sean A. Irvine
 */
public class FixedPolySideCounter {

  private final UniquenessTester mUt;
  private final Cumulator mCu;
  private final ArrayList<ArrayList<PolySide>> mA = new ArrayList<>();

  /**
   * Construct a new counter.
   * @param max maximum size
   */
  public FixedPolySideCounter(final int max) {
    mCu = new Cumulator("counters", max);
    mUt = new UniquenessTester();
    for (int i = 0; i <= max; i++) {
      mA.add(new ArrayList<>());
    }
    count(1, max, new PolySide(1));
    count(1, max, new PolySide(1).rotxz());
    count(1, max, new PolySide(1).rotxz().mirrorxy().rotxz());
  }

  public Cumulator getCu() {
    return mCu;
  }

  private void count(final int c, final int max, final PolySide p) {

    if (!mUt.add(p.makeString())) {
      return;
    }
    mA.get(c).add(p);
    mCu.add(c);

    if (c < max) {
      final ArrayList<PolySide> sons = p.listSons(); // guarantee of uniqueness
      for (final PolySide son : sons) {
        count(c + 1, max, son);
      }
    }
  }
}
