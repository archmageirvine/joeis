package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PopCountTest extends TestCase {

  public void testPopCount() {
    assertEquals(0, PopCount.popcount(0));
    assertEquals(32, PopCount.popcount(~0));
    assertEquals(31, PopCount.popcount(0xFFFFFFFE));
    assertEquals(1, PopCount.popcount(1));
    assertEquals(1, PopCount.popcount(2));
    assertEquals(2, PopCount.popcount(3));
    assertEquals(1, PopCount.popcount(4));
    assertEquals(2, PopCount.popcount(5));
    assertEquals(2, PopCount.popcount(6));
    assertEquals(3, PopCount.popcount(7));
    assertEquals(1, PopCount.popcount(8));
    assertEquals(2, PopCount.popcount(9));
    assertEquals(2, PopCount.popcount(10));
    assertEquals(3, PopCount.popcount(11));
    assertEquals(2, PopCount.popcount(12));
    assertEquals(3, PopCount.popcount(13));
    assertEquals(3, PopCount.popcount(14));
    assertEquals(4, PopCount.popcount(15));
  }

  public void testPopCountLong() {
    assertEquals(0, PopCount.popcount(0L));
    assertEquals(64, PopCount.popcount(~0L));
    assertEquals(63, PopCount.popcount(0xFFFFFFFFFFFFFFFEL));
    assertEquals(1, PopCount.popcount(1L));
    assertEquals(1, PopCount.popcount(2L));
    assertEquals(2, PopCount.popcount(3L));
    assertEquals(1, PopCount.popcount(4L));
    assertEquals(2, PopCount.popcount(5L));
    assertEquals(2, PopCount.popcount(6L));
    assertEquals(3, PopCount.popcount(7L));
    assertEquals(1, PopCount.popcount(8L));
    assertEquals(2, PopCount.popcount(9L));
    assertEquals(2, PopCount.popcount(10L));
    assertEquals(3, PopCount.popcount(11L));
    assertEquals(2, PopCount.popcount(12L));
    assertEquals(3, PopCount.popcount(13L));
    assertEquals(3, PopCount.popcount(14L));
    assertEquals(4, PopCount.popcount(15L));
  }
}
