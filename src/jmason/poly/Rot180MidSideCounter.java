package jmason.poly;

import java.util.ArrayList;

/**
 * A counter of polyominoes rotatable 180 degrees around a point midway along a side.
 * @author jmason
 */
public class Rot180MidSideCounter extends Counter {

  UTest mH;
  private int[] mMyCounters;

  // max is multiple of 2
  public Rot180MidSideCounter(final int max, final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
    super("R180", max, null);
    final CoordSet2 cs = new CoordSet2(2, flagFree, flagFixed, flagOneSided);
    int t = (max - 4) / 4;
    t = t * t;
    if (t < max) {
      t = max;
    }
    cs.setSquare(0, 0, 0, Square.BLACK);
    cs.setSquare(1, 0, Square.opp(0), Square.WHITE);

    Rot180MidSideCounter r180 = new Rot180MidSideCounter(max, cs, false, null);
    add(r180);

    final Rot180MidSideCounter r = new Rot180MidSideCounter(t, cs, true, null);
    for (int i = 0; i < r.mAll.size(); ++i) {
      final Countable c = r.mAll.get(i);
      if (c.mP.holy()) {
        continue;
      }
      CoordSet2 perim = ((CoordSet2) (c.mP.mCs)).perim();
      if (perim.mSize <= max) {
        r180 = new Rot180MidSideCounter(max, perim, false, ((CoordSet2) (c.mP.mCs)));
        add(r180);
      }
    }
  }

  public Rot180MidSideCounter(final int max, final CoordSet2 starter, final boolean onlyForPerim, final CoordSet2 hole) {
    super("R180", max, hole);
    mH = new UTest();
    mMyCounters = new int[max + 1];
    count(starter.mSize, max, starter, onlyForPerim);
  }

  private void count(final int c, final int max, final CoordSet2 starter, final boolean onlyForPerim) {
    assert c <= max : "c too high";
    if (starter.connected()) {
      Polyomino p = new Polyomino(starter);
      add(new Countable(p, !((CoordSet2) (p.mCs)).symXaxis()));
      ++mMyCounters[c];
    }

    if (c + 2 <= max) {
      final ArrayList<CoordSet2> sons = starter.listRot180MidSideSons(); // no guarantee of uniqueness
      for (final CoordSet2 newcs : sons) {
        if (mHole != null && newcs.overlaps(mHole)) {
          continue;
        }
        if (onlyForPerim && newcs.perimeterEstimate() > max) {
          continue;
        }
        String uniq = new UniqueMaker2(newcs).uniqString();
        if (!mH.put(uniq)) {
          continue;
        }

        count(c + 2, max, newcs, onlyForPerim);
      }
    }
  }
}
