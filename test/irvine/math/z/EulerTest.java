package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EulerTest extends TestCase {

  public void test() {
    try {
      Euler.phi(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      Euler.phi(Z.ZERO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      Euler.phi(Z.NEG_ONE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(Z.ONE, Euler.phi(Z.ONE));
    assertEquals(Z.ONE, Euler.phi(Z.TWO));
    assertEquals(Z.TWO, Euler.phi(Z.THREE));
    assertEquals(Z.TWO, Euler.phi(Z.FOUR));
    assertEquals(Z.FOUR, Euler.phi(Z.FIVE));
    assertEquals(new Z("65536"), Euler.phi(new Z("65537")));
    assertEquals(new Z("151200"), Euler.phi(new Z("226625")));
    final Euler e = new Euler(226625);
    assertEquals(151200, e.phi(226625));
    assertEquals(65536, e.phi(65537));
    assertEquals(4, e.phi(5));
    assertEquals(12656, e.phi(18987));
  }

  private static final long[] PHI = {
    1, 1, 2, 2, 4, 2, 6, 4, 6, 4, 10, 4, 12, 6, 8, 8, 16, 6, 18, 8, 12, 10, 22, 8, 20, 12, 18, 12, 28, 8, 30, 16, 20, 16, 24, 12, 36, 18, 24, 16, 40, 12, 42, 20, 24, 22, 46, 16, 42, 20, 32, 24, 52, 18, 40, 24, 36, 28, 58, 16, 60, 30, 36, 32, 48, 20, 66, 32, 44};

  public void testPhiAsLong() {
    try {
      Euler.phiAsLong(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      Euler.phiAsLong(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    for (int k = 0; k < PHI.length; ++k) {
      assertEquals(PHI[k], Euler.phiAsLong(k + 1));
    }
  }
}
