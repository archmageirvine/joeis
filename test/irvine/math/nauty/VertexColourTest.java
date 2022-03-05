package irvine.math.nauty;

import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.Graph6;
import irvine.math.graph.GraphFactory;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class VertexColourTest extends TestCase {

  public void test1() {
    final VertexColour vc = new VertexColour(3);
    final Graph g = GraphFactory.create(1);
    final StringBuilder sb = new StringBuilder();
    assertEquals(3, vc.colour(g, (g1, col) -> sb.append(g1).append(' ').append(Arrays.toString(col)).append(", ")));
    assertEquals("{} [0], {} [1], {} [2], ", sb.toString());
  }

  public void test2() {
    final VertexColour vc = new VertexColour(2);
    final Graph g = GraphFactory.create(2);
    g.addEdge(0, 1);
    final StringBuilder sb = new StringBuilder();
    assertEquals(3, vc.colour(g, (g1, col) -> sb.append(g1).append(' ').append(Arrays.toString(col)).append(", ")));
    assertEquals("{0-1} [0, 0], {0-1} [1, 0], {0-1} [1, 1], ", sb.toString());
  }

  public void test2WithLoop() {
    final VertexColour vc = new VertexColour(2);
    final Graph g = GraphFactory.create(2);
    g.addEdge(0, 1);
    g.addEdge(1, 1);
    final StringBuilder sb = new StringBuilder();
    assertEquals(4, vc.colour(g, (g1, col) -> sb.append(g1).append(' ').append(Arrays.toString(col)).append(", ")));
    assertEquals("{0-1, 1-1} [0, 0], {0-1, 1-1} [0, 1], {0-1, 1-1} [1, 0], {0-1, 1-1} [1, 1], ", sb.toString());
  }

  public void test4a() {
    // Square
    final VertexColour vc = new VertexColour(2);
    final Graph g = Graph6.toGraph("C]");
    //assertEquals(6, vc.colour(g, (g1, col) -> System.out.println(g1 + " " + Arrays.toString(col))));
    assertEquals(6, vc.colour(g, null));
  }

  public void test4b() {
    // Square with diagonal
    final VertexColour vc = new VertexColour(2);
    final Graph g = Graph6.toGraph("C^");
    assertEquals(9, vc.colour(g, (g1, col) -> System.out.println(g1 + " " + Arrays.toString(col))));
    //assertEquals(9, vc.colour(g, null));
  }
}
