package jmason.poly;

/**
 * A set of xyz coordinates used in polyominoids and not polycubes.
 * Note that corners are consecutive!
 * @author jmason
 */
class Coord3Set {

  final Coord3[] mCoords = new Coord3[4];
  private int mNc = 0;

  Coord3Set(final Coord3 c1, final Coord3 c2, final Coord3 c3, final Coord3 c4) {
    add(c1);
    add(c2);
    add(c3);
    add(c4);
  }

  Coord3Set(final Coord3 c1, final Coord3 c2, final int d1, final int d2) {
    add(c1);
    add(c2);
    final int dc = c1.differentAxis(c2);
    add(new Coord3(c2, d1, d2, dc));
    add(new Coord3(c1, d1, d2, dc));
  }

  void add(final Coord3 c) {
    mCoords[mNc++] = c;
  }

//  void shift(final int p) {
//    System.arraycopy(mCoords, p, mCoords, p + 1, mNc - p);
//  }

  Coord3 getCoord(final int i) {
    return mCoords[i];
  }

  boolean contains(final Coord3 c) {
    for (final Coord3 coord3 : mCoords) {
      if (coord3.same(c)) {
        return true;
      }
    }
    return false;
  }

  int min(final int q) {
    int ret = getCoord(0).get(q);
    for (final Coord3 c : mCoords) {
      final int tmp = c.get(q);
      if (tmp < ret) {
        ret = tmp;
      }
    }
    return ret;
  }

  Coord3Set rotxy() {
    return new Coord3Set(mCoords[0].rotxy(),
      mCoords[1].rotxy(),
      mCoords[2].rotxy(),
      mCoords[3].rotxy()
    );
  }

  Coord3Set rotxz() {
    return new Coord3Set(mCoords[0].rotxz(),
      mCoords[1].rotxz(),
      mCoords[2].rotxz(),
      mCoords[3].rotxz()
    );
  }

  Coord3Set mirrorxy() {
    return new Coord3Set(mCoords[0].mirrorxy(),
      mCoords[1].mirrorxy(),
      mCoords[2].mirrorxy(),
      mCoords[3].mirrorxy()
    );
  }

  Coord3Set mirrorxz() {
    return new Coord3Set(mCoords[0].mirrorxz(),
      mCoords[1].mirrorxz(),
      mCoords[2].mirrorxz(),
      mCoords[3].mirrorxz()
    );
  }

  Coord3Set mirrorz() {
    return new Coord3Set(mCoords[0].mirrorz(),
      mCoords[1].mirrorz(),
      mCoords[2].mirrorz(),
      mCoords[3].mirrorz()
    );
  }

  String makeDiagram() {
    final StringBuilder ret = new StringBuilder();
    for (final Coord3 c : mCoords) {
      ret.append('[').append(c.makeDiagram()).append(']');
    }
    return ret.toString();
  }

  boolean isSame(final Coord3Set other) {
    for (int i = 0; i < mCoords.length; ++i) {
      if (mCoords[i].isSame(other.mCoords[0])) {
        for (int j = i + 1, k = 1; k < mCoords.length; ++j, ++k) {
          if (!mCoords[j & 3].isSame(other.mCoords[k])) {
            for (j = i + 7, k = 1; k < mCoords.length; --j, ++k) {
              if (!mCoords[j & 3].isSame(other.mCoords[k])) {
                return false;
              }
            }
          }
        }
        return true;
      }
    }
    return false;
  }

  protected Coord3Set copy() {
    return new Coord3Set(mCoords[0].copy(), mCoords[1].copy(), mCoords[2].copy(), mCoords[3].copy());
  }
}
