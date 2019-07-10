package jmason.poly;

import java.util.ArrayList;

/**
 * An integral polyomino.
 * @author jmason
 */
public class Polyomino extends PolyGen<Square, CoordSet2> {

  private boolean mBHoly, mBHolyCalculated;

  // build a polyomino cloning a coordinate set
  Polyomino(final CoordSet2 c) {
    builder(c, true);
    ((CoordSet2) mCs).calculate();
  }

//  // build a polyomino from a coordinate set, with or without cloning
//  Polyomino(final CoordSet2 c, final boolean copy) {
//    builder(c, copy);
//    ((CoordSet2) mCs).calculate();
//  }


  // build a polyomino from a coordinate set, with or without cloning

  // build a polyomino from a coordinate set adding one square
  Polyomino(final CoordSet2 c, final int x, final int y) {
    mCs = c.copy(x, y);
    mUniq = mCs.makeUnique();
    ((CoordSet2) mCs).calculate();
  }

  Polyomino(final CoordSet2 c, final int x1, final int y1, final int x2, final int y2) {
    mCs = c.copy(x1, y1, x2, y2);
    mUniq = mCs.makeUnique();
    ((CoordSet2) mCs).calculate();
  }

//  Polyomino(final CoordSet2 c, final int x1, final int y1, final int x2, final int y2, final int x3, final int y3, final int x4, final int y4) {
//    mCs = c.copy(x1, y1, x2, y2, x3, y3, x4, y4);
//    mUniq = mCs.makeUnique();
//    ((CoordSet2) mCs).calculate();
//  }

  int getWidth() {
    return ((CoordSet2) mCs).getWidth();
  }

  int getHeight() {
    return ((CoordSet2) mCs).getHeight();
  }

  // build list of mirror polyominoes generatable form current
  // No guarantee that not generatable from previous
  ArrayList<Polyomino> listMirrorSons() {
    final ArrayList<Polyomino> list = new ArrayList<>();
    final UTest h = new UTest();
    final UTest hc = new UTest();
    for (int i = 0; i < size(); i++) {
      tryMirrorSquare(i, 1, 0, list, h, hc);
      tryMirrorSquare(i, -1, 0, list, h, hc);
      tryMirrorSquare(i, 0, 1, list, h, hc);
      tryMirrorSquare(i, 0, -1, list, h, hc);
    }
    return list;
  }

  private void tryMirrorSquare(final int i, final int dx, final int dy, final ArrayList<Polyomino> list, final UTest h, final UTest hc) {
    final int x = mCs.getX(i) + dx;
    final int y = mCs.getY(i) + dy;
    if (((CoordSet2) mCs).exists(x, y)) {
      return;
    }
    if (!hc.put(x + " " + y)) {
      return;
    }

    final Polyomino p = new Polyomino((CoordSet2) mCs, x, y, Square.opp(x), y);
    if (!h.put(p.mUniq)) {
      return;
    }

    list.add(p);
  }

  // build a list (without duplicates) of polyominoes that may be generated from current
  ArrayList<Polyomino> listSons(final int addOnlyToColour) {
    final ArrayList<Polyomino> list = new ArrayList<>();
    final UTest h = new UTest();
    final UTest hc = new UTest();

    for (int i = 0; i < size(); i++) {
      if (addOnlyToColour != 0 && mCs.getColour(i) != addOnlyToColour) {
        continue;
      }
      trySquare(i, 1, 0, list, h, hc);
      trySquare(i, -1, 0, list, h, hc);
      trySquare(i, 0, 1, list, h, hc);
      trySquare(i, 0, -1, list, h, hc);
    }
    return list;
  }

  // try to build a polyomino adding a specific square to current
  private void trySquare(final int i, final int dx, final int dy, final ArrayList<Polyomino> list, final UTest h, final UTest hc) {
    final int x = mCs.getX(i) + dx;
    final int y = mCs.getY(i) + dy;
    if (((CoordSet2) mCs).exists(x, y)) {
      return;
    }
    if (!hc.put(x + " " + y)) {
      return;
    }
    final Polyomino p = new Polyomino((CoordSet2) mCs, x, y);
    if (!h.put(p.mUniq)) {
      return;
    }
    list.add(p);
  }

//  // can a generated polyomino be built from one of the same mSize but lower value than current?
//  private boolean previouslyBuildable(final Polyomino p) {
//    for (int i = 0; i < mSize(); ++i) {
//      CoordSet2 cs = (CoordSet2) (p.mCs.copyWithout(i));
//      if (!cs.connected()) {
//                /*if (f)
//                    System.out.println("not conn " + cs.toString());*/
//        continue;
//      }
//      Polyomino tmp = new Polyomino(cs, false);
//
//      if (tmp.mUniq.compare(this.mUniq) < 0) {
//        return true;
//      }
//    }
//       /* if (f)
//        {
//            System.out.println("good ");
//        }
//        *
//        */
//    return false;
//  }
//
//  // DUBIOUS
//  public boolean singleColourable() {
//    boolean singleColourable = false;
//    if (this.odd() || this.mCs.biased()) {
//    } else {
//      CoordSet2 ts = (CoordSet2) (this.mCs.copyFlip());
//      final String tmp1 = ts.makeString(true);
//      // BA 2
//      // DC
//      ts = ts.mirrorVert();
//      final String tmp2 = ts.makeString(true);
//      // DC 6
//      // BA
//      ts = ts.mirrorHoriz();
//      final String tmp6 = ts.makeString(true);
//      // CD 5
//      // AB
//      ts = ts.mirrorVert();
//      final String tmp5 = ts.makeString(true);
//      // BD 7
//      // AC
//      ts = ts.mirrorDiag();
//      final String tmp7 = ts.makeString(true);
//      // DB 8
//      // CA
//      ts = ts.mirrorHoriz();
//      final String tmp8 = ts.makeString(true);
//      // CA 4
//      // DB
//      ts = ts.mirrorVert();
//      final String tmp4 = ts.makeString(true);
//      // AC 3
//      // BD
//      ts = ts.mirrorHoriz();
//      final String tmp3 = ts.makeString(true);
//
//      final String tmp = mCs.makeString(true);
//
//      if (
//        tmp.equals(tmp1) ||
//          tmp.equals(tmp2) ||
//          tmp.equals(tmp3) ||
//          tmp.equals(tmp4) ||
//          tmp.equals(tmp5) ||
//          tmp.equals(tmp6) ||
//          tmp.equals(tmp7) ||
//          tmp.equals(tmp8)
//        ) {
//        singleColourable = true;
//      }
//
//    }
//    return singleColourable;
//  }

  boolean holy() {
    if (mBHolyCalculated) {
      return mBHoly;
    }
    final CoordSet2 neg = this.negative();
    mBHoly = !neg.connected();
    mBHolyCalculated = true;
    return mBHoly;
  }

  private CoordSet2 negative() {
    int c = 0;
    final int minx = mCs.min(0) - 1;
    final int miny = mCs.min(1) - 1;
    final int maxx = mCs.max(0) + 1;
    final int maxy = mCs.max(1) + 1;
    final int negsize = (maxx - minx + 1) * (maxy - miny + 1) - size();
    final CoordSet2 neg = new CoordSet2(negsize, ((CoordSet2) mCs).mFlagFree, ((CoordSet2) mCs).mFlagFixed, ((CoordSet2) mCs).mFlagOneSided);
    for (int x = minx; x <= maxx; x++) {
      for (int y = miny; y <= maxy; y++) {
        if (!((CoordSet2) mCs).exists(x, y)) {
          neg.setSquare(c++, x, y, 0);
        }
      }
    }
    return neg;
  }
}
