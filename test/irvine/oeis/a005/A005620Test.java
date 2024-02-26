package irvine.oeis.a005;

import java.util.Random;

import irvine.math.z.Z;
import irvine.math.zi.Zi;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A005620Test extends TestCase {

  public void testXyToUlamSpiral() {
    assertEquals(Z.ONE, A005620.xyToUlamSpiral(Z.ZERO, Z.ZERO));
    assertEquals(Z.TWO, A005620.xyToUlamSpiral(Z.ONE, Z.ZERO));
    assertEquals(Z.THREE, A005620.xyToUlamSpiral(Z.ONE, Z.ONE));
    assertEquals(Z.FOUR, A005620.xyToUlamSpiral(Z.ZERO, Z.ONE));
    assertEquals(Z.FIVE, A005620.xyToUlamSpiral(Z.NEG_ONE, Z.ONE));
    assertEquals(Z.SIX, A005620.xyToUlamSpiral(Z.NEG_ONE, Z.ZERO));
    assertEquals(Z.SEVEN, A005620.xyToUlamSpiral(Z.NEG_ONE, Z.NEG_ONE));
    assertEquals(Z.EIGHT, A005620.xyToUlamSpiral(Z.ZERO, Z.NEG_ONE));
    assertEquals(Z.valueOf(49), A005620.xyToUlamSpiral(Z.THREE, Z.THREE.negate()));
  }

  public void testUlamSpiralToXY() {
    assertEquals(new Zi(Z.ZERO, Z.ZERO), A005620.ulamSpiralToXY(Z.ONE));
    assertEquals(new Zi(Z.ONE, Z.ZERO), A005620.ulamSpiralToXY(Z.TWO));
    assertEquals(new Zi(Z.ONE, Z.ONE), A005620.ulamSpiralToXY(Z.THREE));
    assertEquals(new Zi(Z.ZERO, Z.ONE), A005620.ulamSpiralToXY(Z.FOUR));
  }

  public void testRandom() {
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final Z n = Z.valueOf(r.nextInt(100000) + 1);
      final Zi xy = A005620.ulamSpiralToXY(n);
      assertEquals(n, A005620.xyToUlamSpiral(xy.re(), xy.im()));
    }
  }
}
