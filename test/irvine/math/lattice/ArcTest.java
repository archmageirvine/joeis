package irvine.math.lattice;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ArcTest extends TestCase {

  public void testRotate() {
    final Animal a0 = new Animal(Lattices.ARC.origin(), Lattices.ARC.toPoint(0, 0, 4), Lattices.ARC.toPoint(0, 1, 1));
    final Animal a1 = Arc.rotate(a0);
    assertEquals("(1,0,1),(0,0,2),(1,0,5)", a1.toString(Lattices.ARC));
    assertEquals("(1,0,0),(0,0,2),(1,0,4)", Arc.handleFullCell(a1).toString(Lattices.ARC));
  }
}
