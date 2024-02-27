package irvine.math.graph;

import java.util.List;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MaximalCliquesTest extends TestCase {

  public void test() {
    // Based on example in Wikipedia
    final Graph g = GraphFactory.create(6);
    g.addEdge(0, 1);
    g.addEdge(0, 4);
    g.addEdge(1, 2);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.addEdge(3, 5);
    final List<Z> maxCliques = MaximalCliques.maximalCliques(g);
    assertEquals("[19, 6, 12, 24, 40]", maxCliques.toString());
    final List<Z> maxIndependentSets = MaximalCliques.maximalIndependentSets(g);
    assertEquals(5, maxIndependentSets.size());
    assertEquals("[37, 9, 10, 34, 52]", maxIndependentSets.toString());
  }

  public void test2() {
    // Example from "Recent example in the theory of partition graphs" by D.W. DeTemple et al.
    final Graph g = GraphFactory.create(9);
    g.addEdge(0, 1);
    g.addEdge(0, 8);
    g.addEdge(0, 7);
    g.addEdge(0, 5);
    g.addEdge(1, 6);
    g.addEdge(1, 2);
    g.addEdge(1, 8);
    g.addEdge(2, 6);
    g.addEdge(2, 7);
    g.addEdge(2, 3);
    g.addEdge(3, 8);
    g.addEdge(3, 7);
    g.addEdge(3, 4);
    g.addEdge(4, 8);
    g.addEdge(4, 6);
    g.addEdge(4, 5);
    g.addEdge(5, 6);
    g.addEdge(5, 7);
    g.addEdge(6, 8);
    g.addEdge(6, 7);
    g.addEdge(7, 8);
    final List<Z> maxIndependentSets = MaximalCliques.maximalIndependentSets(g);
    assertEquals(5, maxIndependentSets.size());
    assertEquals("[21, 73, 42, 146, 292]", maxIndependentSets.toString());
  }
}
