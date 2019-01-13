package irvine.graph;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ColourableTest extends TestCase {
  public void test() {
    final Graph<String, String> g = new Graph<>();
    g.addVertex("A");
    g.addVertex("B");
    g.addVertex("C");
    g.addVertex("D");
    g.addVertex("E");
    g.addVertex("F");
    final Vertex<String, String> a = g.getVertex("A");
    final Vertex<String, String> b = g.getVertex("B");
    final Vertex<String, String> c = g.getVertex("C");
    final Vertex<String, String> d = g.getVertex("D");
    final Vertex<String, String> e = g.getVertex("E");
    final Vertex<String, String> f = g.getVertex("F");
    g.addEdge(a, b, "");
    g.addEdge(a, d, "");
    g.addEdge(a, d, "");
    g.addEdge(b, c, "");
    g.addEdge(b, c, "");
    g.addEdge(c, d, "");
    g.addEdge(e, f, "");
    g.addEdge(e, f, "");
    g.addEdge(e, f, "");
    assertTrue(g.isEdgeColourable(3));
    g.addEdge(a, b, "");
    assertFalse(g.isEdgeColourable(3));
  }
}
