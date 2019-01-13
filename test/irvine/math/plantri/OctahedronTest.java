package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class OctahedronTest extends TestCase {

  public void testOctahedron() {
    final EdgeFactory ef = new EdgeFactory();
    final Edge[] edges = new Edge[24];
    final Edge[] first = new Edge[6];
    final int[] degree = new int[6];
    for (int k = 0; k < edges.length; ++k) {
      edges[k] = ef.createEdge();
    }
    Octahedron.makeOctahedron(edges, first, degree);
    for (final int v : degree) {
      assertEquals(4, v);
    }
    for (final Edge e : first) {
      assertNotNull(e);
    }
    for (int k = 0; k < edges.length; ++k) {
      assertTrue(String.valueOf(k), edges[k].mMin.mAlloc <= edges[k].mAlloc);
      assertEquals(String.valueOf(k), edges[k], edges[k].mInverse.mInverse);
      assertEquals(edges[k].mMin, edges[k].mInverse.mMin);
    }
  }
}
