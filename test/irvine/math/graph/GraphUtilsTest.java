package irvine.math.graph;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import irvine.graph.Vertex;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a007.A007036;
import irvine.oeis.a331.A331236;
import irvine.oeis.a331.A331237;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GraphUtilsTest extends TestCase {

  public void testNumberLabelledColoured() {
    assertEquals(Z.ONE, GraphUtils.numberLabelledColoured(0, 0));
    assertEquals(Z.ONE, GraphUtils.numberLabelledColoured(0, 1));
    assertEquals(Z.ONE, GraphUtils.numberLabelledColoured(0, 2));
    assertEquals(Z.ZERO, GraphUtils.numberLabelledColoured(1, 0));
    assertEquals(Z.ONE, GraphUtils.numberLabelledColoured(1, 1));
    assertEquals(Z.TWO, GraphUtils.numberLabelledColoured(1, 2));
    assertEquals(Z.THREE, GraphUtils.numberLabelledColoured(1, 3));
    assertEquals(Z.valueOf(26), GraphUtils.numberLabelledColoured(3, 2));
    assertEquals(Z.valueOf(1058885), GraphUtils.numberLabelledColoured(5, 5));
  }

  public void testNumberConnectedLabelledColoured() {
    assertEquals(Z.ONE, GraphUtils.numberConnectedLabelledColoured(1, 1));
    assertEquals(Z.TWO, GraphUtils.numberConnectedLabelledColoured(1, 2));
    assertEquals(Z.THREE, GraphUtils.numberConnectedLabelledColoured(1, 3));
    assertEquals(Z.SIX, GraphUtils.numberConnectedLabelledColoured(3, 2));
    assertEquals(Z.valueOf(616260), GraphUtils.numberConnectedLabelledColoured(5, 5));
  }

  public void testBipartite() {
    final Graph g = GraphFactory.create(5);
    assertTrue(GraphUtils.isBipartite(g));
    g.addEdge(4, 4);
    assertFalse(GraphUtils.isBipartite(g));
    g.removeEdge(4, 4);
    g.addEdge(0, 1);
    assertTrue(GraphUtils.isBipartite(g));
    g.addEdge(2, 1);
    assertTrue(GraphUtils.isBipartite(g));
    g.addEdge(0, 2);
    assertFalse(GraphUtils.isBipartite(g));
    g.removeEdge(0, 2);
    g.addEdge(2, 3);
    assertTrue(GraphUtils.isBipartite(g));
    g.addEdge(4, 3);
    assertTrue(GraphUtils.isBipartite(g));
    g.addEdge(0, 4);
    assertFalse(GraphUtils.isBipartite(g));
    g.removeEdge(0, 4);
    g.addEdge(1, 4);
    assertTrue(GraphUtils.isBipartite(g));
  }

  public void testToughness() {
    final A007036 seq = new A007036();
    for (int k = 0; k < 9; ++k) {
      assertEquals(Z.ZERO, seq.next());
    }
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.FIVE, seq.next());
  }

  public void testCuttingNumber() {
    final A331236 seq = new A331236();
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.SEVEN, seq.next());
    assertEquals(Z.valueOf(43), seq.next());
  }

  public void testCuttingNumberTree() {
    final A331237 seq = new A331237();
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.FIVE, seq.next());
    assertEquals(Z.valueOf(15), seq.next());
  }

  public void testDot() {
    final Graph g = GraphFactory.create(3);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    assertEquals("graph G {\n  node [shape=point];\n  0 [pos=\"0.000,0.144!\"];\n  1 [pos=\"0.125,-0.072!\"];\n  2 [pos=\"-0.125,-0.072!\"];\n  0--1;\n  1--2;\n}\n", GraphUtils.toDot(g));
  }

  public void testSpanningTrees() {
    final Graph g = GraphFactory.create(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(1, 3);
    g.addEdge(2, 3);
    assertEquals(Z.EIGHT, GraphUtils.numberOfSpanningTrees(g));
  }

  public void testPrimLogCycleIndexData() {
    final List<List<Z>> graphs = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, 3, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final List<List<Z>> inv = GraphUtils.invGgfCycleIndexData(IntegerField.SINGLETON, graphs, e -> Z.TWO);
    assertEquals("[[1], [-1], [-2, 0], [-8, 0, -16]]", inv.toString());
    final List<List<Z>> log = GraphUtils.primLogCycleIndexData(IntegerField.SINGLETON, inv);
    assertEquals("[[0], [-1], [-2, -1], [-8, -6, -18]]", log.toString());
  }

  public void testLogCycleIndexData() {
    final List<List<Z>> graphs = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, 3, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final List<List<Z>> inv = GraphUtils.invGgfCycleIndexData(IntegerField.SINGLETON, graphs, e -> Z.TWO);
    assertEquals("[[1], [-1], [-2, 0], [-8, 0, -16]]", inv.toString());
    final List<List<Z>> log = GraphUtils.logCycleIndexData(IntegerField.SINGLETON, inv);
    assertEquals("[[0], [-1], [-1, -1], [-6, -6, -18]]", log.toString());
  }

  public void testLogCycleIndexDataPoly() {
    final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, 6);
    final List<List<Polynomial<Q>>> graphs = GraphUtils.graphCycleIndexData(fld, 3, Edges.DIGRAPH_EDGES, fld::onePlusXToTheN);
    assertEquals("[[1], [1], [1+y^2, 1+2y+y^2], [2+4y^3+2y^6, 3+9y^2+9y^4+3y^6, 1+6y+15y^2+20y^3+15y^4+6y^5+y^6]]", graphs.toString());
    final List<List<Polynomial<Q>>> inv = GraphUtils.invGgfCycleIndexData(fld, graphs, fld::onePlusXToTheN);
    assertEquals("[[1], [-1], [-1-y^2, 1-y^2], [-2-4y^3-2y^6, 3+3y^2-3y^4-3y^6, -1+3y^2-2y^3-9y^4-6y^5-y^6]]", inv.toString());
    final List<List<Polynomial<Q>>> log = GraphUtils.logCycleIndexData(fld, inv);
    assertEquals("[[0], [-1], [-y^2, -y^2], [-4y^3-2y^6, -3y^4-3y^6, -2y^3-9y^4-6y^5-y^6]]", log.toString());
  }

  public void testLogCycleIndexDataPoly4() {
    final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, 12);
    final List<List<Polynomial<Q>>> graphs = GraphUtils.graphCycleIndexData(fld, 4, Edges.DIGRAPH_EDGES, fld::onePlusXToTheN);
    final List<List<Polynomial<Q>>> inv = GraphUtils.invGgfCycleIndexData(fld, graphs, fld::onePlusXToTheN);
    final List<List<Polynomial<Q>>> log = GraphUtils.logCycleIndexData(fld, inv);
    assertEquals("[[0], [-1], [-y^2, -y^2], [-4y^3-2y^6, -3y^4-3y^6, -2y^3-9y^4-6y^5-y^6], [-12y^4-18y^8-6y^12, -8y^6-16y^9-8y^12, -6y^4-36y^6-39y^8-18y^10-3y^12, -12y^5-24y^6-36y^7-54y^8-36y^9-36y^10-12y^11-6y^12, -6y^4-84y^5-316y^6-492y^7-417y^8-212y^9-66y^10-12y^11-y^12]]", log.toString());
  }

  public void testMultiplyCycleIndexData() {
    final List<List<Z>> graphs3 = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, 3, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final List<List<Z>> graphs2 = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, 2, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final List<List<Z>> mul1 = GraphUtils.multiplyCycleIndexData(IntegerField.SINGLETON, graphs2, graphs3);
    final List<List<Z>> mul2 = GraphUtils.multiplyCycleIndexData(IntegerField.SINGLETON, graphs3, graphs2);
    assertEquals(mul1, mul2);
    assertEquals("[[1], [2], [4, 10]]", mul1.toString());
  }

  public void testMultiplyGgfCycleIndexData() {
    final List<List<Z>> graphs3 = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, 3, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final List<List<Z>> graphs2 = GraphUtils.graphCycleIndexData(IntegerField.SINGLETON, 2, Edges.DIGRAPH_EDGES, e -> Z.TWO);
    final List<List<Z>> mul1 = GraphUtils.multiplyGgfCycleIndexData(IntegerField.SINGLETON, graphs2, graphs3, e -> Z.TWO);
    final List<List<Z>> mul2 = GraphUtils.multiplyGgfCycleIndexData(IntegerField.SINGLETON, graphs3, graphs2, e -> Z.TWO);
    assertEquals(mul1, mul2);
    assertEquals("[[1], [2], [4, 12]]", mul1.toString());
  }

  public void test1() throws IOException {
    try (final InputStream is = GraphUtilsTest.class.getClassLoader().getResourceAsStream("irvine/graph/bollobas1.1.gph")) {
      final irvine.graph.Graph<String, String> g = GraphUtils.load(is);
      assertEquals(9, g.order());
      assertEquals(21, g.size());
    }
  }

  public void testEmpty() {
    try {
      GraphUtils.empty(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    for (int k = 0; k < 5; ++k) {
      final irvine.graph.Graph<Integer, String> g = GraphUtils.empty(k);
      assertEquals(k, g.order());
      assertEquals(0, g.size());
    }
  }

  public void testComplete() {
    try {
      GraphUtils.complete(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    for (int k = 0; k < 7; ++k) {
      final irvine.graph.Graph<Integer, String> g = GraphUtils.complete(k);
      assertEquals(k, g.order());
      assertEquals(k * (k - 1) / 2, g.size());
      if (k > 0) {
        final Vertex<Integer, String> v = g.vertices().iterator().next();
        assertFalse(v.isAdjacent(v));
        assertFalse(v.neighbours().contains(v));
      }
    }
  }

  public void testRandomUndirected() {
    try {
      GraphUtils.randomUndirected(-1, 0, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      GraphUtils.randomUndirected(0, 1, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      GraphUtils.randomUndirected(1, -1, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final irvine.graph.Graph<Integer, Integer> g = GraphUtils.randomUndirected(32, 17, 0);
    assertEquals(32, g.order());
    assertEquals(17, g.size());
  }
}
