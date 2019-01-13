package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SmallDigraphTest extends TestCase {

  public void testOrder1() {
    final Graph g = new SmallDigraph(1);
    assertFalse(g.isCyclic());
    g.addEdge(0, 0);
    assertTrue(g.isCyclic());
  }

  public void testOrder3() {
    final Graph g = new SmallDigraph(3);
    assertFalse(g.isConnected());
    g.addEdge(1, 2);
    assertFalse(g.isConnected());
    g.addEdge(0, 2);
    assertFalse(g.isCyclic());
    g.addEdge(0, 1);
    assertFalse(g.isCyclic());
    g.addEdge(2, 0);
    assertTrue(g.isCyclic());
    assertTrue(g.equals(g));
    assertTrue(g.equals(g.copy()));
    assertFalse(g.equals(new Object()));
  }

  public void testOrder3b() {
    final Graph g = new SmallDigraph(3);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    assertTrue(g.isCyclic());
    assertEquals("{2->0, 0->1, 1->2}", g.toString());
  }

}
