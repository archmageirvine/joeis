package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PrimePowersTest extends TestCase {

  public void test() {
    final PrimePowers pp = new PrimePowers();
    assertEquals(1L, pp.next().getKey().longValue());
    assertEquals(2L, pp.next().getKey().longValue());
    assertEquals(3L, pp.next().getKey().longValue());
    assertEquals(4L, pp.next().getKey().longValue());
    assertEquals(5L, pp.next().getKey().longValue());
    assertEquals(7L, pp.next().getKey().longValue());
    assertEquals(8L, pp.next().getKey().longValue());
    assertEquals(9L, pp.next().getKey().longValue());
    assertEquals(11L, pp.next().getKey().longValue());
  }
}
