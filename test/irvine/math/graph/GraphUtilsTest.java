package irvine.math.graph;

import irvine.math.z.Z;
import irvine.oeis.a007.A007036;
import irvine.oeis.a331.A331236;
import irvine.oeis.a331.A331237;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
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
    assertEquals(Z.valueOf(40), seq.next());
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
}
