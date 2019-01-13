package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Min5C4ExtensionFinderTest extends TestCase {

  public void testTriangulationsMin5() {
    assertEquals(73, new Plantri().count(20, 5, -1, -1, false, false, false, false));
    assertEquals(192, new Plantri().count(21, 5, -1, -1, false, false, false, false));
    assertEquals(651, new Plantri().count(22, 5, -1, -1, false, false, false, false));
  }
}
