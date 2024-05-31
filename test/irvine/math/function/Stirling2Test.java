package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Stirling2Test extends TestCase {

  public void testSecondKind() {
    assertEquals(Z.valueOf(20415995028L), Functions.STIRLING2.z(17, 8));
  }

  public void testIllegal() {
    try {
      Functions.STIRLING2.z(-1, 10);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }
}
