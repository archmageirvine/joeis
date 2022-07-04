package irvine.math.lattice;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PonTest extends TestCase {

  public void testRotatePoint() {
    final long p0 = Lattices.PON.toPoint(2, 0, 5);
    final long p1 = Pon.rotate(p0);
    assertEquals("(-2,2,4)", Lattices.PON.toString(p1));
    final long p2 = Pon.rotate(p1);
    assertEquals("(0,-2,3)", Lattices.PON.toString(p2));
    final long p3 = Pon.rotate(p2);
    assertEquals("(2,0,5)", Lattices.PON.toString(p3));
    assertEquals(p0, p3);
  }

  public void testRotatePoint2() {
    final long p0 = Lattices.PON.toPoint(2, 1, 0);
    final long p1 = Pon.rotate(p0);
    assertEquals("(-3,2,2)", Lattices.PON.toString(p1));
    final long p2 = Pon.rotate(p1);
    assertEquals("(1,-3,1)", Lattices.PON.toString(p2));
    final long p3 = Pon.rotate(p2);
    assertEquals("(2,1,0)", Lattices.PON.toString(p3));
    assertEquals(p0, p3);
  }
}
