package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LongOrderedPairTest extends TestCase {

  public void test() {
    final LongOrderedPair p = new LongOrderedPair(2, 3);
    assertEquals("(2,3)", p.toString());
    assertEquals(p, new LongOrderedPair(2, 3));
    assertEquals(p, new LongOrderedPair(3, 2));
  }
}
