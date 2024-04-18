package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PhiTest extends TestCase {

  public void test() {
    final Function1 f = new Phi();
    assertEquals(1, f.l(1));
    assertEquals(1, f.l(2));
    assertEquals(12, f.l(42));
    assertEquals(1836, f.l(2763));
    assertEquals(new Z("679261677141200101392369844224000000000000000000000000000000"), f.z(Z.ONE.shiftLeft(200).subtract(1)));
    assertEquals(151200, f.i(226625));
    assertEquals(65536, f.i(65537));
    assertEquals(4, f.i(5));
    assertEquals(12656, f.i(18987));
    assertEquals(Z.ZERO, f.z(Z.ZERO));
    assertEquals(Z.ONE, f.z(Z.ONE));
    assertEquals(Z.ONE, f.z(Z.NEG_ONE));
    assertEquals(Z.ONE, f.z(Z.TWO));
    assertEquals(Z.TWO, f.z(Z.THREE));
    assertEquals(Z.TWO, f.z(Z.FOUR));
    assertEquals(Z.FOUR, f.z(Z.FIVE));
  }

  private static final long[] PHI = {
    0, 1, 1, 2, 2, 4, 2, 6, 4, 6, 4, 10, 4, 12, 6, 8, 8, 16, 6, 18, 8, 12, 10, 22, 8, 20, 12, 18, 12, 28, 8, 30, 16, 20, 16, 24, 12, 36, 18, 24, 16, 40, 12, 42, 20, 24, 22, 46, 16, 42, 20, 32, 24, 52, 18, 40, 24, 36, 28, 58, 16, 60, 30, 36, 32, 48, 20, 66, 32, 44};

  public void testPhiAsLong() {
    final Function1 f = new Phi();
    for (int k = 0; k < PHI.length; ++k) {
      assertEquals(PHI[k], f.l(k));
      assertEquals(PHI[k], f.l(-k));
    }
  }
}
