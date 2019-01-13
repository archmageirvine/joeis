package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PowerTest extends TestCase {

  public void testpow2() {
    assertEquals(0, Power.pow2(0, 0), 0);
    assertEquals(0, Power.pow2(0, 1), 0);
    assertEquals(0, Power.pow2(0, 2), 0);
    assertEquals(0, Power.pow2(0, -1), 0);
    assertEquals(2E-323, Power.pow2(Double.longBitsToDouble(Double.doubleToLongBits(0) + 1), 2), 0);
    assertEquals(4E-323, Power.pow2(Double.longBitsToDouble(Double.doubleToLongBits(0) + 2), 2), 0);
    assertEquals(8E-323, Power.pow2(Double.longBitsToDouble(Double.doubleToLongBits(0) + 4), 2), 0);
    assertEquals(0, Power.pow2(Double.longBitsToDouble(Double.doubleToLongBits(0) + 2), -2), 0);
    assertEquals(4.9E-324, Power.pow2(Double.longBitsToDouble(Double.doubleToLongBits(0) + 4), -2), 0);
    assertTrue(0 != Power.pow2(Double.longBitsToDouble(0xFFFFFFFFFFFFFL), -52));
    assertTrue(0 == Power.pow2(Double.longBitsToDouble(0xFFFFFFFFFFFFFL), -53));
    assertEquals(35184372088832L, Double.doubleToLongBits(Power.pow2(Double.longBitsToDouble(0xFFFFFFFFFFFFFL) * 2, -8)));

    assertEquals(Double.POSITIVE_INFINITY, Power.pow2(1, 1025), 0);
    assertEquals(Double.NEGATIVE_INFINITY, Power.pow2(-1, 1025), 0);
    assertEquals(0, Power.pow2(1, -1076), 0);

    double x = 1;
    for (int exp = 0; exp < 1024; ++exp) {
      assertEquals("exp = " + exp, 1, (x * Math.pow(2, exp)) / Power.pow2(x, exp), 1E-8);
    }
    for (int exp = 0; exp < 1075; ++exp) {
      assertEquals("exp = " + (-exp), 1, (x * Math.pow(2, -exp)) / Power.pow2(x, -exp), 1E-8);
    }
    x = Math.PI;
    for (int exp = 0; exp < 300; exp += 3) {
      assertEquals("exp = " + exp, 1, (x * Math.pow(2, exp)) / Power.pow2(x, exp), 1E-8);
    }
    for (int exp = 0; exp < 308; exp += 3) {
      assertEquals("exp = " + (-exp), 1, (x * Math.pow(2, -exp)) / Power.pow2(x, -exp), 1E-8);
    }
  }

  public void testgetExponent() {
    assertEquals(0, Power.getExponent(0.0));
    assertEquals(0.0, Power.sNormalizedMantissa, 0.0);

    // test powers of two > 1
    double x = 1.0;
    int exp = 1;
    while (x != Double.POSITIVE_INFINITY) {
      assertEquals("exp = " + exp, exp, Power.getExponent(x));
      assertEquals("exp = " + exp, 0.5, Power.sNormalizedMantissa, 1.0E-15);
      assertEquals("exp = " + exp, exp, Power.getExponent(x + 0.1));
      if (exp != 1) {
        assertEquals("exp = " + exp, exp, Power.getExponent(x + 1.0));
      }
      x *= 2.0;
      exp += 1;
    }

    // test power of two < 1
    x = 1.0;
    exp = 1;
    while (x != 0.0) {
      assertEquals("exp = " + exp, exp, Power.getExponent(x));
      assertEquals("exp = " + exp, 0.5, Power.sNormalizedMantissa, 1.0E-15);
      x /= 2.0;
      exp -= 1;
    }
  }

  public void testcbrt() {
    assertEqualsLocal(Double.POSITIVE_INFINITY, Power.cbrt(Double.POSITIVE_INFINITY), 0);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Power.cbrt(Double.NEGATIVE_INFINITY), 0);
    assertEqualsLocal(0, Power.cbrt(0), 0);
    assertEqualsLocal(-1, Power.cbrt(-1), 0);
    assertEqualsLocal(1, Power.cbrt(1), 0);
    assertEqualsLocal(-1.442249570307408382321638310755743800238, Power.cbrt(-3), 1E-10);
    for (double x = 1; x < Double.POSITIVE_INFINITY; x *= Math.PI) {
      assertEqualsLocal(1, Math.pow(x, 1 / 3.0) / Power.cbrt(x), 1E-10);
      assertEqualsLocal(1, -Math.pow(x, 1 / 3.0) / Power.cbrt(-x), 1E-10);
    }
    for (double x = 1; x > 0; x /= Math.PI) {
      final double p = Math.pow(x, 1 / 3.0);
      final double r = Power.cbrt(x);
      assertEqualsLocal(x + " " + p + " " + r, 1, p / r, 1E-10);
    }
  }

}
