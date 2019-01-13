package irvine.math;

import irvine.util.Point;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PolyominoTest extends TestCase {

  public void test() {
    final Polyomino p = new Polyomino();
    assertEquals(0, p.perimeter());
    p.add(new Point(0, 0));
    assertEquals(4, p.perimeter());
    assertFalse(p.isHoly());
    p.add(new Point(1, 0));
    assertEquals(6, p.perimeter());
    assertFalse(p.isHoly());
    p.add(new Point(2, 0));
    p.add(new Point(2, 1));
    p.add(new Point(2, 2));
    p.add(new Point(1, 2));
    p.add(new Point(0, 1));
    assertTrue(p.isHoly());
    assertEquals(16, p.perimeter());
    assertTrue(p.equals(p));
    final Polyomino c = p.freeCanonical();
    final Polyomino d = p.freeCanonical();
    assertTrue(d.equals(c));
    assertFalse(d.equals(p));
    assertTrue(d.isHoly());
    assertEquals(16, d.perimeter());
  }
}
