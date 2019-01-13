package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PlantriGraphStateTest extends TestCase {

  public void test() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), 2, 3);
    assertEquals(2, g.mDegree.length);
    assertEquals(2, g.mFirstEdge.length);
    assertEquals(3, g.mEdges.length);
    assertEquals(0, g.mNumEdges);
    assertEquals(0, g.mNumVertices);
  }
}
