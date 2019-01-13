package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PlantriCliHelperTest extends TestCase {

  public void test() {
    final Plantri plantri = new Plantri();
    PlantriCliHelper.decodeCommandLine(plantri, "-u", "-b", "-m", "3", "-x", "-c", "2", "5");
    assertEquals(3, plantri.getMinDegree());
    assertTrue(plantri.mExactSwitch);
    assertEquals(5, plantri.mMaxNV);
    assertEquals(2, plantri.getMinConnectivity());
  }
}
