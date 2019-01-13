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
}
