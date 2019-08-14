package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CoordSetGenTest extends TestCase {

  public void testMonomino() {
    final CoordSet2 cs2 = new CoordSet2(1, false, false, false);
    cs2.initMonomino();
    assertEquals("00A", cs2.toString().trim());
    assertEquals(0, cs2.hasSide(0));
    assertEquals(0, cs2.hasSide(1));
    assertFalse(cs2.twoTouch());
    assertEquals(0, cs2.getHeight());
    assertEquals(0, cs2.getWidth());
    assertEquals(0, cs2.getX(0));
    assertEquals(0, cs2.getY(0));
    assertEquals(1, cs2.getColour(0));
    assertEquals(0, cs2.getWhite());
    assertEquals(1, cs2.getBlack());
    cs2.setColour(0, 42);
    assertEquals(42, cs2.getColour(0));
    assertEquals(1, cs2.breadth(0));
    final CoordSet2 cs2b = cs2.copy(0, 0);
    assertEquals("00p 00p", cs2b.toString().trim());
    assertTrue(cs2b.containsAll(cs2));
    assertFalse(cs2b.twoTouch());
    assertEquals(3, cs2b.listRot90CornerSons().size());
    assertEquals(3, cs2b.listRot180MidSideSons().size());
  }

  public void testStatics() {
    assertEquals(4, CoordSet2.maxBias(10));
    assertEquals(3, CoordSet2.minLess(10));
    assertEquals(7, CoordSet2.maxMore(10));
  }
}
