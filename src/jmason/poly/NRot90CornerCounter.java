package jmason.poly;

import java.util.ArrayList;

/**
 * Counts polyominoes that are 90 degree rotatable around a corner.
 * @author jmason
 */
public class NRot90CornerCounter extends Counter {

  UTest mH;


  // max is multiple of 4
  public NRot90CornerCounter(int max, boolean flagFree, boolean flagFixed, boolean flagOneSided) {
    super("R90", max, null);
    CoordSet2 cs = new CoordSet2(4, flagFree, flagFixed, flagOneSided);

    cs.setSquare(0, 0, 0, Square.BLACK);
    cs.setSquare(1, Square.opp(0), Square.opp(0), Square.BLACK);
    cs.setSquare(2, Square.opp(0), 0, Square.WHITE);
    cs.setSquare(3, 0, Square.opp(0), Square.WHITE);

    Rot90CornerCounter r90;
    NRot90CornerCounter nr90;
//System.err.println("phase 1");
    r90 = new Rot90CornerCounter(max, cs, false, null);
    add(r90);

    UTest hh = new UTest();
    for (int i = 0; i < r90.mAll.size(); i++) {
      Countable c = r90.mAll.get(i);
      nr90 = new NRot90CornerCounter(max, c.mP, hh);
      add(nr90);
    }
  }

  public NRot90CornerCounter(int max, Polyomino starter, UTest hh) {
    super("R90", max, null);
    mH = new UTest();

    count(starter, hh, false);
  }

  private void count(Polyomino starter, UTest hh, boolean bInclude) {
    //System.err.println(starter.cs.makeDiagram());
    if (bInclude) {
      add(new Countable(starter, (!((CoordSet2) (starter.mCs)).symXaxis() && !((CoordSet2) (starter.mCs)).symYaxis())));
    }

    ArrayList sons = ((CoordSet2) (starter.mCs)).nlistRot90CornerSons(); // no guarantee of uniqueness
    for (Object son : sons) {
      Polyomino p = (Polyomino) son;

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
