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

  // returns displacement from 60 degree diagonal; always even
  int displRight() {
    final int d = mCoords[0] - ((mCoords[1] + 1) / 2);
    return up() ? d : d - 1;
  }

  protected Triangle copy(final boolean flip) {
    return flip ? new Triangle(getX(), getY(), -mColour) : new Triangle(getX(), getY(), mColour);
  }

  int compareTo(final Triangle s) {
    final int c = Integer.compare(getX(), s.getX());
    if (c != 0) {
      return c;
    }
    return Integer.compare(getY(), s.getY());
  }
}
