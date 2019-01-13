package irvine.math.plantri;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SimpleDispatcherTest extends TestCase {

  public void test3ConnectedPlanarTriangulations() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(5, -1, -1, -1, false, false, false, false));
    assertEquals(2, plantri.count(6, -1, -1, -1, false, false, false, false));
    assertEquals(5, plantri.count(7, -1, -1, -1, false, false, false, false));
    assertEquals(50, plantri.count(9, -1, -1, -1, false, false, false, false));
  }

  public void test() {
    final Plantri plantri = new Plantri();
    plantri.setMinConnectivity(1);
    plantri.setMinDegree(1);
    final SimpleDispatcher dispatcher = new SimpleDispatcher(plantri, new Numbering(20, plantri.mEdgeFactory), 3);
    dispatcher.simpleDispatch();
    assertEquals("[0, 1, 1, 0, 0, 0]", Arrays.toString(plantri.mNOut));
  }
}
