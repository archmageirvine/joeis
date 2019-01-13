package irvine.math.nauty;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class NautySetTest extends TestCase {

  public void test() {
    final NautySet set = new NautySet(2);
    assertEquals(0, set.getBlock(0));
    assertEquals(0, set.getBlock(1));
    set.set(0);
    assertEquals(1L << 63, set.getBlock(0));
    assertEquals(0, set.getBlock(1));
    set.set(63);
    assertEquals((1L << 63) + 1, set.getBlock(0));
    assertEquals(0, set.getBlock(1));
    set.clear(0);
    assertEquals(1, set.getBlock(0));
    assertEquals(0, set.getBlock(1));
    set.set(126);
    assertEquals(1, set.getBlock(0));
    assertEquals(2, set.getBlock(1));
    assertEquals(63, set.next(-1));
    assertEquals(126, set.next(63));
    assertEquals(-1, set.next(126));
    set.clear();
    assertEquals(0, set.getBlock(0));
    assertEquals(0, set.getBlock(1));
    assertEquals(-1, set.next(-1));
  }
}
