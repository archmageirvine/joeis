package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Coord3Test extends TestCase {

  public void test() {
    final Coord3 c3 = new Coord3(0, 1, 2);
    assertEquals("0,1,2", c3.makeDiagram());
    assertEquals("1,0,2", c3.mirrorxy().makeDiagram());
    assertEquals("2,1,0", c3.mirrorxz().makeDiagram());
    assertEquals("0,1,-2", c3.mirrorz().makeDiagram());
    assertEquals("-2,0,2", c3.rotxy().makeDiagram());
    assertEquals("-3,1,0", c3.rotxz().makeDiagram());
    assertTrue(c3.isSame(c3));
    assertFalse(c3.isSame(new Coord3(1, 2, 0)));
    assertEquals(0, c3.get(0));
    assertEquals(1, c3.get(1));
    assertEquals(2, c3.get(2));
  }
}
