package jmason.poly;

import java.util.HashSet;

/**
 * An object allowing testing of strings, coordinate pairs or coordinate triples, for uniqueness.
 * @author jmason
 */
public class UniquenessTester extends HashSet<String> {

  /**
   * Add a point.
   * @param x x-coordinate
   * @param y y-coordinate
   * @return true if added
   */
  public boolean add(final int x, final int y) {
    return add(prepare(x, y));
  }

  /**
   * Add a point.
   * @param x x-coordinate
   * @param y y-coordinate
   * @param z z-coordinate
   * @return true if added
   */
  public boolean add(final int x, final int y, final int z) {
    return add(prepare(x, y, z));
  }

  /**
   * Test if a point is contained in this tester.
   * @param x x-coordinate
   * @param y y-coordinate
   * @return true if it is contained in this tester
   */
  public boolean isIn(final int x, final int y) {
    return contains(prepare(x, y));
  }

  private String prepare(final int x, final int y) {
    return x + " " + y;
  }

  private String prepare(final int x, final int y, final int z) {
    return x + " " + y + " " + z;
  }
}
