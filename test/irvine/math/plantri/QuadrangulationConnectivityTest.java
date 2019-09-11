package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadrangulationConnectivityTest extends TestCase {

  public void testBipartiteStar() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(1, plantri.count(4, 2, 2, -1, false, true, false, false));
    assertEquals(1, plantri.count(5, 2, 2, -1, false, true, false, false));
    assertEquals(2, plantri.count(6, 2, 2, -1, false, true, false, false));
  }

  public void testConnect() {
    final EdgeFactory ef = new EdgeFactory();
    final QuadrangulationConnectivity qc = new QuadrangulationConnectivity(new PlantriGraphState(ef, 10, 50), ef);
    assertEquals(3, qc.isConnected());
    assertEquals(3, qc.isConnected());
  }

  public void testBigger() {
    final Plantri plantri = new Plantri();
    plantri.setExactConnectivity(2);
    plantri.setBipartite(true);
    assertEquals(146069, plantri.count(11, 2, 2, -1, false, true, false, false));
  }
}
