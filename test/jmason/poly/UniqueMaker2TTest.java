package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class UniqueMaker2TTest extends TestCase {

  public void test() {
    final CoordSet2T cs2 = new CoordSet2T(1, false, false, false);
    cs2.initMonoiamond();
    assertEquals("11", new UniqueMaker2T(cs2).uniqString());
    assertEquals("11", new UniqueMaker2T(cs2.rotate60()).uniqString());
    final CoordSet2T cs2b = cs2.copy(0, 0);
    assertEquals("0011", new UniqueMaker2T(cs2b).uniqString());
    assertEquals("1120", new UniqueMaker2T(cs2b.mirrorVert()).uniqString());
    assertEquals("1121", new UniqueMaker2T(cs2b.mirrorVert().rotate60()).uniqString());
  }
}
