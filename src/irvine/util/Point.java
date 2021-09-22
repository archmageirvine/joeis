package irvine.util;

/**
 * Convenience application of <code>Pair</code> to type <code>Integer</code>.
 * @author Sean A. Irvine
 */
public class Point extends Pair<Integer, Integer> implements Comparable<Point> {

  /**
   * Construct the point.
   * @param x x coordinate
   * @param y y coordinate
   */
  public Point(final int x, final int y) {
    super(x, y);
  }

  @Override
  public int compareTo(final Point o) {
    final int a = left().compareTo(o.left());
    if (a != 0) {
      return a;
    }
    return right().compareTo(o.right());
  }
}
