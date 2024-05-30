package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MaxTest extends TestCase {

  public void testMaxZ() {
    assertEquals(Z.ONE, Functions.MAX.z(Z.ZERO, Z.ZERO, Z.NEG_ONE, Z.ONE));
    assertEquals(Z.ONE, Functions.MAX.z(Z.ONE, Z.ZERO, Z.NEG_ONE, Z.ONE));
    assertEquals(Z.ONE, Functions.MAX.z(Z.ONE));
    assertNull(Functions.MAX.z(new Z[] {}));
  }

  public void testMaxL() {
    assertEquals(10, Functions.MAX.l(new long[] {10, 1}));
    assertEquals(10, Functions.MAX.l(new long[] {10, 10}));
    assertEquals(10, Functions.MAX.l(new long[] {1, 10}));
    assertEquals(-1, Functions.MAX.l(new long[] {-1, -10, -20, -18}));
  }
}
