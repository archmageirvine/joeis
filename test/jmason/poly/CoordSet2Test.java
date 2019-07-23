package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CoordSet2Test extends TestCase {

  public void test() {
    final CoordSet2 cs2 = new CoordSet2(1, false, false, false);
    cs2.initMonomino();
    assertEquals("00A", cs2.toString().trim());
    assertEquals(0, cs2.hasSide(0));
    assertEquals(0, cs2.hasSide(1));
    assertFalse(cs2.twoTouch());
    assertEquals(0, cs2.getHeight());
    assertEquals(0, cs2.getWidth());
    final CoordSet2 cs2b = cs2.copy(0, 0);
    assertEquals("00A 00A", cs2b.toString().trim());
    assertTrue(cs2b.containsAll(cs2));
  }
}
