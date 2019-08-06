package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PolyominoTest extends TestCase {

  public void testMonomino() {
    final CoordSet2 cs2 = new CoordSet2(1, false, false, false);
    cs2.initMonomino();
    final Polyomino p = new Polyomino(cs2);
    assertEquals(1, p.getHeight());
    assertEquals(1, p.getWidth());
    assertEquals(3, p.listMirrorSons().size());
    assertFalse(p.holy());
  }
}
