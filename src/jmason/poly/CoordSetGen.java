package jmason.poly;

/**
 *
 * @author jmason
 * a generic coordinate set, either xy or xyz
 */
public abstract class CoordSetGen extends PolyBase {

  protected ElementSet mSet;

  int mSize;
  protected boolean mAllColours;

  public int getX(final int i) {
    return mSet.getX(i);
  }

  public int getY(final int i) {
    return mSet.getY(i);
  }

  public int getColour(final int i) {
    return mSet.getColour(i);
  }

  public void setColour(final int i, final int col) {
    mSet.setColour(i, col);
  }

  public abstract CoordSetGen makeAnother(final int size);

  public CoordSetGen cloneSet() {
    final CoordSetGen cs = makeAnother(mSize);
    cs.mAllColours = false;
    for (int i = 0; i < mSize; i++) {
      cs.mSet.setElement(i, this.mSet.getElement(i).clone());
    }
    return cs;
  }

//  public CoordSetGen cloneFlip() {
//    CoordSetGen cs = makeAnother(mSize);
//    for (int i = 0; i < mSize; i++) {
//      cs.mSet.setElement(i, this.mSet.getElement(i).clone(true));
//    }
//    return cs;
//  }
//
//  public CoordSetGen cloneWithout(final int w) {
//    CoordSetGen cs = makeAnother(mSize - 1);
//    for (int i = 0, j = 0; i < mSize - 1; ) {
//      if (j == w) {
//        ++j;
//        continue;
//      }
//      cs.mSet.setElement(i, this.mSet.getElement(j).clone());
//      ++i;
//      ++j;
//    }
//
//    return cs;
//  }

  public int min(final int z) {
    int min = 99;
    for (int i = 0; i < mSize; i++) {
      if (mSet.getElement(i).getCoord(z) < min) {
        min = mSet.getElement(i).getCoord(z);
      }
    }
    return min;
  }

  public int max(final int z) {
    int max = -99;
    for (int i = 0; i < mSize; i++) {
      if (mSet.getElement(i).getCoord(z) > max) {
        max = mSet.getElement(i).getCoord(z);
      }
    }
    return max;
  }

  public int breadth(final int z) {
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


  public boolean connected() {
    int count = 1;
    final boolean[] conn = new boolean[mSize];
    conn[0] = true;

    while (true) {
      int oldcount = count;
      for (int i = 0; i < mSize; i++) {
        for (int j = i + 1; j < mSize; j++) {
          //if( j == i)
          //    continue;
          if (near(j, i)) {
            if (conn[i] && !conn[j]) {
              conn[j] = true;
              count++;
            }
            if (conn[j] && !conn[i]) {
              conn[i] = true;
              count++;

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
    return (count == mSize);
  }

  public abstract boolean near(final int i, final int j);

  public abstract void verify();


  public abstract String makeDiagram();

  public abstract String makeString();

  public abstract String makeString(final boolean bColour);

  public int getWhite() {
    return mSet.getWhite();
  }

  public int getBlack() {
    return mSet.getBlack();
  }

  public boolean biased() {
    return mSet.getWhite() != mSet.getBlack();
  }

  public int bias() {
    int b = mSet.getWhite() - mSet.getBlack();
    if (b >= 0) {
      return b;
    } else {
      return -b;
    }
  }

  public abstract String makeUnique();

  public int less() {
    if (mSet.getWhite() < mSet.getBlack()) {
      return mSet.getWhite();
    } else {
      return mSet.getBlack();
    }
  }

  public int lessColour() {
    if (mSet.getWhite() < mSet.getBlack()) {
      return Element.WHITE;
    } else {
      return Element.BLACK;
    }
  }

  public int moreColour() {
    if (mSet.getWhite() > mSet.getBlack()) {
      return Element.WHITE;
    } else {
      return Element.BLACK;
    }
  }

  public int more() {
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
  public static int maxBias(final int c) {
    if (c == 1) {
      return 1;
    }
    return (((c - 2) % 4) + c) / 2 - 1;
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
  public static int maxMore(final int c) {
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
  public static int minLess(final int c) {
    return (c - maxBias(c)) / 2;
  }

}
