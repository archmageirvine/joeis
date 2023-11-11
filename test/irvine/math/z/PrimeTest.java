package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PrimeTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testIsProbablePrime() {
    for (int i = -10; i < 0; ++i) {
      assertFalse(Z.valueOf(i).isProbablePrime());
    }
    for (int i = 0; i < 100; ++i) {
      assertEquals(String.valueOf(i), BigInteger.valueOf(i).isProbablePrime(30), Z.valueOf(i).isProbablePrime());
    }
    assertTrue(Z.valueOf(1373639).isProbablePrime());
    assertFalse(Z.valueOf(1373653).isProbablePrime());
    assertTrue(Z.valueOf(25325981).isProbablePrime());
    assertFalse(Z.valueOf(25326001).isProbablePrime());
    assertTrue(Z.valueOf(1073741789).isProbablePrime());
    assertTrue(Z.valueOf(1186670087461L).isProbablePrime());
    assertFalse(Z.valueOf(1186670087467L).isProbablePrime());
    assertTrue(Z.valueOf(2152302898729L).isProbablePrime());
    assertFalse(Z.valueOf(2152302898747L).isProbablePrime());
    assertTrue(Z.valueOf(3474749660329L).isProbablePrime());
    assertFalse(Z.valueOf(3474749660383L).isProbablePrime());
    assertTrue(Z.valueOf(341550071728289L).isProbablePrime());

    assertTrue(Z.ONE.shiftLeft(61).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(89).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(107).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(127).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(521).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(607).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(1279).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(2203).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(2281).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(3217).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(4253).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(4423).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(9689).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(9941).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(11213).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(19937).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(21701).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(23209).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(44497).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(86243).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(110503).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(132049).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(216091).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(756839).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(859433).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(1257787).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(1398263).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(1398269).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(2976221).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(3021377).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(6972593).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(13466917).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(20996011).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(24036583).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(30402457).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(32582657).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(37156667).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(42643801).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(43112609).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(57885161).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(25964950).subtract(Z.ONE).isProbablePrime());
    assertTrue(Z.ONE.shiftLeft(25964951).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(62).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(90).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(108).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(128).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(522).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(608).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(1280).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(2204).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(2282).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(3218).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(4254).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(4424).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(9690).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(9942).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(11214).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(19938).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(21702).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(23210).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(44498).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(86244).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(110504).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(132050).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(216092).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(756840).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(859434).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(1257788).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(1398264).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(1398270).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(2976222).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(3021378).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(6972594).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(13466918).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(20996012).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(24036584).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(25964952).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(23770471).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(30402458).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(32582658).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(37156668).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(42643802).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(43112610).subtract(Z.ONE).isProbablePrime());
    assertFalse(Z.ONE.shiftLeft(57885162).subtract(Z.ONE).isProbablePrime());
  }

  public void testRandomValues() {
    for (int i = 10; i < 1000; i += 17) {
      final BigInteger m = new BigInteger(i, RANDOM);
      final Z z = Z.valueOf(m);
      assertEquals(m.toString(), m.isProbablePrime(30), z.isProbablePrime());
    }
  }

  private void checkFail(final Z n) {
    try {
      Prime.primeTest(n, 0, true);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Sorry, number is too hard for me.", e.getMessage());
    }
  }

  public void testPrimeTest() {
    assertFalse(Prime.primeTest(Z.valueOf(2047L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(1373653L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(25326001L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(3215031751L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(2152302898747L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(3474749660383L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(1185410973679L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(2150704873459L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(1186670087461L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(1186670087465L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(1186670087501L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(2152302898729L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(3473554800607L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(2152302898745L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(3474749660329L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(3474749660381L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(341550071728289L), 0, true));
    assertFalse(Prime.primeTest(Z.valueOf(341550071728319L), 0, true));
    assertTrue(Prime.primeTest(Z.valueOf(341550071728361L), 0, false));
    assertTrue(Prime.primeTest(Z.valueOf(2305843009213693951L), 0, true));
    checkFail(Z.valueOf(341550071728361L));
    checkFail(new Z("1237940039285381461383839753"));
    checkFail(new Z("1237940039285382426677739581"));
    checkFail(new Z("1237940039285383749527666869"));
  }
}
