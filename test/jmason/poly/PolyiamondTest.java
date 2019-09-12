package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PolyiamondTest extends TestCase {

  public void test() {
    final CoordSet2T cs2 = new CoordSet2T(1, false, false, false);
    cs2.initMonoiamond();
    final Polyiamond p = new Polyiamond(cs2);
    assertEquals(1, p.getHeight());
    assertEquals(1, p.getWidth());
    assertEquals(1, p.listSons(0).size());
    assertEquals(1, p.listSons(1).size());
  }
}
