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
    assertEquals("11", new UniqueMaker2T(cs2, false).uniqString());
    assertEquals("11", new UniqueMaker2T(cs2.rotate60(), false).uniqString());
    final CoordSet2T cs2b = cs2.copy(0, 0);
    assertEquals("0011", new UniqueMaker2T(cs2b, false).uniqString());
    assertEquals("1120", new UniqueMaker2T(cs2b.mirrorVert(), false).uniqString());
    assertEquals("1121", new UniqueMaker2T(cs2b.mirrorVert().rotate60(), false).uniqString());
  }
}
