package jmason.poly;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A set of <code>xy</code> coordinates
 * @author jmason
 */
public class CoordSet2 extends CoordSetGen<Square> {

  static final String TRANSFORM = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private static final String TRANSFORM2 = "0ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

  int mMinX;
  int mMinY;
  int mMaxX;
  int mMaxY;
  int mWidth;
  int mHeight;
  final boolean mFlagFree;
  final boolean mFlagFixed;
  final boolean mFlagOneSided;

  CoordSet2(final int size, final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
    mSize = size;
    mSet = new SquareSet(size);
    mFlagFree = flagFree;
    mFlagFixed = flagFixed;
    mFlagOneSided = flagOneSided;
  }

  int hasSide(final int dir) {
    int n = 0;
    for (int i = 0; i < mSize; ++i) {
      if (mSet.mSet[i].hasSide(this, dir)) {
        ++n;
      }
    }
    return n == mSize ? 1 : 0;
  }

  boolean twoTouch() {
    for (int i = 0; i < mSize; ++i) {
      if (!mSet.mSet[i].twoTouch(this)) {
        return false;
      }
    }
    return true;
  }

  void calculate() {
    mMinX = Integer.MAX_VALUE;
    mMinY = Integer.MAX_VALUE;
    mMaxX = Integer.MIN_VALUE;
    mMaxY = Integer.MIN_VALUE;
    for (int i = 0; i < mSize; ++i) {
      final int x = getX(i);
      final int y = getY(i);
      if (x > mMaxX) {
        mMaxX = x;
      }
      if (y > mMaxY) {
        mMaxY = y;
      }
      if (x < mMinX) {
        mMinX = x;
      }
      if (y < mMinY) {
        mMinY = y;
      }
    }
    mWidth = mMaxX - mMinX + 1;
    mHeight = mMaxY - mMinY + 1;
  }

  int getWidth() {
    return mWidth;
  }

  int getHeight() {
    return mHeight;
  }

//  int getMinX() {
//    return mMinX;
//  }
//
//  int getMinY() {
//    return mMinY;
//  }
//
//  int getMaxX() {
//    return mMaxX;
//  }
//
//  int getMaxY() {
//    return mMaxY;
//  }
//
//  boolean isStick() {
//    return isStick(0) || isStick(1);
//  }
//
//  private boolean isStick(final int coord) {
//    int val = mSet.getCoord(0, coord);
//    for (int i = 1; i < mSize; i++) {
//      if (mSet.getCoord(i, coord) != val) {
//        return false;
//      }
//    }
//    return true;
//  }
//
//  private boolean ok(final int[] col) {
//    int max = 1;
//    for (int i = 1; i < mSize; i++) {
//      int c = col[i];
//      if (c > max + 1) {
//        return false;
//      }
//      if (c > max) {
//        max = c;
//      }
//    }
//    String t = "";
//    for (int j = 0; j < mSize; j++) {
//      t += col[j];
//    }
//    //System.out.println("ok " + t);
//    return true;
//  }
//
//  private boolean getNext(final int[] col) {
//    for (int i = mSize - 1; i >= 0; i--) {
//      col[i]++;
//      if (col[i] > i + 1) {
//        col[i] = 1;
//      } else {
//        String t = "";
//        for (int j = 0; j < mSize; j++) {
//          t += col[j];
//        }
//        //System.out.println("gn " + t);
//        return true;
//      }
//    }
//    return false;
//  }

  void setSquare(final int i, final int x, final int y, final int colour) {
    ((SquareSet) mSet).setSquare(i, x, y, colour);
  }

  void overSquare(final int i, final int x, final int y, final int colour) {
    ((SquareSet) mSet).overSquare(i, x, y, colour);
  }

  void initMonomino() {
    setSquare(0, 0, 0, Square.BLACK);
  }

  void initDomino() {
    setSquare(0, 0, 0, Square.BLACK);
    setSquare(1, Square.opp(0), 0, Square.WHITE);
  }

//  public void initSquare(final int dy) {
//    setSquare(0, 0, dy, Square.BLACK);
//    setSquare(1, Square.opp(0), Square.opp(0) + dy, Square.BLACK);
//    setSquare(2, Square.opp(0), dy, Square.WHITE);
//    setSquare(3, 0, Square.opp(0) + dy, Square.WHITE);
//  }

  private void add(final int i, final int x, final int y) {
    ((SquareSet) mSet).setSquare(i, x, y);
  }

  CoordSet2 copy(final int x, final int y) {
    final CoordSet2 cs = new CoordSet2(mSize + 1, mFlagFree, mFlagFixed, mFlagOneSided);
    for (int i = 0; i < mSize; ++i) {
      cs.mSet.setElement(i, mSet.getElement(i).copy());
    }
    cs.add(mSize, x, y);
    return cs;
  }

  CoordSet2 copy(final int x1, final int y1, final int x2, final int y2) {
    final CoordSet2 cs = new CoordSet2(mSize + 2, mFlagFree, mFlagFixed, mFlagOneSided);
    for (int i = 0; i < mSize; ++i) {
      cs.mSet.setElement(i, mSet.getElement(i).copy());
    }
    cs.add(mSize, x1, y1);
    cs.add(mSize + 1, x2, y2);
    return cs;
  }

  CoordSet2 copy(final int x1, final int y1, final int x2, final int y2, final int x3, final int y3, final int x4, final int y4) {
    final CoordSet2 cs = new CoordSet2(mSize + 4, mFlagFree, mFlagFixed, mFlagOneSided);
    for (int i = 0; i < mSize; ++i) {
      cs.mSet.setElement(i, mSet.getElement(i).copy());
    }
    cs.add(mSize, x1, y1);
    cs.add(mSize + 1, x2, y2);
    cs.add(mSize + 2, x3, y3);
    cs.add(mSize + 3, x4, y4);
    return cs;
  }

  CoordSet2 mirrorVert() {
    return mirror(-1, 1, 0, 1);
  }

  CoordSet2 mirrorHoriz() {
    return mirror(1, -1, 0, 1);
  }

  CoordSet2 mirrorDiag() {
    return mirror(1, 1, 1, 0);
  }

  private CoordSet2 mirror(final int xm, final int ym, final int x, final int y) {
    final CoordSet2 cs = new CoordSet2(mSize, mFlagFree, mFlagFixed, mFlagOneSided);
    cs.mAllColours = mAllColours;
    for (int i = 0; i < mSize; ++i) {
      ((SquareSet) cs.mSet).setSquare(i, xm * mSet.getCoord(i, x), ym * mSet.getCoord(i, y), mSet.getColour(i));
    }
    return cs;
  }

  boolean exists(final int x, final int y) {
    return ((SquareSet) mSet).exists(x, y);
  }

  @Override
  protected boolean near(final int j, final int i) {
    final int xi = mSet.getX(i);
    final int xj = mSet.getX(j);
    final int yi = mSet.getY(i);
    final int yj = mSet.getY(j);
    return (xi - xj == 1 && yi == yj) || (xi - xj == -1 && yi == yj) || (yi - yj == 1 && xi == xj) || (yi - yj == -1 && xi == xj);
  }

  @Override
  public String toString() {
    final StringBuilder ret = new StringBuilder();
    for (int i = 0; i < mSize; ++i) {
      ret.append(getX(i)).append(getY(i)).append(TRANSFORM2.substring(getColour(i), getColour(i) + 1)).append(' ');
    }
    return ret.toString();
  }

//  public void correctColours(boolean dbg) {
//    if (dbg) {
//      System.out.println("preo " + toString());
//    }
//    order();
//    if (dbg) {
//      System.out.println("post " + toString());
//    }
//    while (correct()) {
//    }
//    if (dbg) {
//      System.out.println("corr " + toString());
//    }
//  }
//
//  boolean correct() {
//    int max = 0;
//    for (int i = 0; i < mSize; i++) {
//      int col = getColour(i);
//      if (col > max + 1) {
//        swapColour(i, col, max + 1);
//        return true;
//      } else {
//        if (col > max) {
//          max = col;
//        }
//      }
//    }
//    return false;
//    //System.out.println("corr " +  toString());
//  }
//
//  private void swapColour(final int pos, final int oldC, final int newC) {
//    for (int i = pos; i < mSize; ++i) {
//      final int col = getColour(i);
//      if (col == oldC) {
//        setColour(i, newC);
//      } else if (col == newC) {
//        setColour(i, oldC);
//      }
//    }
//  }
//
//  private void order() {
//    while (sort()) {
//    }
//  }
//
//  private boolean sort() { // SLOW !!
//    for (int i = 0, j = 1; j < mSize; ++i, ++j) {
//      final Square s1 = (Square) (mSet.getElement(i));
//      final Square s2 = (Square) (mSet.getElement(j));
//      if (s1.comparePosition(s2) < 0) {
//        continue;
//      }
//      mSet.swapPositions(i, j);
//      return true;
//    }
//    return false;
//  }

  @Override
  protected String makeDiagram() {
    final String[][] array = new String[mSize][mSize];
    int maxy = 0;
    for (int x = 0; x < mSize; ++x) {
      Arrays.fill(array[x], " ");
    }
    final int minx = min(0);
    final int miny = min(1);
    for (int i = 0; i < mSize; ++i) {
      final int x = getX(i) - minx;
      final int y = getY(i) - miny;
      if (y > maxy) {
        maxy = y;
      }
      array[x][y] = Square.colourString(mAllColours, mSet.getColour(i));
    }
    final StringBuilder ret = new StringBuilder();
    for (int y = 0; y <= maxy; ++y) {
      for (int x = 0; x < mSize; ++x) {
        ret.append(array[x][y]);
      }
      ret.append("\r\n");
    }
    return ret.toString();
  }

  @Override
  protected String makeString() {
    return makeString(false);
  }

  @Override
  protected String makeString(final boolean withColour) {
    String ret = "";
    int bitSize = 2;
    if (withColour) {
      ++bitSize;
    }
    final int minx = min(0);
    final int miny = min(1);
    for (int i = 0; i < mSize; ++i) {
      int pos = getX(i) - minx;
      String tmp = TRANSFORM.substring(pos, pos + 1);
      pos = getY(i) - miny;
      tmp += TRANSFORM.substring(pos, pos + 1);
      if (withColour) {
        tmp += Square.colourString(mAllColours, mSet.getColour(i));
      }
      ret = insert(ret, tmp, bitSize);
    }
    return ret;
  }

//  public String makeColourString() {
//    StringBuilder ret = new StringBuilder();
//    for (int i = 0; i < mSize; i++) {
//      int col = getColour(i);
//      String tmp = mTransform.substring(col, col + 1);
//      ret.append(tmp);
//    }
//    return ret.toString();
//  }

  @Override
  protected void verify() {
    int white = 0;
    int black = 0;
    assert mSet.getColour(0) == Square.BLACK || mSet.getColour(0) == Square.WHITE : "missing colour";
    if (mSet.getColour(0) == Square.BLACK) {
      ++black;
    } else {
      ++white;
    }
    for (int i = 1; i < mSize; i++) {
      final int t = (mSet.getX(0) - mSet.getX(i)) + (mSet.getY(0) - mSet.getY(i));
      final boolean b = (t & 1) == 0;
      if (mSet.getColour(i) == Square.BLACK) {
        ++black;
      } else {
        ++white;
      }
      assert b && mSet.getColour(0) == mSet.getColour(i) || !b && mSet.getColour(0) == -mSet.getColour(i) : "wrong colour";
    }
    assert getBlack() == black && getWhite() == white && black + white == mSize : "bad colours";
  }

  CoordSet2 perim() {
    final UTest h = new UTest();
    final ArrayList<int[]> a = new ArrayList<>();
    for (int i = 0; i < mSize; i++) {
      tryPerim(h, a, i, 1, 0);
      tryPerim(h, a, i, -1, 0);
      tryPerim(h, a, i, 0, 1);
      tryPerim(h, a, i, 0, -1);
    }
    return aToCs(a);
  }

  private void tryPerim(final UTest h, final ArrayList<int[]> a, final int i, final int dx, final int dy) {
    final int x = mSet.getX(i) + dx;
    final int y = mSet.getY(i) + dy;
    if (exists(x, y)) {
      return;
    }
    final String s = x + ";" + y;
    if (!h.put(s)) {
      return;
    }
    a.add(new int[]{x, y, -mSet.getColour(i)});
  }

  private boolean bCentreHole() {
    return !exists(0, 0);
  }

  private CoordSet2 makeHole() {
    final ArrayList<int[]> list = new ArrayList<>();
    final UTest h = new UTest();
    h.put(0, 0);
    list.add(new int[]{0, 0, Square.BLACK});
    boolean f = true;
    while (f) {
      for (int i = 0; i < list.size(); ++i) {
        f = true;
        final int[] pair = list.get(i);
        if (mhTry(pair, list, h, 1, 0)) {
          break;
        }
        if (mhTry(pair, list, h, -1, 0)) {
          break;
        }
        if (mhTry(pair, list, h, 0, 1)) {
          break;
        }
        if (mhTry(pair, list, h, 0, -1)) {
          break;
        }
        f = false;
      }
    }
    return aToCs(list);
  }

  boolean mhTry(final int[] pair, final ArrayList<int[]> list, final UTest h, final int dx, final int dy) {
    final int x = pair[0] + dx;
    final int y = pair[1] + dy;
    if (h.isIn(x, y)) {
      return false;
    }
    if (exists(x, y)) {
      return false;
    }
    h.put(x, y);
    list.add(new int[]{x, y, -pair[2]});
    return true;
  }

  protected CoordSet2 aToCs(final ArrayList<int[]> a) {
    final CoordSet2 cs = makeAnother(a.size());
    for (int i = 0; i < cs.mSize; ++i) {
      final int[] pair = a.get(i);
      cs.mSet.setElement(i, new Square(pair[0], pair[1], pair[2]));
    }
    return cs;
  }

  /**
   * Return a set of polyominoes that have an enlarged hole with respect to the current coordinate set.
   * @return a set of polyominoes
   */
  public ArrayList<Polyomino> nlistRot90CornerSons() {
    final ArrayList<Polyomino> list = new ArrayList<>();
    if (bCentreHole()) {
      final CoordSet2 hole = makeHole();
      final ArrayList<CoordSet2> nl = listRot90CornerSons(hole);
      for (int i = 0; i < hole.mSize; ++i) {
        trynlr(list, nl, hole, i, 0, 1, 4);
        trynlr(list, nl, hole, i, 0, -1, 4);
        trynlr(list, nl, hole, i, 1, 0, 4);
        trynlr(list, nl, hole, i, -1, 0, 4);
      }
    } else {
      final ArrayList<CoordSet2> cslist = listRot90CornerSons();
      final CoordSet2 centre = new CoordSet2(4, mFlagFree, mFlagFixed, mFlagOneSided);
      centre.setCentre();
      for (CoordSet2 cs : cslist) {
        cs = cs.removeCentre(centre);
        if (cs.connected()) {
          list.add(new Polyomino(cs));
        }
      }
    }
    return list;
  }

//  public ArrayList nlistRot180MidSideSons() {
//    ArrayList list = new ArrayList();
//    if (bCentreHole()) {
//      CoordSet2 hole = makeHole();
//      ArrayList nl = listRot180MidSideSons(hole);
//      for (int i = 0; i < hole.mSize; i++) {
//        trynlr(list, nl, hole, i, 0, 1, 2);
//        trynlr(list, nl, hole, i, 0, -1, 2);
//        trynlr(list, nl, hole, i, 1, 0, 2);
//        trynlr(list, nl, hole, i, -1, 0, 2);
//      }
//    } else {
//      ArrayList cslist = listRot180MidSideSons();
//      CoordSet2 centre = new CoordSet2(2, mFlagFree, mFlagFixed, mFlagOneSided);
//      centre.setCentre();
//      for (Object aCslist : cslist) {
//        CoordSet2 cs = (CoordSet2) aCslist;
//        cs = cs.removeCentre(centre);
//        if (cs.connected()) {
//          list.add(new Polyomino(cs));
//        }
//      }
//    }
//    return list;
//  }

  private void trynlr(final ArrayList<Polyomino> list, final ArrayList<CoordSet2> nl, final CoordSet2 hole, final int i, final int dx, final int dy, final int n) {
    final int x = hole.getX(i) + dx;
    final int y = hole.getY(i) + dy;
    if (hole.exists(x, y)) {
      return;
    }
    boolean b = exists(x, y);
    assert b : "square in current";
    final CoordSet2 out = new CoordSet2(n, mFlagFree, mFlagFixed, mFlagOneSided);
    if (n == 4) {
      out.set4(x, y);
    } else {
      out.set2(x, y);
    }
    b = containsAll(out);
    assert b : "this contains out";
    for (CoordSet2 cs : nl) {
      cs = cs.removeCentre(out);
      if (cs.connected()) {
        list.add(new Polyomino(cs));
      }
    }
  }

  // initialise current object with the four centre squares
  void setCentre() {
    if (mSize == 4) {
      set4(0, 0);
    } else {
      set2(0, 0);
    }
  }

  // initialise current object with four squares in r90 symmetry with input square
  private void set4(final int x, final int y) {
    // CoordSet cs = copy( mX, mY, Square.opp(mY), mX, Square.opp(mX), Square.opp(mY), mY, Square.opp(mX));
    setSquare(0, x, y, Square.BLACK);
    setSquare(1, Square.opp(y), x, Square.BLACK);
    setSquare(2, Square.opp(x), Square.opp(y), Square.WHITE);
    setSquare(3, y, Square.opp(x), Square.WHITE);
  }

  // initialise current object with two squares in r180 symmetry with input square
  private void set2(final int x, final int y) {
    // CoordSet cs = copy( mX, mY, -mX, Square.opp(mY));
    setSquare(0, x, y, Square.BLACK);
    setSquare(1, -x, Square.opp(y), Square.WHITE);
  }

  // copy current object removing another objects squares
  CoordSet2 removeCentre(final CoordSet2 centre) {
    final CoordSet2 ncs = new CoordSet2(mSize - centre.mSize, mFlagFree, mFlagFixed, mFlagOneSided);
    assert containsAll(centre) : "contains centre";
    for (int i = 0, j = 0; i < mSize; ++i) {
      if (!centre.exists(getX(i), getY(i))) {
        ncs.setSquare(j, getX(i), getY(i), getColour(i));
        ++j;
      }

    }
    return ncs;
  }

  // list r90 sons of current object
  /**
   * Perform rotation.
   * @return coordinate sets
   */
  public ArrayList<CoordSet2> listRot90CornerSons() {
    return listRot90CornerSons(null);
  }

  // list r90 sons of current object avoiding putting squares in optional hole
  /**
   * Perform rotation with an optional hole
   * @param hole the hole
   * @return rotation
   */
  public ArrayList<CoordSet2> listRot90CornerSons(final CoordSet2 hole) {
    final ArrayList<CoordSet2> list = new ArrayList<>();
    final UTest h = new UTest();
    final UTest hc = new UTest();
    for (int i = 0; i < mSize; ++i) {
      tryRot90CornerSquare(i, 1, 0, list, h, hc, hole);
      tryRot90CornerSquare(i, -1, 0, list, h, hc, hole);
      tryRot90CornerSquare(i, 0, 1, list, h, hc, hole);
      tryRot90CornerSquare(i, 0, -1, list, h, hc, hole);
    }
    return list;
  }

  private void tryRot90CornerSquare(final int i, final int dx, final int dy, final ArrayList<CoordSet2> list, final UTest h, final UTest hc, final CoordSet2 hole) {
    final int x = getX(i) + dx;
    final int y = getY(i) + dy;
    if (exists(x, y)) {
      return;
    }
    if (hole != null && hole.exists(x, y)) {
      return;
    }
    if (!hc.put(x, y)) {
      return;
    }
    final CoordSet2 cs = copy(x, y, Square.opp(y), x, Square.opp(x), Square.opp(y), y, Square.opp(x));
    final String uniq = cs.makeString();
    if (!h.put(uniq)) {
      return;
    }
    list.add(cs);
  }

  /**
   * Perform rotation.
   * @return coordinate sets
   */
  public ArrayList<CoordSet2> listRot180MidSideSons() {
    return listRot180MidSideSons(null);
  }

  /**
   * Perform rotation with an optional hole
   * @param hole the hole
   * @return rotated coordinate sets.
   */
  public ArrayList<CoordSet2> listRot180MidSideSons(final CoordSet2 hole) {
    final ArrayList<CoordSet2> list = new ArrayList<>();
    final UTest h = new UTest();
    final UTest hc = new UTest();
    for (int i = 0; i < mSize; ++i) {
      tryRot180MidSideSquare(i, 1, 0, list, h, hc, hole);
      tryRot180MidSideSquare(i, -1, 0, list, h, hc, hole);
      tryRot180MidSideSquare(i, 0, 1, list, h, hc, hole);
      tryRot180MidSideSquare(i, 0, -1, list, h, hc, hole);
    }
    return list;
  }

  private void tryRot180MidSideSquare(final int i, final int dx, final int dy, final ArrayList<CoordSet2> list, final UTest h, final UTest hc, final CoordSet2 hole) {
    final int x = getX(i) + dx;
    final int y = getY(i) + dy;
    if (exists(x, y)) {
      return;
    }
    if (hole != null && hole.exists(x, y)) {
      return;
    }

    if (!hc.put(x, y)) {
      return;
    }

    final CoordSet2 cs = copy(x, y, -x, Square.opp(y));
    final String uniq = new UniqueMaker2(cs).uniqString();
    if (!h.put(uniq)) {
      return;
    }
    list.add(cs);
  }

  int perimeterEstimate() {
    return 2 * (max(0) - min(0) + 1) + 2 * (max(1) - min(1) + 1) + 4;
  }

  boolean symXaxis() {
    return symAxis(0, 0);
  }

  boolean symYaxis() {
    return symAxis(1, 0);
  }

  boolean symParaXaxis() {
    return symParaAxis(0);
  }

//  public boolean symParaYaxis() {
//    return symParaAxis(1);
//  }

  private boolean symParaAxis(final int z) {
    final int other = 1 - z;
    final int w = breadth(other);
    return (w & 1) == 0 && symAxis(z, min(other) + w / 2);
  }

  private boolean symAxis(final int z, final int offset) {
    final UTest h = new UTest();
    for (int i = 0; i < mSize; ++i) {
      final int x, y;
      if (z == 0) {
        x = mSet.getX(i);
        y = Square.opp(mSet.getY(i) - offset);
      } else {
        x = Square.opp(mSet.getX(i) - offset);
        y = mSet.getY(i);
      }
      h.put(x, y);
    }
    for (int i = 0; i < mSize; ++i) {
      final int x, y;
      if (z == 0) {
        x = mSet.getX(i);
        y = mSet.getY(i) - offset;
      } else {
        x = mSet.getX(i) - offset;
        y = mSet.getY(i);
      }
      if (!h.isIn(x, y)) {
        return false;
      }
    }
    return true;
  }

  /*  X
   * XXX
   *  XX
   */
  boolean symDiag() {
    return sym(0) || sym(1);
  }

  boolean symHoriz() {
    return sym(2);
  }

  boolean symVert() {
    return sym(3);
  }

  private boolean sym(final int d) {
    return makeString().equals(flip(d).makeString());
  }

  boolean symReflect() {
    return symHoriz() || symVert() || symDiag();
  }

  private CoordSet2 flip(final int d) {
    final CoordSet2 ncs = new CoordSet2(mSize, mFlagFree, mFlagFixed, mFlagOneSided);
    for (int i = 0; i < mSize; ++i) {
      if (d == 0) {
        ncs.setSquare(i, getY(i), getX(i), getColour(i));
      } else if (d == 1) {
        ncs.setSquare(i, Square.opp(getY(i)), Square.opp(getX(i)), getColour(i));
      } else if (d == 2) {
        ncs.setSquare(i, getX(i), Square.opp(getY(i)), getColour(i));
      } else if (d == 3) {
        ncs.setSquare(i, Square.opp(getX(i)), getY(i), getColour(i));
      } else {
        throw new RuntimeException();
      }
    }
    return ncs;
  }

  // used when "this" is sym on y axis and also sym on a parallel to the x axis
  void rotate() {
    final int offset = min(1) + breadth(1) / 2;
    for (int i = 0; i < mSize; ++i) {
      int x = getX(i);
      int y = getY(i) - offset;
      final int t = x;
      x = Square.opp(y);
      y = t;
      overSquare(i, x, y, mSet.getColour(i));
    }
  }

  @Override
  protected CoordSet2 makeAnother(final int size) {
    return new CoordSet2(size, mFlagFree, mFlagFixed, mFlagOneSided);
  }

  @Override
  protected String makeUnique() {
    return new UniqueMaker2(this).uniqString();
  }

  // return true if current object contains any piece of another
  boolean overlaps(final CoordSet2 hole) {
    final UTest h = new UTest();
    for (int i = 0; i < mSize; ++i) {
      h.put(mSet.getX(i), mSet.getY(i));
    }
    for (int i = 0; i < hole.mSize; ++i) {
      if (h.isIn(hole.mSet.getX(i), hole.mSet.getY(i))) {
        return true;
      }
    }
    return false;

  }

  boolean containsAll(final CoordSet2 cs) {
    for (int i = 0; i < cs.mSize; ++i) {
      if (!exists(cs.getX(i), cs.getY(i))) {
        return false;
      }
    }
    return true;
  }

//  public boolean encases(final CoordSet2 cs) {
//    calculate();
//    cs.calculate();
//
//    for (int diffY = mMinY - cs.mMinY; cs.mMaxY + diffY <= mMaxY; diffY++) {
//      for (int diffX = mMinX - cs.mMinX; cs.mMaxX + diffX <= mMaxX; diffX++) {
//        if (encases(cs, diffX, diffY)) {
//          return true;
//        }
//      }
//    }
//    //System.out.println("this\r\n" + makeDiagram() + "does not encase\r\n" + cs.makeDiagram());
//    return false;
//  }
//
//  private boolean encases(final CoordSet2 cs, final int dX, final int dY) {
//    for (int i = 0; i < cs.mSize; i++) {
//      if (!exists(cs.getX(i) + dX, cs.getY(i) + dY)) {
//        return false;
//      }
//    }
//    return true;
//  }

  int freeEdge(final int colour) {
    int e = 0;
    final UTest u = new UTest();
    for (int i = 0; i < mSize; i++) {
      if (getColour(i) == colour) {
        e += countFree(i, 1, 0, u);
        e += countFree(i, -1, 0, u);
        e += countFree(i, 0, 1, u);
        e += countFree(i, 0, -1, u);
      }
    }
    return e;
  }

  private int countFree(final int i, final int dx, final int dy, final UTest u) {
    final int x = getX(i) + dx;
    final int y = getY(i) + dy;
    if (!u.put(x, y)) {
      return 0;
    }
    return exists(x, y) ? 0 : 1;
  }

  int freeLessEdge() {
    return getWhite() < getBlack() ? freeEdge(Square.WHITE) : freeEdge(Square.BLACK);
  }
}
