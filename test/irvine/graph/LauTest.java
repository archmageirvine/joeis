package irvine.graph;

import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LauTest extends TestCase {

  public void testBuggyCase() {
    // This is a simple undirected connected graph
    final Graph<Integer, Integer> g1 = new Graph<>();
    final ArrayList<Vertex<Integer, Integer>> v = new ArrayList<>();
    for (int k = 0; k < 10; ++k) {
      v.add(g1.addVertex(k));
    }
    g1.addEdge(v.get(0), v.get(1), null);
    g1.addEdge(v.get(0), v.get(2), null);
    g1.addEdge(v.get(0), v.get(3), null);
    g1.addEdge(v.get(0), v.get(4), null);
    g1.addEdge(v.get(0), v.get(5), null);
    g1.addEdge(v.get(0), v.get(6), null);
    g1.addEdge(v.get(0), v.get(7), null);
    g1.addEdge(v.get(0), v.get(8), null);
    g1.addEdge(v.get(0), v.get(9), null);
    g1.addEdge(v.get(1), v.get(2), null);
    g1.addEdge(v.get(1), v.get(9), null);
    g1.addEdge(v.get(3), v.get(4), null);
    g1.addEdge(v.get(5), v.get(6), null);
    g1.addEdge(v.get(7), v.get(8), null);
    for (int k = 0; k < 20; ++k) {
      final Graph<Integer, Integer> g2 = g1.copy();
      assertNotNull("\n" + g1 + "\n" + g2 + "\nk=" + k, Isomorphism.isomorphism(g1, g2));
    }
  }
}
