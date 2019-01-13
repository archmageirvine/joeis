package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Graph6Test extends TestCase {

  public void testToGraph6() {
    final Graph g0 = GraphFactory.create(0);
    assertEquals("?", Graph6.toGraph6(g0));
    final Graph g1 = GraphFactory.create(1);
    assertEquals("@", Graph6.toGraph6(g1));
    final Graph g2 = GraphFactory.create(2);
    assertEquals("A?", Graph6.toGraph6(g2));
    g2.addEdge(0, 1);
    assertEquals("A_", Graph6.toGraph6(g2));
    final Graph g5 = GraphFactory.create(5);
    g5.addEdge(0, 2);
    g5.addEdge(0, 4);
    g5.addEdge(1, 3);
    g5.addEdge(3, 4);
    assertEquals("DQc", Graph6.toGraph6(g5));
  }

  public void testToGraph() {
    final Graph g = Graph6.toGraph("DQc");
    assertEquals(5, g.order());
    assertTrue(g.isAdjacent(0, 2));
    assertTrue(g.isAdjacent(0, 4));
    assertTrue(g.isAdjacent(1, 3));
    assertTrue(g.isAdjacent(3, 4));
    assertFalse(g.isAdjacent(0, 3));
    assertFalse(g.isAdjacent(2, 3));
    assertEquals("DQc", Graph6.toGraph6(g));
  }

}
