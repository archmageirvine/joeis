package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CoordSet2TTest extends TestCase {

  public void test() {
    final CoordSet2T cs2 = new CoordSet2T(1, false, false, false);
    cs2.initMonoiamond();
    assertEquals("1,1", cs2.toString().trim());
    assertEquals(0, cs2.getHeight());
    assertEquals(0, cs2.getWidth());
    final CoordSet2T cs2b = cs2.copy(0, 0);
    assertEquals("1,1 0,0", cs2b.toString().trim());
    assertEquals("2,1 1,1", cs2b.rotate60().toString().trim());
    assertEquals("1,1 2,0", cs2b.mirrorVert().toString().trim());
  }
}
