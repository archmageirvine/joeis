package irvine.graph;

import java.util.Random;

import irvine.util.Pair;

//import java.util.Random;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IsomorphismTest extends LauTest {

  public void testSimpleMisses() {
    final Graph<Integer, String> g1 = GraphUtils.complete(2);
    final Graph<Integer, String> g2 = GraphUtils.complete(3);
    assertNull(Isomorphism.isomorphism(g1, null));
    assertNull(Isomorphism.isomorphism(null, g1));
    assertNull(Isomorphism.isomorphism(g1, g2));
  }

  public void testDifferentValencies() {
    final Graph<String, String> g3 = new Graph<>();
    g3.addVertex("A");
    g3.addVertex("B");
    g3.addEdge(g3.getVertex("A"), g3.getVertex("B"), null);
    final Graph<String, String> g4 = new Graph<>();
    g4.addVertex("A");
    g4.addVertex("B");
    g4.addEdge(g4.getVertex("A"), g4.getVertex("A"), null);
    assertNull(Isomorphism.isomorphism(g3, g4));
  }

  public void testDifferentComponentry() {
    final Graph<String, String> g3 = new Graph<>();
    g3.addVertex("A");
    g3.addVertex("B");
    g3.addVertex("C");
    g3.addVertex("D");
    g3.addEdge(g3.getVertex("A"), g3.getVertex("B"), null);
    g3.addEdge(g3.getVertex("B"), g3.getVertex("C"), null);
    g3.addEdge(g3.getVertex("C"), g3.getVertex("D"), null);
    final Graph<String, String> g4 = new Graph<>();
    g4.addVertex("A");
    g4.addVertex("B");
    g4.addVertex("C");
    g4.addVertex("D");
    g4.addEdge(g4.getVertex("A"), g4.getVertex("B"), null);
    g4.addEdge(g4.getVertex("A"), g4.getVertex("B"), null);
    g4.addEdge(g4.getVertex("C"), g4.getVertex("D"), null);
    assertNull(Isomorphism.isomorphism(g3, g4));
  }

  public void testEmpty() {
    assertNotNull(Isomorphism.isomorphism(GraphUtils.empty(42), GraphUtils.empty(42)));
  }

  private void checkIdentity(final Graph<Pair<Integer, Integer>, Pair<Integer, Integer>> g) {
    assertNotNull(g);
    final boolean[] seen = new boolean[g.order()];
    for (final Vertex<Pair<Integer, Integer>, Pair<Integer, Integer>> v : g.vertices()) {
      final Pair<Integer, Integer> p = v.label();
      assertEquals(p.left(), p.right());
      seen[p.left()] = true;
    }
    for (final boolean v : seen) {
      assertTrue(v);
    }
  }

  public void testHits() {
    final Random r = new Random();
    for (int k = 1; k <= 100; ++k) {
      final int o = r.nextInt(12) + 1;
      final int s = r.nextInt(4 * o + 20);
      final Graph<Integer, Integer> g1 = GraphUtils.randomUndirected(o, s, k);
      final Graph<Integer, Integer> g2 = g1.copy();
      checkIdentity(Isomorphism.isomorphism(g1, g1));
      assertNotNull(g1 + "cf:" + g2, Isomorphism.isomorphism(g1, g2));
    }
  }

}
