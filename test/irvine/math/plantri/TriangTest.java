package irvine.math.plantri;

import irvine.math.IntegerUtils;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class TriangTest extends TestCase {

  public void test() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), Plantri.MAX_VERTICES, Plantri.NUM_EDGES);
    Triang.init(g);
    assertEquals(3, g.mNumVertices);
    assertEquals(6, g.mNumEdges);
    assertEquals(24198, AbstractExtenderReducerTest.sumStarts(g.mEdges));
    assertEquals(6, IntegerUtils.sum(g.mDegree));
    Min5Test.checkGraphConsistency(g);
  }
}
