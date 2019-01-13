package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Mul2Test extends TestCase {

  private static final Random RANDOM = new Random();

  public void testMul2() {
    assertTrue(Z.ZERO == Z.ZERO.multiply2());
    assertEquals(Z.TWO, Z.ONE.multiply2());
    assertEquals(Z.TWO.negate(), Z.NEG_ONE.multiply2());
    final BigInteger two = BigInteger.valueOf(2L);
    for (int i = 2; i < 100; ++i) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final Z zd = Z.valueOf(d);
      assertEquals(d.multiply(two), zd.multiply2().bigIntegerValue());
      assertEquals(d.negate().multiply(two), zd.negate().multiply2().bigIntegerValue());
    }
  }

}
