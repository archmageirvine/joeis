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
  }

  public void testConnect() {
    final EdgeFactory ef = new EdgeFactory();
    final QuadrangulationConnectivity qc = new QuadrangulationConnectivity(new PlantriGraphState(ef, 10, 50), ef);
    assertEquals(3, qc.isConnected());
  }
}
