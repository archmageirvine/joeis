package irvine.oeis.a005;

import java.util.Random;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.util.Pair;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A005620Test extends AbstractSequenceTest {

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
    assertEquals(new Pair<>(Z.ZERO, Z.ZERO), A005620.ulamSpiralToXY(Z.ONE));
    assertEquals(new Pair<>(Z.ONE, Z.ZERO), A005620.ulamSpiralToXY(Z.TWO));
    assertEquals(new Pair<>(Z.ONE, Z.ONE), A005620.ulamSpiralToXY(Z.THREE));
    assertEquals(new Pair<>(Z.ZERO, Z.ONE), A005620.ulamSpiralToXY(Z.FOUR));
  }

  public void testRandom() {
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final Z n = Z.valueOf(r.nextInt(100000) + 1);
      final Pair<Z, Z> xy = A005620.ulamSpiralToXY(n);
      assertEquals(n, A005620.xyToUlamSpiral(xy.left(), xy.right()));
    }
  }
}
