package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BiconnectedComponentsTest extends TestCase {

  public void testTiny() {
    assertEquals("[]", BiconnectedComponents.biconnectedComponents(GraphFactory.create(0)).toString());
    assertEquals("[]", BiconnectedComponents.biconnectedComponents(GraphFactory.create(1)).toString());
    assertEquals("[]", BiconnectedComponents.biconnectedComponents(GraphFactory.create(20)).toString());
    final Graph k2 = GraphFactory.create(2);
    k2.addEdge(0, 1);
    assertEquals("[{0-1}]", BiconnectedComponents.biconnectedComponents(k2).toString());
    final Graph k3 = GraphFactory.create(3);
    k3.addEdge(0, 1);
    k3.addEdge(1, 2);
    k3.addEdge(2, 0);
    assertEquals("[{0-1, 0-2, 1-2}]", BiconnectedComponents.biconnectedComponents(k3).toString());
  }

  public void testK4() {
    final Graph k4 = GraphFactory.create(4);
    k4.addEdge(0, 1);
    k4.addEdge(0, 2);
    k4.addEdge(0, 3);
    k4.addEdge(1, 2);
    k4.addEdge(1, 3);
    k4.addEdge(2, 3);
    assertEquals("[{0-1, 0-2, 1-2, 0-3, 1-3, 2-3}]", BiconnectedComponents.biconnectedComponents(k4).toString());
  }

  public void testC4() {
    final Graph c4 = GraphFactory.create(4);
    c4.addEdge(0, 1);
    c4.addEdge(1, 2);
    c4.addEdge(2, 3);
    c4.addEdge(3, 0);
    assertEquals("[{0-1, 0-2, 1-3, 2-3}]", BiconnectedComponents.biconnectedComponents(c4).toString());
  }

  public void testEdgeBridge() {
    final Graph b = GraphFactory.create(8);
    b.addEdge(0, 1);
    b.addEdge(1, 2);
    b.addEdge(2, 3);
    b.addEdge(3, 0);
    b.addEdge(4, 5);
    b.addEdge(5, 6);
    b.addEdge(6, 7);
    b.addEdge(7, 4);
    b.addEdge(0, 7);
    assertEquals("[{0-1, 0-2, 1-3, 2-3}, {0-1, 0-2, 1-3, 2-3}, {0-1}]", BiconnectedComponents.biconnectedComponents(b).toString());
  }

  public void testVertexBridge() {
    final Graph b = GraphFactory.create(7);
    b.addEdge(0, 1);
    b.addEdge(1, 2);
    b.addEdge(2, 3);
    b.addEdge(3, 0);
    b.addEdge(0, 4);
    b.addEdge(4, 5);
    b.addEdge(5, 6);
    b.addEdge(6, 0);
    assertEquals("[{0-1, 0-2, 1-3, 2-3}, {0-1, 0-2, 1-3, 2-3}]", BiconnectedComponents.biconnectedComponents(b).toString());
  }

  public void testNoBridge() {
    final Graph b = GraphFactory.create(8);
    b.addEdge(0, 1);
    b.addEdge(1, 2);
    b.addEdge(2, 3);
    b.addEdge(3, 0);
    b.addEdge(4, 5);
    b.addEdge(5, 6);
    b.addEdge(6, 7);
    b.addEdge(7, 4);
    b.addEdge(0, 7);
    b.addEdge(1, 5);
    assertEquals("[{0-1, 0-2, 2-3, 1-4, 2-4, 1-5, 3-5, 3-6, 5-7, 6-7}]", BiconnectedComponents.biconnectedComponents(b).toString());
  }
}
