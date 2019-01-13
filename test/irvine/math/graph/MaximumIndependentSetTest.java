package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MaximumIndependentSetTest extends TestCase {

  public void testWilf() {
    final Graph g = GraphFactory.create(6);
    g.addEdge(0, 1);
    g.addEdge(0, 3);
    g.addEdge(0, 4);
    g.addEdge(1, 2);
    g.addEdge(1, 5);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.addEdge(3, 5);
    assertEquals(3, MaximumIndependentSet.size(g));
  }
}
