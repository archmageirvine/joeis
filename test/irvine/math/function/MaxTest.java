package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MaxTest extends TestCase {

  public void testMax() {
    assertEquals(Z.ONE, Functions.MAX.z(Z.ZERO, Z.ZERO, Z.NEG_ONE, Z.ONE));
    assertEquals(Z.ONE, Functions.MAX.z(Z.ONE, Z.ZERO, Z.NEG_ONE, Z.ONE));
    assertEquals(Z.ONE, Functions.MAX.z(Z.ONE));
    assertNull(Functions.MAX.z(new Z[] {}));
  }
}
