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
  }
}
