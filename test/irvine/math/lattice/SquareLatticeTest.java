package irvine.math.lattice;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SquareLatticeTest extends TestCase {

  public void test() {
    final SquareLattice sl = new SquareLattice();
    assertEquals(2, sl.dimension());
    assertEquals("(0,0)", sl.toString(sl.origin()));
    final long p = sl.toPoint(10, -12);
    assertEquals(10, sl.x(p));
    assertEquals(-12, sl.y(p));
    final long[] np = sl.neighbours(p);
    assertEquals(4, np.length);
    assertEquals("(11,-12)", sl.toString(np[0]));
    assertEquals("(9,-12)", sl.toString(np[1]));
    assertEquals("(10,-11)", sl.toString(np[2]));
    assertEquals("(10,-13)", sl.toString(np[3]));
  }
}
