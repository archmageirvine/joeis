package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ModPowTest extends TestCase {

  private static final Random RANDOM = new Random();


  public void testModPowBug() {
    final Z n = new Z("846792942");
    final Z e = new Z("673236443338");
    final Z m = Z.valueOf(30L);
    assertEquals(12, n.mod(m).intValue());
    assertEquals(144, Z.valueOf(12L).square().intValue());
    assertEquals(24, Z.valueOf(12L).modSquare(m).intValue());
    assertEquals(24, n.modPow(e, m).intValue());
  }

  public void testModPowBug2() {
    final Z n = Z.valueOf(7L);
    final Z m = Z.valueOf(6L);
    final Z e = m.negate();
    assertEquals(Z.ONE, m.modPow(e, n));
  }

  public void testModPowBug3() {
    final Z n = Z.valueOf(5L);
    final Z m = Z.TWO;
    final Z e = m.negate();
    assertEquals(Z.valueOf(4L), m.modPow(e, n));
  }

  public void testZeros() {
    try {
      Z.TWO.modPow(Z.ONE, Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertEquals(Z.ONE, ModPow.modPow(Z.ZERO, Z.ZERO, Z.TWO));
    assertEquals(Z.ONE, ModPow.modPow(Z.THREE, Z.ZERO, Z.FOUR));
    assertEquals(Z.ZERO, ModPow.modPow(Z.ZERO, Z.THREE, Z.FOUR));
    assertEquals(Z.ZERO, new Z("374295361095149865036").modPow(Z.ZERO, Z.ONE));
  }

  public void testModPow() {
    for (int i = 30; i < 100; i += 13) {
      final BigInteger n = new BigInteger(i, RANDOM);
      final Z zn = Z.valueOf(n);
      for (int j = 5; j < 100; j += 13) {
        final BigInteger m = new BigInteger(j, RANDOM);
        if (BigInteger.ZERO.equals(m)) {
          continue;
        }
        final Z zm = Z.valueOf(m);
        for (int k = 5; k < 100; k += 13) {
          final BigInteger b = new BigInteger(k, RANDOM);
          final Z zb = Z.valueOf(b);
          assertEquals(n + "^" + b + "%" + m, n.modPow(b, m), zn.modPow(zb, zm).bigIntegerValue());
        }
      }
    }
  }

  public void testOtherException() {
    final Z a = Z.valueOf(12);
    final Z b = Z.THREE.negate();
    try {
      ModPow.modPow(Z.THREE, b, a);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Undefined quotient during invert.", e.getMessage());
    }
  }

  public void testBigExponent() {
    assertEquals(Z.valueOf(651901641), ModPow.modPow(Z.THREE, Z.valueOf(3L * Z.BASE), Z.valueOf(Z.BASE + 1)));
  }
}
