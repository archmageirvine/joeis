package irvine.math.plantri;

import irvine.math.IntegerUtils;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadrangulationsTest extends TestCase {

  public void test() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), Plantri.MAX_VERTICES, Plantri.NUM_EDGES);
    Quadrangulations.init(g);
    assertEquals(3, g.mNumVertices);
    assertEquals(4, g.mNumEdges);
    assertEquals(8042, AbstractExtenderReducerTest.sumStarts(g.mEdges));
    assertEquals(4, IntegerUtils.sum(g.mDegree));
    Min5Test.checkGraphConsistency(g);
  }
}
