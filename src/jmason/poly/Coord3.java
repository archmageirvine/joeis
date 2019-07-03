package jmason.poly;

/**
 * A 3 dimensional coordinate used in polyominoids and not polycubes.
 * @author jmason
 */
class Coord3 {

  int mX;
  int mY;
  int mZ;

  Coord3(final int x, final int y, final int z) {
    build(x, y, z);
  }

  Coord3(final Coord3 c1, final int d1, final int d2, final int dc) {
    if (dc == 0) {
      build(c1.mX, c1.mY + d1, c1.mZ + d2);
    } else if (dc == 1) {
      build(c1.mX + d1, c1.mY, c1.mZ + d2);
    } else {
      build(c1.mX + d1, c1.mY + d2, c1.mZ);
    }
  }

  int get(final int q) {
    if (q == 0) {
      return mX;
    }
    if (q == 1) {
      return mY;
    }
    return mZ;

  }

  void build(final int x, final int y, final int z) {
    mX = x;
    mY = y;
    mZ = z;
  }

  boolean less(final Coord3 other) {
    if (mX < other.mX) {
      return true;
    }
    if (mX > other.mX) {
      return false;
    }
    if (mY < other.mY) {
      return true;
    }
    if (mY > other.mY) {
      return false;
    }
    if (mZ < other.mZ) {
      return true;
    }
    if (mZ > other.mZ) {
      return false;
    }
    throw new RuntimeException();
  }

  public boolean same(final Coord3 other) {
    return mX == other.mX && mY == other.mY && mZ == other.mZ;
  }

  int differentAxis(final Coord3 other) {
    if (mX != other.mX) {
      return 0;
    }
    if (mY != other.mY) {
      return 1;
    }
    if (mZ != other.mZ) {
      return 2;
    }
    throw new RuntimeException();
  }

  Coord3 rotxy() {
    return new Coord3(Square.opp(mY), mX, mZ);
  }

  Coord3 rotxz() {
    return new Coord3(Square.opp(mZ), mY, mX);
  }

  Coord3 mirrorxy() {
    return new Coord3(mY, mX, mZ);
  }

  Coord3 mirrorxz() {
    return new Coord3(mZ, mY, mX);
  }

  Coord3 mirrorz() {
    return new Coord3(mX, mY, -mZ);
  }

  String makeDiagram() {
    return mX + "," + mY + "," + mZ;
  }

  boolean isSame(Coord3 other) {
    return mX == other.mX && mY == other.mY && mZ == other.mZ;
  }

  protected Coord3 copy() {
    return new Coord3(mX, mY, mZ);
  }
}
