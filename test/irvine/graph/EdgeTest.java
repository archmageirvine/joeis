package irvine.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EdgeTest extends TestCase {




  public void testEdge() {
    final Vertex<String, String> v1 = new Vertex<>("hi1");
    final Vertex<String, String> v2 = new Vertex<>("hi2");
    final Vertex<String, String> v3 = new Vertex<>("hi3");
    final Edge<String, String> e1 = new Edge<>(v1, v2, "edge", true);
    assertEquals("edge", e1.label());
    assertEquals(v1, e1.source());
    assertEquals(v2, e1.destination());
    assertTrue(e1.isDirected());
    assertEquals("hi1 -> hi2", e1.toString());
    final Edge<String, String> e2 = new Edge<>(v1, v2, "edge", false);
    assertEquals("edge", e2.label());
    assertEquals(v1, e2.source());
    assertEquals(v2, e2.destination());
    assertFalse(e2.isDirected());
    assertEquals("hi1 -- hi2", e2.toString());
    assertTrue(e2.isAdjacent(e1));
    assertTrue(e1.isAdjacent(e2));
    final Edge<String, String> e3 = new Edge<>(v2, v1, "edge", true);
    assertTrue(e2.isAdjacent(e3));
    assertTrue(e3.isAdjacent(e2));
    assertEquals("hi2 -> hi1", e3.toString());
    final Edge<String, String> e4 = new Edge<>(v3, v1, "edge", true);
    assertFalse(e1.isAdjacent(e4));
    assertTrue(e4.isAdjacent(e1));
  }
}

