package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Coord3SetTest extends TestCase {

  public void test() {
    final Coord3 c0 = new Coord3(0, 0, 1);
    final Coord3 c1 = new Coord3(0, 1, 0);
    final Coord3 c2 = new Coord3(1, 0, 0);
    final Coord3 c3 = new Coord3(0, 0, 0);
    final Coord3Set cs3 = new Coord3Set(c0, c1, c2, c3);
    assertEquals(c2, cs3.getCoord(2));
    assertEquals("[0,0,1][0,1,0][1,0,0][0,0,0]", cs3.makeDiagram());
    assertTrue(cs3.isSame(cs3));
    assertEquals("[-1,0,1][-2,0,0][-1,1,0][-1,0,0]", cs3.rotxy().makeDiagram());
    assertEquals("[-2,0,0][-1,1,0][-1,0,1][-1,0,0]", cs3.rotxz().makeDiagram());
    assertEquals("[0,0,1][1,0,0][0,1,0][0,0,0]", cs3.mirrorxy().makeDiagram());
    assertEquals("[1,0,0][0,1,0][0,0,1][0,0,0]", cs3.mirrorxz().makeDiagram());
    assertEquals("[0,0,-1][0,1,0][1,0,0][0,0,0]", cs3.mirrorz().makeDiagram());
  }
}
