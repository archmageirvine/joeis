package jmason.poly;

/**
 * Counts polyominoes that are 90 degree rotatable around a corner.
 * @author jmason
 */
public class Rot90CornerCounter extends Counter {

  UTest mH;

//  // max is multiple of 4
//  public Rot90CornerCounter(final int max, final int fase, final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
//    super("R90", max, null);
//    CoordSet2 cs = new CoordSet2(4, flagFree, flagFixed, flagOneSided);
//    int t = (max - 4) / 4;
//    t = t * t;
//    if (t < max) {
//      t = max;
//    }
//    cs.setCentre();
//
//    Rot90CornerCounter r90;
//    if (fase == 1 || fase == 3) {
//      r90 = new Rot90CornerCounter(max, cs, false, null);
//      this.add(r90);
//
//    }
//    if (fase == 2 || fase == 3) {
//      Rot90CornerCounter r = new Rot90CornerCounter(t, cs, true, null);
//
//      for (int i = 0; i < r.mAll.size(); i++) {
//        //System.err.println("fase 2b " + i + " of " + r.all.mSize());
//        Countable c = r.mAll.get(i);
//        if (c.mP.holy()) {
//          continue;
//        }
//        CoordSet2 perim = ((CoordSet2) (c.mP.mCs)).perim();
//        if (perim.mSize <= max) {
//          r90 = new Rot90CornerCounter(max, perim, false, ((CoordSet2) (c.mP.mCs)));
//          this.add(r90);
//
//        }
//      }
//    }
//  }

  /**
   * Counts polyominoes that are 90 degree rotatable around a corner.
   * @param max maximum size
   * @param starter start
   * @param onlyForPerim perimeter only
   * @param hole hole coordinates
   */
  public Rot90CornerCounter(final int max, final CoordSet2 starter, final boolean onlyForPerim, final CoordSet2 hole) {
    super("R90", max, hole);
    mH = new UTest();
    count(starter.mSize, max, starter, onlyForPerim);
  }

  private void count(final int c, final int max, final CoordSet2 starter, final boolean onlyForPerim) {
    assert c <= max : "c too high";
    if (starter.connected()) {
      final Polyomino p = new Polyomino(starter);
      add(new Countable(p, !((CoordSet2) p.mCs).symXaxis() && !((CoordSet2) p.mCs).symYaxis()));
    }
    if (c + 4 <= max) {
      // no guarantee of uniqueness
      for (final CoordSet2 newcs : starter.listRot90CornerSons()) {
        if (mHole != null && newcs.overlaps(mHole)) {
          continue;
        }
        if (onlyForPerim && newcs.perimeterEstimate() > max) {
          continue;
        }
        final String uniq = new UniqueMaker2(newcs).uniqString();
        if (!mH.put(uniq)) {
          continue;
        }
        count(c + 4, max, newcs, onlyForPerim);
      }
    }
  }
}
