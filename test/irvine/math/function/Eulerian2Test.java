package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Eulerian2Test extends TestCase {

  public void test() {
    assertEquals(Z.ONE, Functions.EULERIAN2.z(1L, 0L));
    assertEquals(Z.ONE, Functions.EULERIAN2.z(2L, 0L));
    assertEquals(Z.TWO, Functions.EULERIAN2.z(2L, 1L));
    assertEquals(Z.ONE, Functions.EULERIAN2.z(3L, 0L));
    assertEquals(Z.EIGHT, Functions.EULERIAN2.z(3L, 1L));
    assertEquals(Z.SIX, Functions.EULERIAN2.z(3L, 2L));
    assertEquals(Z.ONE, Functions.EULERIAN2.z(4L, 0L));
    assertEquals(Z.valueOf(22), Functions.EULERIAN2.z(4L, 1L));
    assertEquals(Z.valueOf(58), Functions.EULERIAN2.z(4L, 2L));
    assertEquals(Z.valueOf(24), Functions.EULERIAN2.z(4L, 3L));
  }
}
