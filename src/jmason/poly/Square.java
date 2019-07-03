package jmason.poly;

/**
 * A square of a polyomino.
 * @author jmason
 */
public class Square extends Element<Square> {
  public Square(final int x, final int y, final int colour) {
    mCoords = new int[2];
    mCoords[0] = x;
    mCoords[1] = y;
    mColour = colour;
  }

  public boolean hasSide(final CoordSet2 cs2, final int dir) {
    if (dir == 0 && (cs2.exists(mCoords[0] + 1, mCoords[1]) || cs2.exists(mCoords[0] - 1, mCoords[1]))) {
      return true;
    }
    return dir == 1 && (cs2.exists(mCoords[0], mCoords[1] + 1) || cs2.exists(mCoords[0], mCoords[1] - 1));
  }

  public boolean twoTouch(final CoordSet2 cs2) {
    int n = 0;
    if (cs2.exists(mCoords[0] + 1, mCoords[1])) {
      ++n;
    }
    if (cs2.exists(mCoords[0] - 1, mCoords[1])) {
      ++n;
    }
    if (cs2.exists(mCoords[0], mCoords[1] + 1)) {
      ++n;
    }
    if (cs2.exists(mCoords[0], mCoords[1] - 1)) {
      ++n;
    }
    return n >= 2;
  }

  @Override
  protected Square copy(final boolean flip) {
    if (flip) {
      return new Square(getX(), getY(), -mColour);
    } else {
      return new Square(getX(), getY(), mColour);
    }
  }

//  public int comparePosition(final Square s) {
//    if (getX() < s.getX()) {
//      return -1;
//    }
//    if (getX() > s.getX()) {
//      return 1;
//    }
//    if (getY() < s.getY()) {
//      return -1;
//    }
//    if (getY() > s.getY()) {
//      return 1;
//    }
//    throw new RuntimeException();
//  }
}
