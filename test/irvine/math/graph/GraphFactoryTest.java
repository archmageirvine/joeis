package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GraphFactoryTest extends TestCase {

  public void testSteinhaus() {
    final Graph g = GraphFactory.steinhaus(6, 0x18);
    assertEquals("{0-1, 0-2, 1-3, 2-3, 2-4, 3-5, 4-5}", g.toString());
  }

  public void testHamming() {
    final Graph g = GraphFactory.hamming(4, 3);
    assertEquals(81, g.order());
    assertEquals(324, g.size());
  }
}
