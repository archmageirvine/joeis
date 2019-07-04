package jmason.poly;

/**
 * A generic coordinate set, either xy or xyz.
 * @author jmason
 * @param <T> type of set
 */
public abstract class CoordSetGen<T extends Element<T>> extends PolyBase {

  protected ElementSet<T> mSet;
  int mSize;
  protected boolean mAllColours;

  int getX(final int i) {
    return mSet.getX(i);
  }

  int getY(final int i) {
    return mSet.getY(i);
  }

  int getColour(final int i) {
    return mSet.getColour(i);
  }

  void setColour(final int i, final int col) {
    mSet.setColour(i, col);
  }

  protected abstract CoordSetGen<T> makeAnother(final int size);

  CoordSetGen<T> copySet() {
    final CoordSetGen<T> cs = makeAnother(mSize);
    cs.mAllColours = false;
    for (int i = 0; i < mSize; i++) {
      cs.mSet.setElement(i, mSet.getElement(i).copy());
    }
    return cs;
  }

//  public CoordSetGen copyFlip() {
//    CoordSetGen cs = makeAnother(mSize);
//    for (int i = 0; i < mSize; i++) {
//      cs.mSet.setElement(i, mSet.getElement(i).copy(true));
//    }
//    return cs;
//  }
//
//  public CoordSetGen copyWithout(final int w) {
//    CoordSetGen cs = makeAnother(mSize - 1);
//    for (int i = 0, j = 0; i < mSize - 1; ) {
//      if (j == w) {
//        ++j;
//        continue;
//      }
//      cs.mSet.setElement(i, mSet.getElement(j).copy());
//      ++i;
//      ++j;
//    }
//
//    return cs;
//  }

  int min(final int z) {
    int min = 99;
    for (int i = 0; i < mSize; i++) {
      if (mSet.getElement(i).getCoord(z) < min) {
        min = mSet.getElement(i).getCoord(z);
      }
    }
    return min;
  }

  int max(final int z) {
    int max = -99;
    for (int i = 0; i < mSize; i++) {
      if (mSet.getElement(i).getCoord(z) > max) {
        max = mSet.getElement(i).getCoord(z);
      }
    }
    return max;
  }

  int breadth(final int z) {
    int max = -99;
    int min = 99;
    for (int i = 0; i < mSize; i++) {
      if (mSet.getElement(i).getCoord(z) > max) {
        max = mSet.getElement(i).getCoord(z);
      }
      if (mSet.getElement(i).getCoord(z) < min) {
        min = mSet.getElement(i).getCoord(z);
      }
    }
    return max - min + 1;
  }

  boolean connected() {
    int count = 1;
    final boolean[] conn = new boolean[mSize];
    conn[0] = true;

    while (true) {
      final int oldcount = count;
      for (int i = 0; i < mSize; i++) {
        for (int j = i + 1; j < mSize; j++) {
          if (near(j, i)) {
            if (conn[i] && !conn[j]) {
              conn[j] = true;
              ++count;
            }
            if (conn[j] && !conn[i]) {
              conn[i] = true;
              ++count;
            }
            if (count == mSize) {
              return true;
            }
          }
        }
      }
      if (oldcount == count || count == mSize) {
        break;
      }
    }
    return count == mSize;
  }

  protected abstract boolean near(final int i, final int j);

  protected abstract void verify();

  protected abstract String makeDiagram();

  protected abstract String makeString();

  protected abstract String makeString(final boolean bColour);

  int getWhite() {
    return mSet.getWhite();
  }

  int getBlack() {
    return mSet.getBlack();
  }

  boolean biased() {
    return mSet.getWhite() != mSet.getBlack();
  }

  int bias() {
    final int b = mSet.getWhite() - mSet.getBlack();
    if (b >= 0) {
      return b;
    } else {
      return -b;
    }
  }

  protected abstract String makeUnique();

  int less() {
    if (mSet.getWhite() < mSet.getBlack()) {
      return mSet.getWhite();
    } else {
      return mSet.getBlack();
    }
  }

  int lessColour() {
    if (mSet.getWhite() < mSet.getBlack()) {
      return Element.WHITE;
    } else {
      return Element.BLACK;
    }
  }

  int moreColour() {
    if (mSet.getWhite() > mSet.getBlack()) {
      return Element.WHITE;
    } else {
      return Element.BLACK;
    }
  }

  int more() {
    if (mSet.getWhite() > mSet.getBlack()) {
      return mSet.getWhite();
    } else {
      return mSet.getBlack();
    }
  }

  /*
   * 1 1
   * 2 0
   * 3 1
   * 4 2
   * 5 3
   * 6 2
   * 7 3
   * 8 4
   * 9 5
   * 10 4
   * 11 5
   * 12 6
   * 13 7
   */
  static int maxBias(final int c) {
    if (c == 1) {
      return 1;
    }
    return (((c - 2) & 3) + c) / 2 - 1;
  }

  /*
   * 1 1 1
   * 2 0 1
   * 3 1 2
   * 4 2 3
   * 5 3 4
   * 6 2 4
   * 7 3 5
   * 8 4 6
   * 9 5 7
   * 10 4 7
   * 11 5 8
   * 12 6 9
   * 13 7 10
   */
  static int maxMore(final int c) {
    return (c + maxBias(c)) / 2;
  }

  /*
   * 1 1 0
   * 2 0 1
   * 3 1 1
   * 4 2 1
   * 5 3 1
   * 6 2 2
   * 7 3 2
   * 8 4 2
   * 9 5 2
   * 10 4 3
   * 11 5 3
   * 12 6 3
   * 13 7 3
   */
  static int minLess(final int c) {
    return (c - maxBias(c)) / 2;
  }

}
