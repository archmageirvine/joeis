package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SquareTest extends TestCase {

  public void test() {
    final Square square = new Square(1, 2, 1);
    assertFalse(square.hasSide(new CoordSet2(0, false, false, false), 1));
    final Square sq = square.copy(false);
    assertEquals(square.getX(), sq.getX());
    assertEquals(square.getY(), sq.getY());
    assertEquals(square.getColour(), sq.getColour());
    final Square sq1 = square.copy(true);
    assertEquals(square.getX(), sq1.getX());
    assertEquals(square.getY(), sq1.getY());
    assertEquals(square.getColour(), -sq1.getColour());
  }
}
