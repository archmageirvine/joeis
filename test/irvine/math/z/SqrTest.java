package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SqrTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testSquare() {
    assertTrue(Z.ZERO == Z.ZERO.square());
    assertEquals(Z.ONE, Z.ONE.square());
    assertEquals(Z.ONE, Z.NEG_ONE.square());
    for (int i = 10; i < 800; i += 3) {
      final BigInteger n = new BigInteger(i, RANDOM);
      final Z zn = Z.valueOf(n);
      assertEquals(n + "^2", n.multiply(n), zn.square().bigIntegerValue());
    }
    for (int i = 10; i < 8000; i += 119) {
      final BigInteger n = new BigInteger(i, RANDOM).negate();
      final Z zn = Z.valueOf(n);
      assertEquals(n + "^2", n.multiply(n), zn.square().bigIntegerValue());
      // check immutability
      assertEquals(n, zn.bigIntegerValue());
    }
  }
}
