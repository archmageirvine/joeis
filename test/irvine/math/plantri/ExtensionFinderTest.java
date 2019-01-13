package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ExtensionFinderTest extends TestCase {

  public void test3ConnectedPlanarTriangulations() {
    final Plantri plantri = new Plantri();
    assertEquals(1249, plantri.count(11, -1, -1, -1, false, false, false, false));
    assertEquals(7595, plantri.count(12, -1, -1, -1, false, false, false, false));
  }
}
