package jmason.poly;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.util.Pair;

/**
 * A set of <code>xy</code> coordinates of triangles in a polyiamond
 * 
 *  1   ^       /
 *  |  / \     /
 *  | /   \   /
 *  |/     \ /
 *  0   1   2
 * 
 * a coordinate pair x,y, for x+(y+1)/2 even, means there is a point-up triangle with x,y as its midpoint
 * a coordinate pair x,y, for x+(y+1)/2 odd, means there is a point-down triangle with x,y as its midpoint
 * @author jmason
 */
public class CoordSet2T extends CoordSetGen<Triangle> {

  private int mMinX;
  private int mMinY;
  private int mMaxX;
  private int mMaxY;
  private int mWidth;
  private int mHeight;
  private final boolean mFlagFree;
  final boolean mFlagFixed;
  final boolean mFlagOneSided;

  @Override
  protected void verify() {
  }

  /**
   * Triangular coordinates.
   * @param size the size
   * @param flagFree free
   * @param flagFixed fixed
   * @param flagOneSided one-sided
   */
  public CoordSet2T(final int size, final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
    mSize = size;
    mSet = new TriangleSet(size);
    mFlagFree = flagFree;
    mFlagFixed = flagFixed;
    mFlagOneSided = flagOneSided;
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

  int getMinX() {
    return mMinX;
  }

  int getMinY() {
    return mMinY;
  }

  int getMaxX() {
    return mMaxX;
  }

  int getMaxY() {
    return mMaxY;
  }

  void setTriangle(final int i, final int x, final int y, final int colour) {
    ((TriangleSet) mSet).setTriangle(i, x, y, colour);
  }

  /** The monoiamond. */
  public void initMonoiamond() {
    setTriangle(0, 1, 1, Square.BLACK);
  }

  private void add(final int i, final int x, final int y) {
    ((TriangleSet) mSet).setTriangle(i, x, y);
  }

  CoordSet2T copy(final int x, final int y) {
    final CoordSet2T cs = new CoordSet2T(mSize + 1, mFlagFree, mFlagFixed, mFlagOneSided);
    for (int i = 0; i < mSize; ++i) {
      cs.mSet.setElement(i, mSet.getElement(i).copy());
    }
    cs.add(mSize, x, y);
    cs.placeInSextant();
    return cs;
  }

  CoordSet2T mirrorVert() {
    return mirror(-1, 1, 0, 1);
  }

  CoordSet2T mirrorHoriz() {
    return mirror(1, -1, 0, 1);
  }

  private CoordSet2T mirror(final int xm, final int ym, final int x, final int y) {
    final CoordSet2T cs = new CoordSet2T(mSize, mFlagFree, mFlagFixed, mFlagOneSided);
    cs.mAllColours = mAllColours;
    for (int i = 0; i < mSize; ++i) {
      ((TriangleSet) (cs.mSet)).setTriangle(i, xm * mSet.getCoord(i, x), ym * mSet.getCoord(i, y), mSet.getColour(i));

    }
    cs.placeInSextant();
    return cs;
  }

  CoordSet2T rotate60() {
    final CoordSet2T cs = new CoordSet2T(mSize, mFlagFree, mFlagFixed, mFlagOneSided);
    cs.mAllColours = mAllColours;
    //placeInSextant();
    //if (dbg) System.out.println("aft sext this : " + toString());        
    for (int i = 0; i < mSize; ++i) {
      final Triangle t = mSet.getElement(i);
      if (t.up()) {
        final int n = (t.getX() + t.getX() - t.getY() - 1) / 4;
        cs.setTriangle(i, t.getY() + n, -1 - n - n, t.mColour);
      } else {
        final int n = (t.getX() + t.getX() - t.getY() - 3) / 4;
        cs.setTriangle(i, t.getY() + n + 1, -1 - n - n, t.mColour);
      }

    }
    cs.placeInSextant();
    return cs;
  }

  private void placeInSextant() {
    int maxd = 0;
    for (int i = 0; i < mSize; ++i) {
      final Triangle t = mSet.getElement(i);
      if (t.getY() < maxd) {
        maxd = t.getY();
      }

    }
    if (maxd < 0) {
      shiftUp(1 - maxd);
    }
    shiftLeft(displRight());
  }

  private void shiftUp(final int d) {
    for (int i = 0; i < mSize; ++i) {
      final Triangle t = mSet.getElement(i);
      t.mCoords[0] += d / 2;
      t.mCoords[1] += d;
    }
  }

  // returns displacement from 60 degree diagonal; always even
  int displRight() {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < mSize; ++i) {
      final Triangle t = mSet.getElement(i);
      final int d = t.displRight();
      if (d < min) {
        min = d;
      }
    }
    return min;
  }

  private void shiftLeft(final int d) {
    for (int i = 0; i < mSize; ++i) {
      final Triangle t = mSet.getElement(i);
      t.mCoords[0] -= d;
    }
  }

  boolean exists(final int x, final int y) {
    return ((TriangleSet) mSet).exists(x, y);
  }

  @Override
  public String toString() {
    final StringBuilder ret = new StringBuilder();
    for (int i = 0; i < mSize; ++i) {
      ret.append(getX(i)).append(',').append(getY(i)).append(' ');
    }
    return ret.toString();
  }

  @Override
  protected String makeDiagram() {
    final String[][] array = new String[mSize + 1][mSize * 2];
    int maxy = 0;
    for (int x = 0; x < mSize + 1; ++x) {
      for (int y = 0; y < mSize * 2; ++y) {
        array[x][y] = " ";
      }
    }
    final int minx = min(0);
    final int miny = min(1);
    for (int i = 0; i < mSize; ++i) {
      final int x = getX(i) - minx;
      final int y = getY(i) - miny;
      if (y > maxy) {
        maxy = y;
      }
      array[x][y] = mSet.mSet[i].up() ? "^" : "v";
    }
    final StringBuilder ret = new StringBuilder();
    for (int y = maxy; y >= 0; y -= 2) {
      for (int x = 0; x < mSize; ++x) {
        ret.append(array[x][y]);
      }
      ret.append(System.lineSeparator());
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
    final int bitSize = withColour ? 3 : 2;
    for (int i = 0; i < mSize; i++) {
      int pos = getX(i);
      final StringBuilder tmp = new StringBuilder(CoordSet2.TRANSFORM.substring(pos, pos + 1));
      pos = getY(i);
      tmp.append(CoordSet2.TRANSFORM, pos, pos + 1);
      if (withColour) {
        tmp.append(Square.colourString(mAllColours, mSet.getColour(i)));
      }
      ret = insert(ret, tmp.toString(), bitSize);
    }
    return ret;
  }

  String makeColourString() {
    final StringBuilder ret = new StringBuilder();
    for (int i = 0; i < mSize; ++i) {
      final int col = getColour(i);
      ret.append(CoordSet2.TRANSFORM, col, col + 1);
    }
    return ret.toString();
  }

  protected CoordSet2T aToCs(final ArrayList<int[]> a) {
    final CoordSet2T cs = makeAnother(a.size());
    for (int i = 0; i < cs.mSize; ++i) {
      final int[] pair = a.get(i);
      cs.mSet.setElement(i, new Triangle(pair[0], pair[1], pair[2]));
    }
    return cs;
  }

  @Override
  protected CoordSet2T makeAnother(final int size) {
    return new CoordSet2T(size, mFlagFree, mFlagFixed, mFlagOneSided);
  }

  @Override
  protected String makeUnique() {
    return new UniqueMaker2T(this).uniqString();
  }

  /**
   * Compute the size of the perimeter of this coordinate set.
   * @return perimeter size
   */
  public int perimeterSize() {
    final HashSet<Pair<Integer, Integer>> h = new HashSet<>();
    for (int k = 0; k < mSize; k++) {
      final int x = mSet.getX(k);
      final int y = mSet.getY(k);
      h.add(new Pair<>(x + 1, y));
      h.add(new Pair<>(x - 1, y));
      h.add(new Pair<>(x, mSet.mSet[k].up() ? y - 2 : y + 2));
    }
    for (int k = 0; k < mSize; k++) {
      final int x = mSet.getX(k);
      final int y = mSet.getY(k);
      h.remove(new Pair<>(x, y));
    }
    return h.size();
  }

  /**
   * Compute the size of the edge perimeter of this coordinate set.
   * @return perimeter size
   */
  public int edgePerimeterSize() {
    final HashSet<Pair<Integer, Integer>> h = new HashSet<>();
    for (int k = 0; k < mSize; k++) {
      final int x = mSet.getX(k);
      final int y = mSet.getY(k);
      h.add(new Pair<>(x, y));
    }
    int perim = 0;
    for (int k = 0; k < mSize; k++) {
      final int x = mSet.getX(k);
      final int y = mSet.getY(k);
      if (!h.contains(new Pair<>(x + 1, y))) {
        ++perim;
      }
      if (!h.contains(new Pair<>(x - 1, y))) {
        ++perim;
      }
      if (!h.contains(new Pair<>(x, mSet.mSet[k].up() ? y - 2 : y + 2))) {
        ++perim;
      }
    }
    return perim;
  }
}
