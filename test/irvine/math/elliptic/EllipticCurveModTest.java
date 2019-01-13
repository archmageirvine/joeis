package irvine.math.elliptic;

import java.util.Arrays;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EllipticCurveModTest extends TestCase {

  public void test() {
    final EllipticCurveMod ec = new EllipticCurveMod(Z.TWO, Z.FIVE, Z.valueOf(23));
    assertTrue(ec.isAbelian());
    assertNull(ec.zero());
    assertTrue(Arrays.equals(ec.zero(), ec.negate(ec.zero())));
    assertTrue(Arrays.equals(new Z[] {Z.valueOf(21), Z.valueOf(19)}, ec.doublePoint(new Z[] {Z.FIVE, Z.FIVE})));
  }
}
