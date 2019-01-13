package irvine.math.plantri;

import irvine.math.IntegerUtils;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class BipartiteTest extends TestCase {

  public void test() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), Plantri.MAX_VERTICES, Plantri.NUM_EDGES);
    Bipartite.init(g);
    assertEquals(6, g.mNumVertices);
    assertEquals(24, g.mNumEdges);
    assertEquals(17856, AbstractExtenderReducerTest.sumStarts(g.mEdges));
    assertEquals(24, IntegerUtils.sum(g.mDegree));
    Min5Test.checkGraphConsistency(g);
  }
}
