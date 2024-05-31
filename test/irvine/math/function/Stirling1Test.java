package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Stirling1Test extends TestCase {

  public void testFirstKind() {
    assertEquals(Z.ONE, Functions.STIRLING1.z(1, 1));
    assertEquals(Z.ZERO, Functions.STIRLING1.z(1, 0));
    assertEquals(Z.ZERO, Functions.STIRLING1.z(0, 1));
    assertEquals(Z.valueOf(-1146901283528L), Functions.STIRLING1.z(17, 8));
  }

  public void testIllegal() {
    try {
      Functions.STIRLING1.z(-1, 10);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      Functions.STIRLING1.z(10, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }
}
