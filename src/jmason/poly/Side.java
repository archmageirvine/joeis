package jmason.poly;

/**
 * A square of a polyominoid.
 * @author jmason
 */
public class Side {

  final Coord3Set mCoords;

  Side(final Coord3Set coords) {
    mCoords = coords;
  }

  Coord3 getCorner(final int i) {
    return mCoords.getCoord(i);
  }

  int min(final int q) {
    return mCoords.min(q);
  }

  Side rotxy() {
    //System.err.println("rotxy");
    return new Side(mCoords.rotxy());
  }

  Side rotxz() {
    //System.err.println("rotxz");
    return new Side(mCoords.rotxz());
  }

  Side mirrorxy() {
    //System.err.println("mirrorxy");
    return new Side(mCoords.mirrorxy());
  }

  Side mirrorxz() {
    //System.err.println("mirrorxz");
    return new Side(mCoords.mirrorxz());
  }

  Side mirrorz() {
    //System.err.println("mirrorz");
    return new Side(mCoords.mirrorz());
  }

  String makeDiagram() {
    return mCoords.makeDiagram();
  }

//  int dir() {
//    for (int i = 0; i < 3; i++) {
//      final int tmp = mCoords.mCoords[0].get(i);
//      if (tmp == mCoords.mCoords[1].get(i) && tmp == mCoords.mCoords[2].get(i) && tmp == mCoords.mCoords[3].get(i)) {
//        return i;
//      }
//    }
//    return -1;
//  }
//
//  int same(final Coord3 c1, final Coord3 c2) {
//    final int d = dir();
//    if (d == 0) {
//      return c1.mY == c2.mY ? 1 : 2;
//    } else if (d == 1) {
//      return c1.mX == c2.mX ? 0 : 2;
//    } else {
//      return c1.mY == c2.mY ? 1 : 0;
//    }
//  }
//
//  public int orient(Coord3 c1, Coord3 c2) {
//    int d = dir();
//    int s = same(c1, c2);
//
//    for (int i = 0; i < 4; i++) {
//      if (mCoords.mCoords[i] == c1) {
//        continue;
//      }
//      if (mCoords.mCoords[i] == c2) {
//        continue;
//      }
//      return -(c1.get(s) - mCoords.mCoords[i].get(s));
//    }
//    Common.verify(false, "orient");
//    return -1;
//  }

  protected Side copy() {
    return new Side(mCoords.copy());
  }
}
