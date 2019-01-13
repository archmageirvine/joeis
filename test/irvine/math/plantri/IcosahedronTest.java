package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class IcosahedronTest extends TestCase {

  public void testIcosahedron() {
    final EdgeFactory ef = new EdgeFactory();
    final Edge[] edges = new Edge[60];
    final Edge[] first = new Edge[12];
    final int[] degree = new int[12];
    for (int k = 0; k < edges.length; ++k) {
      edges[k] = ef.createEdge();
    }
    Icosahedron.makeIcosahedron(edges, first, degree);
    for (final int v : degree) {
      assertEquals(5, v);
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
