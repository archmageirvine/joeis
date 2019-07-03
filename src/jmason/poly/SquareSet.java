package jmason.poly;

/**
 * A set of squares, the basis of a polyomino.
 * @author jmason
 */
public class SquareSet extends ElementSet<Square> {

  SquareSet(final int size) {
    super(size);
    mSet = new Square[size];
  }

  void setSquare(final int i, final int x, final int y, final int colour) {
    verifree(i);
    overSquare(i, x, y, colour);
  }

  void overSquare(final int i, final int x, final int y, final int colour) {
    this.mSet[i] = new Square(x, y, colour);
    adjColour(colour);
    setElement(mSet[i]);
  }

  @Override
  protected void setElement(final Square e) {
  }

  void setSquare(final int i, final int x, final int y) {
    this.setSquare(i, x, y, shouldBeColour(x, y));
  }

  int shouldBeColour(final int x, final int y) {
    if (((getX(0) - x + this.getY(0) - y) & 1) == 0) {
      return mSet[0].getColour();
    } else {
      return -mSet[0].getColour();
    }
  }

  boolean exists(final int x, final int y) {
    for (int i = 0; i < mSize; ++i) {
      if (mSet[i].getX() == x && mSet[i].getY() == y) {
        return true;
      }
    }
    return false;
  }
}
