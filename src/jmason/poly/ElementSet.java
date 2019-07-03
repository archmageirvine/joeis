package jmason.poly;

/**
 *
 * @author jmason
 * a set of elements, which could be squares or cubes
 */
public abstract class ElementSet {
  protected Element[] mSet;
  protected final int mSize;
  private int mWhite, mBlack;

  protected ElementSet(final int size) {
    mSize = size;
  }

  public int getX(final int i) {
    return mSet[i].getX();
  }

  public int getY(final int i) {
    return mSet[i].getY();
  }

  public int getCoord(final int i, final int z) {
    return mSet[i].getCoord(z);
  }

  public int getColour(final int i) {
    return mSet[i].getColour();
  }

  public void setColour(final int i, final int col) {
    mSet[i].setColour(col);
  }

  protected abstract void setElement(final Element e);

  public void setElement(final int i, final Element e) {
    verifree(i);
    mSet[i] = e;
    adjColour(mSet[i].getColour());
    setElement(e);
  }

  public Element getElement(final int i) {
    return mSet[i];
  }

  protected void adjColour(final int colour) {
    if (colour == Square.WHITE) {
      ++mWhite;
    } else {
      ++mBlack;
    }
  }

  public int getWhite() {
    return mWhite;
  }

  public int getBlack() {
    return mBlack;
  }

  protected void verifree(final int i) {
    assert mSet[i] == null : "already in use";
  }

  public void swapPositions(final int i, final int j) {
    final Element t = mSet[i];
    mSet[i] = mSet[j];
    mSet[j] = t;
  }
}
