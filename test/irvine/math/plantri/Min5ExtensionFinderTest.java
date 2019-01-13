package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Min5ExtensionFinderTest extends TestCase {

  public void testPlanarC5() {
    assertEquals(71, new Plantri().count(20, -1, 5, -1, false, false, false, false));
    assertEquals(187, new Plantri().count(21, -1, 5, -1, false, false, false, false));
  }
}
