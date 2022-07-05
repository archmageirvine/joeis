package irvine.math.lattice;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ArcLatticeTest extends TestCase {

  public void testConnectivity() {
    final ArcLattice lat = new ArcLattice();
    final long p = lat.origin();
    assertEquals(9, lat.neighbourCount(p));
    for (final long q : lat.neighbours(p)) {
      final long x = lat.ordinate(q, 0);
      final long y = lat.ordinate(q, 1);
      final long z = lat.ordinate(q, 2);
      assertTrue(x >= -1 && x <= 1);
      assertTrue(y >= -1 && y <= 1);
      assertTrue(z >= 0 && z <= 7);
      assertFalse(p == q);
      assertTrue(lat.toString(p) + " -- " + lat.toString(q), lat.isAdjacent(q, p));
      assertTrue(lat.isAdjacent(p, q));
    }
  }
}
