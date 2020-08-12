package jmason.poly;

/**
 * A counter of polyominoes rotatable 180 degrees around a point midway along a side.
 * @author jmason
 */
public class Rot180MidSideCounter extends Counter {

  UniquenessTester mH;

  /**
   * A counter of polyominoes rotatable 180 degrees around a point midway along a side.
   * @param max maximum size
   * @param flagFree free
   * @param flagFixed fixed
   * @param flagOneSided one-sided
   */
  public Rot180MidSideCounter(final int max, final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
    super("R180", max, null);
    assert (max & 1) == 0;
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
      final CoordSet2 perim = ((CoordSet2) (c.mP.mCs)).perimeter();
      if (perim.mSize <= max) {
        r180 = new Rot180MidSideCounter(max, perim, false, (CoordSet2) c.mP.mCs);
        add(r180);
      }
    }
  }

  /**
   * A counter of polyominoes rotatable 180 degrees around a point midway along a side.
   * @param max maximum size
   * @param starter starting coordinates
   * @param onlyForPerim perimeter
   * @param hole hole coordinates
   */
  public Rot180MidSideCounter(final int max, final CoordSet2 starter, final boolean onlyForPerim, final CoordSet2 hole) {
    super("R180", max, hole);
    mH = new UniquenessTester();
    count(starter.mSize, max, starter, onlyForPerim);
  }

  private void count(final int c, final int max, final CoordSet2 starter, final boolean onlyForPerim) {
    assert c <= max : "c too high";
    if (starter.connected()) {
      final Polyomino p = new Polyomino(starter);
      add(new Countable(p, !((CoordSet2) (p.mCs)).symXaxis()));
    }
    if (c + 2 <= max) {
      for (final CoordSet2 newcs : starter.listRot180MidSideSons()) {
        if (mHole != null && newcs.overlaps(mHole)) {
          continue;
        }
        if (onlyForPerim && newcs.perimeterEstimate() > max) {
          continue;
        }
        final String uniq = new UniqueMaker2(newcs).uniqString();
        if (mH.add(uniq)) {
          count(c + 2, max, newcs, onlyForPerim);
        }
      }
    }
  }
}
