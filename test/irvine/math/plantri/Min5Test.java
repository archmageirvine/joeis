package irvine.math.plantri;

import junit.framework.TestCase;
import irvine.math.IntegerUtils;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class Min5Test extends TestCase {

  static void checkGraphConsistency(final PlantriGraphState g) {
    final Edge[] edges = g.mEdges;
    for (int k = 0; k < edges.length; ++k) {
      if (edges[k].mNext != null) {
        assertEquals(edges[k], edges[k].mNext.mPrev);
      }
      if (edges[k].mPrev != null) {
        assertEquals(edges[k], edges[k].mPrev.mNext);
      }
      final Edge inv = edges[k].mInverse;
      if (inv != null) {
        if (inv.mEnd != 0) {
          assertEquals(String.valueOf(k), edges[k].mStart, inv.mEnd);
        }
        if (edges[k].mEnd != 0) {
          assertEquals(String.valueOf(k), edges[k].mEnd, inv.mStart);
        }
      }
    }
  }

  public void test() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), Plantri.MAX_VERTICES, Plantri.NUM_EDGES);
    Min5.init(g);
    assertEquals(12, g.mNumVertices);
    assertEquals(60, g.mNumEdges);
    assertEquals(83711, AbstractExtenderReducerTest.sumStarts(g.mEdges));
    assertEquals(60, IntegerUtils.sum(g.mDegree));
    checkGraphConsistency(g);
  }
}
