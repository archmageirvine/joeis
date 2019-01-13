package irvine.math.z;

import irvine.math.LongUtils;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class JacobiTest extends TestCase {

  private static final Random RANDOM = new Random();

  /** Test the Jacobi function. */
  public void testJacobi() {
    // check correspondence with long version
    for (int i = 1; i < 500; ++i) {
      for (int j = 1; j < 500; j += 2) {
        assertEquals("i=" + i + " j=" + j, LongUtils.jacobi(i, j), Z.valueOf(i).jacobi(Z.valueOf(j)));
      }
    }
    // check for +1, 0, -1 on random arguments
    for (int i = 0; i < 1000; ++i) {
      final int t = Z.valueOf(new BigInteger(256, RANDOM)).jacobi(Z.valueOf(new BigInteger(256, RANDOM)));
      if (t < -1 || t > 1) {
        fail("Jacobi symbols was not -1, 0, +1");
      }
    }
    // check for +1, 0, -1 on random arguments
    for (int i = 0; i < 10; ++i) {
      final int t = Z.valueOf(new BigInteger(1024, RANDOM)).jacobi(Z.valueOf(new BigInteger(1024, RANDOM)));
      if (t < -1 || t > 1) {
        fail("Jacobi symbols was not -1, 0, +1");
      }
    }
    try {
      Z.ZERO.jacobi(Z.NEG_ONE);
      fail("Took negative");
    } catch (final ArithmeticException e) {
      assertEquals("Nonpositive second argument given to jacobi", e.getMessage());
    }
  }

  public void testJacobiBug() {
    assertEquals(-1, Jacobi.jacobi(Z.valueOf(-16), new Z("123364219848456840016582472194057235542531542945822941579546377034313457671848274049792473229023255829990967944149719266416171730726929074049287")));
  }

  public void testEven() {
    assertEquals(0, Jacobi.jacobi(Z.TWO, Z.FOUR));
    assertEquals(0, Jacobi.jacobi(Z.TWO.negate(), Z.FOUR));
    assertEquals(-1, Jacobi.jacobi(Z.THREE, Z.FOUR));
    assertEquals(1, Jacobi.jacobi(Z.THREE.negate(), Z.FOUR));
    assertEquals(1, Jacobi.jacobi(Z.FIVE, Z.FOUR));
    assertEquals(-1, Jacobi.jacobi(Z.FIVE.negate(), Z.FOUR));
    assertEquals(-1, Jacobi.jacobi(Z.THREE.negate(), Z.FIVE));
    assertEquals(1, Jacobi.jacobi(Z.NINE, Z.valueOf(16)));
    assertEquals(1, Jacobi.jacobi(Z.valueOf(17), Z.valueOf(16)));
  }
}
