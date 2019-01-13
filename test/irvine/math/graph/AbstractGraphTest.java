package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public abstract class AbstractGraphTest extends TestCase {

  protected abstract Graph create(final int order);

  public void testOrder1() {
    final Graph g = create(1);
    assertFalse(g.isAdjacent(0, 0));
    assertTrue(g.isConnected());
    assertTrue(g.isHamiltonian());
  }

  public void testOrder2() {
    final Graph g = create(2);
    assertFalse(g.isAdjacent(0, 1));
    assertFalse(g.isConnected());
    assertFalse(g.isHamiltonian());
    assertEquals(0, g.size());
    g.addEdge(0, 1);
    assertEquals(1, g.size());
    assertTrue(g.isAdjacent(0, 1));
    assertTrue(g.isConnected());
    assertFalse(g.isHamiltonian());
    assertEquals(0, g.girth());
    final Graph gc = g.complement();
    assertEquals(2, gc.order());
    assertFalse(gc.isAdjacent(0, 1));
    assertFalse(gc.isConnected());
    assertFalse(g.isBiconnected());
    assertFalse(gc.isBiconnected());
  }

  public void testOrder3() {
    final Graph g = create(3);
    assertFalse(g.isConnected());
    assertFalse(g.isHamiltonian());
    g.addEdge(1, 2);
    assertFalse(g.isConnected());
    g.addEdge(0, 2);
    assertTrue(g.isConnected());
    assertEquals(0, g.girth());
    final Graph gc = g.complement();
    assertFalse(gc.isAdjacent(0, 2));
    assertFalse(gc.isAdjacent(2, 0));
    assertFalse(gc.isAdjacent(1, 2));
    assertFalse(gc.isAdjacent(2, 1));
    assertTrue(gc.isAdjacent(0, 1));
    assertTrue(gc.isAdjacent(1, 0));
    assertFalse(g.isBiconnected());
    assertEquals(2, g.nextVertex(0, 0));
    assertEquals(1, g.degree(0));
    assertEquals(1, g.degree(1));
    assertEquals(2, g.degree(2));
    g.addEdge(0, 1);
    assertEquals(3, g.girth());
    assertEquals(2, g.degree(0));
    assertEquals(2, g.degree(1));
    assertEquals(2, g.degree(2));
    assertTrue(g.isBiconnected());
    assertEquals(1, g.nextVertex(0, 0));
    assertEquals(2, g.nextVertex(0, 1));
    assertEquals(-1, g.nextVertex(0, 2));
    assertEquals(0, g.nextVertex(1, -1));
    assertTrue(g.isHamiltonian());
  }

  public void testOrder64() {
    final Graph g = create(64);
    for (int k = 1; k < g.order(); ++k) {
      assertFalse(g.isConnected());
      assertFalse(g.isBiconnected());
      g.addEdge(k - 1, k);
    }
    assertTrue(g.isConnected());
    assertFalse(g.isBiconnected());
    assertEquals(63, g.size());
    g.addEdge(0, 63);
    assertTrue(g.isConnected());
    assertTrue(g.isBiconnected());
    assertEquals(64, g.size());
    assertEquals(64, g.girth());
  }

  public void testEdgeBridge() {
    final Graph b = create(8);
    b.addEdge(0, 1);
    b.addEdge(1, 2);
    b.addEdge(2, 3);
    b.addEdge(3, 0);
    b.addEdge(4, 5);
    b.addEdge(5, 6);
    b.addEdge(6, 7);
    b.addEdge(7, 4);
    b.addEdge(0, 7);
    assertEquals("[{0-1, 0-2, 1-3, 2-3}, {0-1, 0-2, 1-3, 2-3}, {0-1}]", b.biconnectedComponents().toString());
  }

  public void testHamiltonian() {
    final Graph g = create(5);
    g.addEdge(0, 3);
    g.addEdge(0, 4);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(2, 4);
    assertFalse(g.isHamiltonian());
  }

  public void testGirth4() {
    final Graph g = create(6);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.addEdge(4, 5);
    g.addEdge(0, 5);
    g.addEdge(1, 4);
    g.addEdge(0, 3);
    g.addEdge(2, 5);
    assertEquals(4, g.girth());
  }

}
