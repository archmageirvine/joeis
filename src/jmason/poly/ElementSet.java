package jmason.poly;

/**
 * A set of elements, which could be squares or cubes.
 * @author jmason
 * @param <T> element type
 */
public abstract class ElementSet<T extends Element<T>> {

  protected T[] mSet;
  protected final int mSize;
  private int mWhite;
  private int mBlack;

  protected ElementSet(final int size) {
    mSize = size;
  }

  int getX(final int i) {
    return mSet[i].getX();
  }

  int getY(final int i) {
    return mSet[i].getY();
  }

  int getCoord(final int i, final int z) {
    return mSet[i].getCoord(z);
  }

  int getColour(final int i) {
    return mSet[i].getColour();
  }

  void setColour(final int i, final int col) {
    mSet[i].setColour(col);
  }

  protected abstract void setElement(final T e);

  protected void setElement(final int i, final T e) {
    verifree(i);
    mSet[i] = e;
    adjColour(mSet[i].getColour());
    setElement(e);
  }

  T getElement(final int i) {
    return mSet[i];
  }

  protected void adjColour(final int colour) {
    if (colour == Square.WHITE) {
      ++mWhite;
    } else {
      ++mBlack;
    }
  }

  int getWhite() {
    return mWhite;
  }

  int getBlack() {
    return mBlack;
  }

  protected void verifree(final int i) {
    assert mSet[i] == null : "already in use";
  }

  void swapPositions(final int i, final int j) {
    final T t = mSet[i];
    mSet[i] = mSet[j];
    mSet[j] = t;
  }
}
