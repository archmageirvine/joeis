package irvine.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class OrderChainGraphTest extends TestCase {

  public void testChainTopologicalOrdering() {
    final ArrayList<Vertex<Integer, String>> v = new ArrayList<>();
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < 4; ++k) {
      v.add(g.addVertex(k));
    }
    for (int k = 0; k < 3; ++k) {
      g.addDirectedEdge(v.get(k), v.get(k + 1), null);
    }
    final List<Set<Vertex<Integer, String>>> list = g.topologicalChainOrdering();
    for (int k = 0; k < list.size(); ++k) {
      assertEquals(1, list.get(k).size());
      assertEquals(k, list.get(k).iterator().next().label().intValue());
    }
    g.addDirectedEdge(v.get(3), v.get(0), null);
    try {
      g.topologicalChainOrdering();
      fail();
    } catch (final IllegalArgumentException e) {
      // expected
    }
  }

  public void testChainTopologicalOrdering2() {
    final ArrayList<Vertex<Integer, String>> v = new ArrayList<>();
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < 4; ++k) {
      v.add(g.addVertex(k));
      v.add(g.addVertex(-k - 1));
    }
    for (int k = 0; k < 3; ++k) {
      g.addDirectedEdge(v.get(2 * k), v.get(2 * k + 1), null);
    }
    for (int k = 0; k < 4; ++k) {
      g.addEdge(v.get(2 * k), v.get(2 * k + 1), null);
    }
    final List<Set<Vertex<Integer, String>>> list = g.topologicalChainOrdering();
    for (final Set<Vertex<Integer, String>> lst : list) {
      assertEquals(2, lst.size());
      final Iterator<Vertex<Integer, String>> it = lst.iterator();
      assertEquals(-1, it.next().label() + it.next().label());
    }
  }
}
