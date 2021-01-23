package irvine.math.lattice;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ManhattanLatticeTest extends TestCase {

  public void test() {
    final ManhattanLattice lat = new ManhattanLattice();
    assertEquals(2, lat.dimension());
    assertEquals("(0,0)", lat.toString(lat.origin()));
    final long p = lat.toPoint(10, -12);
    assertEquals(10, lat.x(p));
    assertEquals(-12, lat.y(p));
    assertEquals(2, lat.neighbourCount(lat.origin()));
    final long[] np = lat.neighbours(p);
    assertEquals(2, np.length);
    assertEquals("(11,-12)", lat.toString(np[0]));
    assertEquals("(10,-11)", lat.toString(np[1]));
    assertEquals("(1,0)", lat.toString(lat.neighbour(lat.origin(), 0)));
    assertEquals("(0,1)", lat.toString(lat.neighbour(lat.origin(), 1)));
    assertEquals("(2,0)", lat.toString(lat.neighbour(lat.toPoint(1, 0), 0)));
    assertEquals("(1,-1)", lat.toString(lat.neighbour(lat.toPoint(1, 0), 1)));
    assertEquals("(0,-1)", lat.toString(lat.neighbour(lat.toPoint(1, -1), 0)));
  }
}
