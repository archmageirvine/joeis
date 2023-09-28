package irvine.graph;

import irvine.math.graph.GraphUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class VertexTest extends TestCase {

  public void testVertex() {
    final Vertex<String, String> v = new Vertex<>("hi");
    assertEquals("hi", v.label());
    assertEquals(0, v.neighbours().size());
    assertEquals(0, v.isomorphismConstant());
    assertFalse(v.isAdjacent(v));
    final Edge<String, String> e1 = new Edge<>(v, v, null, false);
    assertEquals(1, v.neighbours().size());
    assertTrue(v.isAdjacent(v));
    assertTrue(v.isIncident(e1));
    assertTrue(v.isOutIncident(e1));
    assertTrue(v.isInIncident(e1));
    assertEquals(4294967296L, v.isomorphismConstant());
    v.removeEdge(e1);
    assertFalse(v.isIncident(e1));
    assertFalse(v.isOutIncident(e1));
    assertFalse(v.isInIncident(e1));
    v.addEdge(e1);
    assertEquals(1, v.neighbours().size());
    assertTrue(v.isAdjacent(v));
    assertTrue(v.isIncident(e1));
    assertTrue(v.isOutIncident(e1));
    assertTrue(v.isInIncident(e1));
    final Edge<String, String> e2 = new Edge<>(v, v, null, true);
    assertEquals(1, v.neighbours().size());
    assertTrue(v.isAdjacent(v));
    assertTrue(v.isIncident(e1));
    assertTrue(v.isOutIncident(e1));
    assertTrue(v.isInIncident(e1));
    assertEquals(4295032833L, v.isomorphismConstant());
    v.removeEdge(e1);
    assertEquals(1, v.neighbours().size());
    assertTrue(v.isAdjacent(v));
    assertTrue(v.isIncident(e2));
    assertTrue(v.isOutIncident(e2));
    assertTrue(v.isInIncident(e2));
    assertFalse(v.isIncident(e1));
    assertFalse(v.isOutIncident(e1));
    assertFalse(v.isInIncident(e1));
    v.removeEdge(e2);
    assertFalse(v.isIncident(e2));
    assertFalse(v.isOutIncident(e2));
    assertFalse(v.isInIncident(e2));
    final Vertex<String, String> v2 = new Vertex<>("hi2");
    try {
      v2.addEdge(e1);
      fail();
    } catch (final IllegalStateException e) {
      // ok
    }
    final Edge<String, String> e3 = new Edge<>(v, v2, null, true);
    assertEquals(1, v.neighbours().size());
    assertTrue(v.isAdjacent(v2));
    assertFalse(v2.isAdjacent(v));
    assertFalse(v2.isAdjacent(v2));
    assertFalse(v.isAdjacent(v));
    assertTrue(v.isIncident(e3));
    assertFalse(v2.isOutIncident(e3));
    assertTrue(v.isOutIncident(e3));
    assertTrue(v2.isInIncident(e3));
    assertFalse(v.isInIncident(e3));
    assertEquals(65536, v2.isomorphismConstant());
    v.removeEdge(e3);
    v2.removeEdge(e3);
    final Edge<String, String> e4 = new Edge<>(v, v2, null, false);
    assertEquals(1, v.neighbours().size());
    assertTrue(v.isAdjacent(v2));
    assertTrue(v2.isAdjacent(v));
    assertFalse(v2.isAdjacent(v2));
    assertFalse(v.isAdjacent(v));
    assertTrue(v.isIncident(e4));
    assertTrue(v2.isOutIncident(e4));
    assertTrue(v.isOutIncident(e4));
    assertTrue(v2.isInIncident(e4));
    assertTrue(v.isInIncident(e4));
    assertEquals(68719476736L, v.isomorphismConstant());
    assertEquals(68719476736L, v2.isomorphismConstant());
    v.removeEdge(e4);
    v2.removeEdge(e4);
    final Edge<String, String> e5 = new Edge<>(v2, v, null, false);
    assertEquals(1, v.neighbours().size());
    assertTrue(v.isAdjacent(v2));
    assertTrue(v2.isAdjacent(v));
    assertFalse(v2.isAdjacent(v2));
    assertFalse(v.isAdjacent(v));
    assertTrue(v.isIncident(e5));
    assertTrue(v2.isOutIncident(e5));
    assertTrue(v.isOutIncident(e5));
    assertTrue(v2.isInIncident(e5));
    assertTrue(v.isInIncident(e5));
    assertEquals(1, v.edges().size());
    assertEquals(1, v2.edges().size());
  }

  public void testComplete() {
    final Graph<Integer, String> g = GraphUtils.complete(4);
    final Vertex<Integer, String> v = g.vertices().iterator().next();
    assertFalse(v.isAdjacent(v));
    assertFalse(v.neighbours().contains(v));
  }
}

