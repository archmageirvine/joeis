package irvine.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class VertexLabelingTest extends TestCase {

  public void test() {
    final Graph<Integer, String> g = new Graph<>();
    g.addVertex(0);
    final Vertex<Integer, String> v1 = g.addVertex(1);
    final Vertex<Integer, String> v2 = g.addVertex(2);
    final Vertex<Integer, String> v3 = g.addVertex(3);
    final Vertex<Integer, String> v4 = g.addVertex(4);
    final Vertex<Integer, String> v5 = g.addVertex(5);
    g.addEdge(v1, v2, "edge");
    g.addEdge(v3, v4, "edge");
    g.addEdge(v4, v5, "edge");
    g.addEdge(v2, v5, "edge");
    assertEquals(360, VertexLabeling.countLabellings(g));
  }
}
