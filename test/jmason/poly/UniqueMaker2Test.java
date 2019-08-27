package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class UniqueMaker2Test extends TestCase {

  public void test() {
    final CoordSet2 cs2 = new CoordSet2(1, false, false, false);
    cs2.initMonomino();
    assertEquals("00", new UniqueMaker2(cs2).uniqString());
    assertEquals("000112", new UniqueMaker2(cs2.listRot180MidSideSons().get(0)).uniqString());
    final CoordSet2 cs2b = cs2.copy(0, 0);
    assertEquals("0000", new UniqueMaker2(cs2b).uniqString());
    assertEquals("0000", new UniqueMaker2(cs2b.mirrorVert()).uniqString());
  }
}
