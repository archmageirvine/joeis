package jmason.poly;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A polyominoid.
 * @author jmason
 */
class PolySide  extends PolyBase {

  private final int mSize;
  private final Side[] mSides;
  private String mUniq;

  PolySide(final int size) {
    mSize = size;
    mSides = new Side[size];
    if (size == 1) {
      mSides[0] = new Side(new Coord3Set(
        new Coord3(0, 0, 0),
        new Coord3(0, 1, 0),
        new Coord3(1, 1, 0),
        new Coord3(1, 0, 0)));
    }
  }

  PolySide(final PolySide prev, final Coord3Set cos) {
    mSize = prev.mSize + 1;
    mSides = Arrays.copyOf(prev.mSides, mSize);
    mSides[prev.mSize] = new Side(cos);
  }

  // build a list (without duplicates) of polyominoes that may be generated from current
  // and that are not generable from previous
  ArrayList<PolySide> listSons() {
    final ArrayList<PolySide> list = new ArrayList<>();
    for (int i = 0; i < mSize; ++i) {
      tryEdge(mSides[i].getCorner(0), mSides[i].getCorner(1), list);
      tryEdge(mSides[i].getCorner(1), mSides[i].getCorner(2), list);
      tryEdge(mSides[i].getCorner(2), mSides[i].getCorner(3), list);
      tryEdge(mSides[i].getCorner(3), mSides[i].getCorner(0), list);
    }
    return list;
  }

  void tryEdge(final Coord3 c1, final Coord3 c2, final ArrayList<PolySide> list) {
    trySide(c1, c2, 0, 1, list);
    trySide(c1, c2, 0, -1, list);
    trySide(c1, c2, 1, 0, list);
    trySide(c1, c2, -1, 0, list);
  }

  void trySide(final Coord3 c1, final Coord3 c2, final int d1, final int d2, final ArrayList<PolySide> list) {
    final Coord3Set cosnew = new Coord3Set(c1, c2, d1, d2);
    if (hasSide(cosnew)) {
      return;
    }
    list.add(new PolySide(this, cosnew));
  }

  boolean hasSide(final Coord3Set c) {
    for (int i = 0; i < mSize; ++i) {
      if (mSides[i].mCoords.isSame(c)) {
        return true;
      }
    }
    return false;
  }

  String makeDiagram() {
    final StringBuilder ret = new StringBuilder();
    for (int i = 0; i < mSize; ++i) {
      ret.append('(').append(mSides[i].makeDiagram()).append(')');
    }
    return ret.toString();
  }

  String makeString() {
    String ret = "";
    final int minx = min(0);
    final int miny = min(1);
    final int minz = min(2);
    for (int i = 0; i < mSize; ++i) {
      final Side s = mSides[i];
      String sideString = "";
      for (int j = 0; j < 4; ++j) {
        int pos = s.mCoords.mCoords[j].mX - minx;
        String tmp = CoordSet2.TRANSFORM.substring(pos, pos + 1);
        pos = s.mCoords.mCoords[j].mY - miny;
        tmp += CoordSet2.TRANSFORM.substring(pos, pos + 1);
        pos = s.mCoords.mCoords[j].mZ - minz;
        tmp += CoordSet2.TRANSFORM.substring(pos, pos + 1);
        sideString = insert(sideString, tmp, 3);
      }
      ret = insert(ret, sideString, 12);
    }
    return ret;
  }

  int min(final int q) {
    int ret = mSides[0].min(q);
    for (int i = 1; i < mSize; ++i) {
      final int tmp = mSides[i].min(q);
      if (tmp < ret) {
        ret = tmp;
      }
    }
    return ret;
  }

  void setSide(final int i, final Side s) {
    mSides[i] = s;
  }

  PolySide rotxy() {
    //System.err.println("rotxy");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; ++i) {
      p.setSide(i, mSides[i].rotxy());
    }
    return p;
  }

  PolySide rotxz() {
    //System.err.println("rotxz");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; ++i) {
      p.setSide(i, mSides[i].rotxz());
    }
    return p;
  }

  PolySide mirrorxy() {
    //System.err.println("mirrorxy");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; ++i) {
      p.setSide(i, mSides[i].mirrorxy());
    }
    return p;
  }

  PolySide mirrorxz() {
    //System.err.println("mirrorxz");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; ++i) {
      p.setSide(i, mSides[i].mirrorxz());
    }
    return p;
  }

  PolySide mirrorz() {
    //System.err.println("mirrorz");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; ++i) {
      p.setSide(i, mSides[i].mirrorz());
    }
    return p;
  }

  PolySide copy() {
    final PolySide ps = new PolySide(mSize);
    for (int i = 0; i < mSize; ++i) {
      ps.setSide(i, mSides[i].copy());
    }
    return ps;
  }

  String getUniq() {
    if (mUniq == null) {
      mUniq = new UniqueMaker3s(this).uniqString();
    }
    return mUniq;
  }
}
