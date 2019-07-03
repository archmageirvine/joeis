package jmason.poly;

import java.util.ArrayList;

/**
 * A polyominoid.
 * @author jmason
 */
public class PolySide  extends PolyBase {

  final int mSize;
  final Side[] mSides;
  String mUniq;

  public PolySide(final int size) {
    this.mSize = size;
    mSides = new Side[size];
    if (size == 1) {
      mSides[0] = new Side(new Coord3Set(
        new Coord3(0, 0, 0),
        new Coord3(0, 1, 0),
        new Coord3(1, 1, 0),
        new Coord3(1, 0, 0)));
    }
  }

  public PolySide(final PolySide prev, final Coord3Set cos) {
    this.mSize = prev.mSize + 1;
    mSides = new Side[mSize];
    System.arraycopy(prev.mSides, 0, mSides, 0, prev.mSize);
    mSides[prev.mSize] = new Side(cos);
  }

  // build a list (without duplicates) of polyominoes that may be generated from current
  // and that are not generatable from previous
  public ArrayList<PolySide> listSons() {
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
    Coord3Set cosnew = new Coord3Set(c1, c2, d1, d2);
    if (this.hasSide(cosnew)) {
      return;
    }
    list.add(new PolySide(this, cosnew));
  }

  public boolean hasSide(final Coord3Set c) {
    for (int i = 0; i < mSize; i++) {
      if (mSides[i].mCoords.isSame(c)) {
        return true;
      }
    }
    return false;
  }

  public String makeDiagram() {
    final StringBuilder ret = new StringBuilder();
    for (int i = 0; i < mSize; i++) {
      ret.append('(').append(mSides[i].makeDiagram()).append(')');
    }
    return ret.toString();
  }

  public String makeString() {
    String ret = "";
    //int bitSize = 12;

    int minx = this.min(0);
    int miny = this.min(1);
    int minz = this.min(2);
    for (int i = 0; i < this.mSize; i++) {
      final Side s = this.mSides[i];
      String sideString = "";
      for (int j = 0; j < 4; j++) {
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
    //System.err.println(ret);
    //System.err.println(this.toString());
    //System.err.println(this.makeDiagram());
    return ret;
  }

  int min(int q) {
    int ret = mSides[0].min(q);
    for (int i = 1; i < mSize; ++i) {
      int tmp = mSides[i].min(q);
      if (tmp < ret) {
        ret = tmp;
      }
    }
    return ret;
  }

  public void setSide(final int i, final Side s) {
    mSides[i] = s;
  }

  public PolySide rotxy() {
    //System.err.println("rotxy");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; i++) {
      p.setSide(i, mSides[i].rotxy());
    }
    return p;
  }

  public PolySide rotxz() {
    //System.err.println("rotxz");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; i++) {
      p.setSide(i, mSides[i].rotxz());
    }
    return p;
  }

  public PolySide mirrorxy() {
    //System.err.println("mirrorxy");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; i++) {
      p.setSide(i, mSides[i].mirrorxy());
    }
    return p;
  }

  public PolySide mirrorxz() {
    //System.err.println("mirrorxz");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; i++) {
      p.setSide(i, mSides[i].mirrorxz());
    }
    return p;
  }

  public PolySide mirrorz() {
    //System.err.println("mirrorz");
    final PolySide p = new PolySide(mSize);
    for (int i = 0; i < mSize; i++) {
      p.setSide(i, mSides[i].mirrorz());
    }
    return p;
  }

  public PolySide clone() {
    final PolySide ps = new PolySide(this.mSize);
    for (int i = 0; i < mSize; i++) {
      ps.setSide(i, this.mSides[i].clone());
    }
    return ps;
  }

  public String getUniq() {
    if (mUniq == null) {
      mUniq = new UniqueMaker3s(this).uniqString();
    }
    return mUniq;
  }
}
