package irvine.util;

/**
 * Convenience application of <code>Pair</code> to type <code>Integer</code>.
 * @author Sean A. Irvine
 */
public class Point extends Pair<Integer, Integer> {

  /**
   * Construct the point.
   * @param x x coordinate
   * @param y y coordinate
   */
  public Point(final int x, final int y) {
    super(x, y);
  }
}
