package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Eulerian2Test extends TestCase {

  public void test() {
    assertEquals(Z.ONE, Eulerian2.SINGLETON.get(1L, 0L));
    assertEquals(Z.ONE, Eulerian2.SINGLETON.get(2L, 0L));
    assertEquals(Z.TWO, Eulerian2.SINGLETON.get(2L, 1L));
    assertEquals(Z.ONE, Eulerian2.SINGLETON.get(3L, 0L));
    assertEquals(Z.EIGHT, Eulerian2.SINGLETON.get(3L, 1L));
    assertEquals(Z.SIX, Eulerian2.SINGLETON.get(3L, 2L));
    assertEquals(Z.ONE, Eulerian2.SINGLETON.get(4L, 0L));
    assertEquals(Z.valueOf(22), Eulerian2.SINGLETON.get(4L, 1L));
    assertEquals(Z.valueOf(58), Eulerian2.SINGLETON.get(4L, 2L));
    assertEquals(Z.valueOf(24), Eulerian2.SINGLETON.get(4L, 3L));
  }
}
