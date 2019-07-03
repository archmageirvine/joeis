package jmason.poly;

import java.util.ArrayList;

/**
 * Counts polyominoes that are 90 degree rotatable around a corner.
 * @author jmason
 */
public class NRot90CornerCounter extends Counter {

  UTest mH;

  /**
   * Counts polyominoes that are 90 degree rotatable around a corner.
   * @param max maximum size
   * @param flagFree free
   * @param flagFixed fixed
   * @param flagOneSided one-sided
   */
  public NRot90CornerCounter(final int max, final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
    super("R90", max, null);
    assert (max & 3) == 0;
    final CoordSet2 cs = new CoordSet2(4, flagFree, flagFixed, flagOneSided);

    cs.setSquare(0, 0, 0, Square.BLACK);
    cs.setSquare(1, Square.opp(0), Square.opp(0), Square.BLACK);
    cs.setSquare(2, Square.opp(0), 0, Square.WHITE);
    cs.setSquare(3, 0, Square.opp(0), Square.WHITE);

    final Rot90CornerCounter r90 = new Rot90CornerCounter(max, cs, false, null);
    add(r90);
    final UTest hh = new UTest();
    for (int i = 0; i < r90.mAll.size(); ++i) {
      add(new NRot90CornerCounter(max, r90.mAll.get(i).mP, hh));
    }
  }

  NRot90CornerCounter(final int max, final Polyomino starter, final UTest hh) {
    super("R90", max, null);
    mH = new UTest();
    count(starter, hh, false);
  }

  private void count(final Polyomino starter, final UTest hh, final boolean bInclude) {
    if (bInclude) {
      add(new Countable(starter, (!((CoordSet2) (starter.mCs)).symXaxis() && !((CoordSet2) (starter.mCs)).symYaxis())));
    }
    final ArrayList<Polyomino> sons = ((CoordSet2) (starter.mCs)).nlistRot90CornerSons(); // no guarantee of uniqueness
    for (final Polyomino p : sons) {
      if (!mH.put(p.mUniq)) {
        continue;
      }
      if (!hh.put(p.mUniq)) {
        continue;
      }
      count(p, hh, true);
    }
  }
}
