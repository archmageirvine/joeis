package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class TwoDimensionalWalkTest extends TestCase {

  public void test() {
    final TwoDimensionalWalk walk = new TwoDimensionalWalk(0, 0, null);
    assertTrue(walk.contains(0, 0));
    assertFalse(walk.contains(0, 1));
    assertFalse(walk.contains(1, 0));
    assertNull(walk.getPrevious());
    final TwoDimensionalWalk w2 = new TwoDimensionalWalk(1, 0, walk);
    assertEquals(walk, w2.getPrevious());
    assertEquals(1, w2.x());
    assertEquals(0, w2.y());
    assertEquals("(0,0) -> (1,0)", w2.toString());
  }

}
