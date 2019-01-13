package irvine.math.plantri;

import junit.framework.TestCase;
import irvine.math.IntegerUtils;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class Min4Test extends TestCase {

  public void test() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), Plantri.MAX_VERTICES, Plantri.NUM_EDGES);
    Min4.init(g);
    assertEquals(6, g.mNumVertices);
    assertEquals(24, g.mNumEdges);
    assertEquals(35634, AbstractExtenderReducerTest.sumStarts(g.mEdges));
    assertEquals(24, IntegerUtils.sum(g.mDegree));
    Min5Test.checkGraphConsistency(g);
  }
}
