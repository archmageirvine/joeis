package jmason.poly;

/**
 * A square of a polyominoid.
 * @author jmason
 */
public class Side {
  final Coord3Set mCoords;

  public Side(Coord3Set coords) {
    mCoords = coords;
  }

  public Coord3 getCorner(final int i) {
    return mCoords.getCoord(i);
  }

  public int min(final int q) {
    return mCoords.min(q);
  }

  public Side rotxy() {
    //System.err.println("rotxy");
    return new Side(mCoords.rotxy());
  }

  public Side rotxz() {
    //System.err.println("rotxz");
    return new Side(mCoords.rotxz());
  }

  public Side mirrorxy() {
    //System.err.println("mirrorxy");
    return new Side(mCoords.mirrorxy());
  }

  public Side mirrorxz() {
    //System.err.println("mirrorxz");
    return new Side(mCoords.mirrorxz());
  }

  public Side mirrorz() {
    //System.err.println("mirrorz");
    return new Side(mCoords.mirrorz());
  }

  public String makeDiagram() {
    return mCoords.makeDiagram();
  }

  public int dir() {
    for (int i = 0; i < 3; i++) {

      int tmp = this.mCoords.mCoords[0].get(i);
      if (tmp == this.mCoords.mCoords[1].get(i) &&
        tmp == this.mCoords.mCoords[2].get(i) &&
        tmp == this.mCoords.mCoords[3].get(i)) {
        return i;
      }


    }
    return -1;
  }

  public int same(Coord3 c1, Coord3 c2) {
    int d = dir();

    if (d == 0) {
      if (c1.mY == c2.mY) {
        return 1;
      } else {
        return 2;
      }
    } else if (d == 1) {
      if (c1.mX == c2.mX) {
        return 0;
      } else {
        return 2;
      }
    } else {
      if (c1.mY == c2.mY) {
        return 1;
      } else {
        return 0;
      }
    }

  }

//  public int orient(Coord3 c1, Coord3 c2) {
//    int d = dir();
//    int s = same(c1, c2);
//
//    for (int i = 0; i < 4; i++) {
//      if (this.mCoords.mCoords[i] == c1) {
//        continue;
//      }
//      if (this.mCoords.mCoords[i] == c2) {
//        continue;
//      }
//      return -(c1.get(s) - this.mCoords.mCoords[i].get(s));
//    }
//    Common.verify(false, "orient");
//    return -1;
//  }

  public Side clone() {
    return new Side(this.mCoords.clone());
  }
}
