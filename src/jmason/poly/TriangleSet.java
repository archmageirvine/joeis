package jmason.poly;

/**
 * A set of triangles.
 * @author jmason
 */
public class TriangleSet extends ElementSet<Triangle> {

  TriangleSet(final int size) {
    super(size);
    mSet = new Triangle[size];
  }

  void setTriangle(final int i, final int x, final int y, final int colour) {
    verifree(i);
    overTriangle(i, x, y, colour);
  }

  void overTriangle(final int i, final int x, final int y, final int colour) {
    mSet[i] = new Triangle(x, y, colour);
    adjColour(colour);
    setElement(mSet[i]);
  }

  protected void setElement(final Triangle e) {
  }

  void setTriangle(final int i, final int x, final int y) {
    setTriangle(i, x, y, shouldBeColour(x, y));
  }

  int shouldBeColour(final int x, final int y) {
    if (((getX(0) - x + getY(0) - y) & 1) == 0) {
      return mSet[0].getColour();
    } else {
      return -mSet[0].getColour();
    }
  }

  boolean contains(final int x, final int y) {
    for (int i = 0; i < mSize; ++i) {
      if (mSet[i].getX() == x && mSet[i].getY() == y) {
        return true;
      }
    }
    return false;
  }
}
