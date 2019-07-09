package jmason.poly;

/**
 * A triangle of a polyiamond.
 * @author jmason
 */
public class Triangle extends Element<Triangle> {

  Triangle(final int x, final int y, final int colour) {
    mCoords = new int[] {x, y};
    mColour = colour;
  }

  boolean up() {
    return ((mCoords[0] + (mCoords[1] + 1) / 2) & 1) == 0;
  }

  boolean down() {
    return !up();
  }

  // returns displacement from 60 degree diagonal; always even
  int displRight() {
    if (up()) {
      return mCoords[0] - ((mCoords[1] + 1) / 2);
    } else {
      return mCoords[0] - ((mCoords[1] + 1) / 2) - 1;
    }
  }

  protected Triangle copy(final boolean flip) {
    return flip ? new Triangle(getX(), getY(), -mColour) : new Triangle(getX(), getY(), mColour);
  }

  int comparePosition(final Triangle s) {
    if (this.getX() < s.getX()) {
      return -1;
    }
    if (this.getX() > s.getX()) {
      return 1;
    }
    if (this.getY() < s.getY()) {
      return -1;
    }
    if (this.getY() > s.getY()) {
      return 1;
    }
    throw new RuntimeException();
  }
}
