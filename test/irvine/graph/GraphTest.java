package irvine.graph;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.graph.GraphUtils;
import irvine.math.graph.GraphUtilsTest;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GraphTest extends TestCase {

  public void testGraph() {
    final Graph<String, Integer> g = new Graph<>();
    final Vertex<String, Integer> v1 = g.addVertex("hi1");
    final Vertex<String, Integer> v2 = g.addVertex("hi2");
    final Edge<Integer, String> edge0 = g.addEdge(v1, v2, 42);
    assertTrue(g.edges().contains(edge0));
    assertFalse(edge0.isDirected());
    final Vertex<String, Integer> v3 = new Vertex<>("hi3");
    try {
      g.addEdge(v1, v3, 42);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      g.addEdge(v3, v1, 42);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      g.addDirectedEdge(v1, v3, 42);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      g.addDirectedEdge(v3, v1, 42);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final Edge<Integer, String> edge1 = g.addDirectedEdge(v1, v2, 1);
    assertTrue(edge1.isDirected());
    assertTrue(g.edges().contains(edge0));
    assertTrue(g.edges().contains(edge1));
    assertEquals(v1, g.getVertex("hi1"));
    g.removeVertex(v1);
    try {
      g.removeEdge(edge1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertNull(g.getVertex("hi1"));
    assertEquals(v2, g.getVertex("hi2"));
    final Set<Vertex<String, Integer>> s = g.getVertices("hi2");
    assertEquals(1, s.size());
    assertTrue(s.contains(v2));
    g.addVertex("hi2");
    assertEquals(2, g.getVertices("hi2").size());
    g.addVertex("hi2");
    assertEquals(3, g.getVertices("hi2").size());
    g.addVertex(null);
    assertEquals(1, g.getVertices(null).size());
    g.addVertex(null);
    assertEquals(2, g.getVertices(null).size());
    assertNull(g.getVertex(null).label());
  }

  private boolean keep(final int s, final int d, final int a, final int b) {
    return (s == a && d == b) || (s == b && d == a);
  }

  public void testSubgraphs() throws IOException {
    final Graph<String, String> g = irvine.math.graph.GraphUtils.load(GraphUtilsTest.class.getClassLoader().getResourceAsStream("irvine/graph/bollobas1.1.gph"));
    assertEquals(9, g.order());
    assertEquals(21, g.size());
    final Graph<String, String> empty = g.inducedSubgraph(new HashSet<>());
    assertEquals(0, empty.order());
    assertEquals(0, empty.size());
    assertEquals(g, g.inducedSubgraph(g.vertices()));
    final HashSet<Vertex<String, String>> h = new HashSet<>();
    for (final Vertex<String, String> v : g.vertices()) {
      final int n = Integer.parseInt(v.label());
      if (n <= 6 || n == 9) {
        h.add(v);
      }
    }
    assertEquals(7, h.size());
    final Graph<String, String> is = g.inducedSubgraph(h);
    assertEquals(7, is.order());
    assertEquals(10, is.size());
    for (final Edge<String, String> e : is.edges()) {
      assertFalse(e.isDirected());
    }
    final boolean[] expected = {false, true, true, true, true, true, true, false, false, true};
    final boolean[] seen = new boolean[10];
    for (final Vertex<String, String> v : is.vertices()) {
      seen[Integer.parseInt(v.label())] = true;
    }
    for (int k = 0; k < seen.length; ++k) {
      assertEquals(expected[k], seen[k]);
    }
    final HashSet<Edge<String, String>> retain = new HashSet<>();
    for (final Edge<String, String> e : g.edges()) {
      final int s = Integer.parseInt(e.source().label());
      final int d = Integer.parseInt(e.destination().label());
      if (keep(s, d, 1, 2)
          || keep(s, d, 2, 3)
          || keep(s, d, 3, 8)
          || keep(s, d, 1, 8)
          || keep(s, d, 4, 5)
          || keep(s, d, 5, 6)) {
        retain.add(e);
      }
    }
    assertEquals(6, retain.size());
    final Graph<String, String> ss = g.subgraph(retain);
    assertEquals(9, ss.order());
    assertEquals(6, ss.size());
    final Graph<String, String> empty2 = g.subgraph(new HashSet<>());
    assertEquals(9, empty2.order());
    assertEquals(0, empty2.size());
    assertEquals(g, g.subgraph(g.edges()));
    final Graph<String, String> test = new Graph<>();
    final Vertex<String, String> v1 = test.addVertex("1");
    final Vertex<String, String> v2 = test.addVertex("2");
    test.addEdge(v1, v1, null);
    final Edge<String, String> e2 = test.addDirectedEdge(v1, v2, null);
    retain.clear();
    retain.add(e2);
    final Graph<String, String> test2 = test.subgraph(retain);
    assertEquals(2, test2.order());
    assertEquals(1, test2.size());
    for (final Edge<String, String> e : test2.edges()) {
      assertTrue(e.isDirected());
    }
  }

  public void testComplement() throws IOException {
    try (final InputStream is = GraphTest.class.getClassLoader().getResourceAsStream("irvine/graph/test1.gph")) {
      final Graph<String, String> g = irvine.math.graph.GraphUtils.load(is);
      assertEquals(4, g.order());
      assertEquals(6, g.size());
      final Graph<String, String> c = g.complement();
      assertEquals(4, c.order());
      assertEquals(6, c.size());
      final boolean[][] status = new boolean[4][4];
      for (final Edge<String, String> e : c.edges()) {
        final int s = Integer.parseInt(e.source().label()) - 1;
        final int d = Integer.parseInt(e.destination().label()) - 1;
        status[s][d] = true;
        if (!e.isDirected()) {
          status[d][s] = true;
        }
      }
      assertFalse(status[0][0]);
      assertFalse(status[0][1]);
      assertTrue(status[0][2]);
      assertTrue(status[0][3]);
      assertTrue(status[1][0]);
      assertFalse(status[1][1]);
      assertFalse(status[1][2]);
      assertTrue(status[1][3]);
      assertTrue(status[2][0]);
      assertFalse(status[2][1]);
      assertTrue(status[2][2]);
      assertFalse(status[2][3]);
      assertTrue(status[3][0]);
      assertTrue(status[3][1]);
      assertFalse(status[3][2]);
      assertTrue(status[3][3]);
    }
  }

  public void testComplement2() {
    final Graph<Integer, String> g = new Graph<>();
    final Vertex<Integer, String> v1 = g.addVertex(1);
    final Vertex<Integer, String> v2 = g.addVertex(2);
    g.addDirectedEdge(v1, v2, null);
    g.addEdge(v1, v1, null);
    g.addEdge(v2, v2, null);
    final Graph<Integer, String> c = g.complement();
    assertEquals(1, c.size());
    assertEquals(Integer.valueOf(2), c.edges().iterator().next().source().label());
  }

  public void testComplement3() {
    final Graph<Integer, String> g = new Graph<>();
    final Vertex<Integer, String> v1 = g.addVertex(1);
    final Vertex<Integer, String> v2 = g.addVertex(2);
    g.addDirectedEdge(v2, v1, null);
    g.addEdge(v1, v1, null);
    g.addEdge(v2, v2, null);
    final Graph<Integer, String> c = g.complement();
    assertEquals(1, c.size());
    assertEquals(Integer.valueOf(1), c.edges().iterator().next().source().label());
  }

  public void testIsomorphism() {
    final Graph<Integer, String> g = irvine.math.graph.GraphUtils.complete(5);
    assertNotNull(g.isomorphism(g));
  }

  public void testIsConnected() {
    for (int k = 0; k < 2; ++k) {
      final Graph<Integer, String> g = irvine.math.graph.GraphUtils.empty(k);
      assertTrue(g.isConnected());
      final List<Graph<Integer, String>> s = g.components();
      assertEquals(1, s.size());
      assertEquals(g, s.iterator().next());
    }
    for (int k = 2; k < 5; ++k) {
      final Graph<Integer, String> g = irvine.math.graph.GraphUtils.empty(k);
      assertFalse(g.isConnected());
      assertEquals(k, g.components().size());
    }
    for (int k = 2; k < 5; ++k) {
      final Graph<Integer, String> g = GraphUtils.complete(k);
      assertTrue(String.valueOf(k), g.isConnected());
      final List<Graph<Integer, String>> s = g.components();
      assertEquals(1, s.size());
      assertEquals(g, s.iterator().next());
    }
    final ArrayList<Vertex<Integer, String>> v = new ArrayList<>();
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < 20; ++k) {
      v.add(g.addVertex(k));
    }
    for (int k = 0; k < 18; ++k) {
      g.addEdge(v.get(k), v.get(k + 1), null);
      assertFalse(g.isConnected());
    }
    g.addEdge(v.get(18), v.get(19), null);
    assertTrue(g.isConnected());
  }

  public void testIsConnected2() {
    final ArrayList<Vertex<Integer, String>> v = new ArrayList<>();
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < 20; ++k) {
      v.add(g.addVertex(k));
    }
    for (int k = 0; k < 18; ++k) {
      g.addDirectedEdge(v.get(k), v.get(k + 1), null);
      assertFalse(g.isConnected());
    }
    final Edge<String, Integer> e = g.addDirectedEdge(v.get(19), v.get(18), null);
    assertTrue(g.isConnected());
    g.removeEdge(e);
    g.addDirectedEdge(v.get(18), v.get(19), null);
    assertTrue(g.isConnected());

  }

  public void testTopologicalOrdering() {
    final ArrayList<Vertex<Integer, String>> v = new ArrayList<>();
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < 4; ++k) {
      v.add(g.addVertex(k));
    }
    for (int k = 0; k < 3; ++k) {
      g.addDirectedEdge(v.get(k), v.get(k + 1), null);
    }
    final List<Vertex<Integer, String>> list = g.topologicalOrdering();
    for (int k = 0; k < list.size(); ++k) {
      assertEquals(k, list.get(k).label().intValue());
    }
    g.addDirectedEdge(v.get(3), v.get(0), null);
    try {
      g.topologicalOrdering();
      fail();
    } catch (final IllegalArgumentException e) {
      // expected
    }
  }

  public void testTopologicalOrdering2() {
    final ArrayList<Vertex<Integer, String>> v = new ArrayList<>();
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < 4; ++k) {
      v.add(g.addVertex(k));
    }
    g.addDirectedEdge(v.get(3), v.get(1), null);
    g.addDirectedEdge(v.get(3), v.get(2), null);
    g.addDirectedEdge(v.get(1), v.get(0), null);
    g.addDirectedEdge(v.get(2), v.get(0), null);
    final List<Vertex<Integer, String>> list = g.topologicalOrdering();
    assertEquals(v.get(3), list.get(0));
    assertEquals(v.get(0), list.get(3));
    if (v.get(1).equals(list.get(1))) {
      assertEquals(v.get(2), list.get(2));
    } else {
      assertEquals(v.get(2), list.get(1));
      assertEquals(v.get(1), list.get(2));
    }
    g.addEdge(v.get(1), v.get(2), null);
    try {
      g.topologicalOrdering();
      fail();
    } catch (final IllegalArgumentException e) {
      // expected
    }
  }

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

  public void testIsCyclic() {
    final ArrayList<Vertex<Integer, String>> v = new ArrayList<>();
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < 4; ++k) {
      v.add(g.addVertex(k));
    }
    for (int k = 0; k < 3; ++k) {
      g.addDirectedEdge(v.get(k), v.get(k + 1), null);
    }
    assertFalse(g.isCyclic());
    g.addDirectedEdge(v.get(3), v.get(0), null);
    assertTrue(g.isCyclic());
  }
}

