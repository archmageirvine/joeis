package irvine.util;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PairTest extends TestCase {

  public void testPair() {
    final Pair<Integer, String> p = new Pair<>(42, "H");
    assertEquals(Integer.valueOf(42), p.left());
    assertEquals("H", p.right());
    assertEquals("(42,H)", p.toString());
  }
}

