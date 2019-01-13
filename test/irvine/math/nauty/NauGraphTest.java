package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.util.Permutation;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NauGraphTest extends NautyTest {

  public void testIsAutomotphismK4() {
    final NauGraph ng = new NauGraph();
    final Graph k4 = GraphFactory.complete(4);
    // Every permutation should be an automorphism
    final Permutation perm = new Permutation(4);
    int[] p;
    while ((p = perm.next()) != null) {
      assertTrue(ng.isAutomorphism(k4, p, false));
    }
  }

  public void testIsAutomotphism4() {
    final NauGraph ng = new NauGraph();
    final Graph g = GraphFactory.create(4);
    g.addEdge(0, 1);
    g.addEdge(2, 3);
    assertTrue(ng.isAutomorphism(g, new int[] {0, 1, 2, 3}, false)); // identity
    assertTrue(ng.isAutomorphism(g, new int[] {1, 0, 2, 3}, false));
    assertTrue(ng.isAutomorphism(g, new int[] {1, 0, 3, 2}, false));
    assertTrue(ng.isAutomorphism(g, new int[] {0, 1, 3, 2}, false));
    assertFalse(ng.isAutomorphism(g, new int[] {0, 3, 1, 2}, false));
    assertFalse(ng.isAutomorphism(g, new int[] {0, 2, 1, 3}, false));
    assertFalse(ng.isAutomorphism(g, new int[] {0, 2, 3, 1}, false));
    assertFalse(ng.isAutomorphism(g, new int[] {2, 0, 3, 1}, false));
  }
}
