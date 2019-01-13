package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class HyperbolicTest extends TestCase {

  private static final boolean SPEED_TEST = false;

  public void testAsinh() {
    // special cases
    assertEquals(0.0, Hyperbolic.asinh(0.0), 0.0);
    assertEquals(-0.0, Hyperbolic.asinh(-0.0), 0.0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Hyperbolic.asinh(Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Hyperbolic.asinh(Double.NEGATIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, Hyperbolic.asinh(Double.NaN), 0.0);
    assertEqualsLocal(0.481211825059603447497758913424368423134, Hyperbolic.asinh(0.5), 1.0E-15);
    assertEqualsLocal(-0.88137358701954302523260932495, Hyperbolic.asinh(-1.0), 1.0E-15);
    assertEqualsLocal(1.443635475178810342493276740259, Hyperbolic.asinh(2.0), 1.0E-15);
    assertEqualsLocal(35.231923575470630569687103941588, Hyperbolic.asinh(1.0E15), 1.0E-15);
    assertEqualsLocal(19.51929303, Hyperbolic.asinh(1.5E8), 1.0E-6);
    assertEqualsLocal(19.11382792451231, Hyperbolic.asinh(ConstantsTest.bump(1.0E8)), 1.0E-13);
    assertEqualsLocal(19.806975105072254, Hyperbolic.asinh(ConstantsTest.sump(2.0E8)), 1.0E-13);

    // comparison test
    for (double x = 0.0; x < 10.0; x += 0.003) {
      double a = Math.log(x + Math.sqrt(x * x + 1));
      double b = Hyperbolic.asinh(x);
      if (a != b) {
        assertEquals("x=" + x, 0.0, (a - b) / (a + b), 1.0E-13);
      }
      a = Math.log(-x + Math.sqrt(x * x + 1));
      b = Hyperbolic.asinh(-x);
      if (a != b) {
        assertEquals("x=" + (-x), 0.0, (a - b) / (a + b), 1.0E-13);
      }
    }

    if (SPEED_TEST) {
      double b = 0.0;
      long t1 = System.currentTimeMillis();
      for (double x = -100.0; x < 100.0; x += 0.0001) {
        b += Math.log(x + Math.sqrt(x * x + 1));
      }
      t1 = System.currentTimeMillis() - t1;
      t1 *= 20; // asinh should not be more than 20 times slower
      long t2 = System.currentTimeMillis();
      for (double x = -100.0; x < 100.0; x += 0.0001) {
        b += Hyperbolic.asinh(x);
      }
      t2 = System.currentTimeMillis() - t2;
      assertTrue("Speed error, asinh = " + t2 + " ln method = " + t1, t2 < t1);
    }
  }

  public void testAcosh() {
    // special cases
    assertEquals(0.0, Hyperbolic.acosh(1.0), 0.0);
    assertEqualsLocal(Double.NaN, Hyperbolic.acosh(0.0), 0.0);
    assertEqualsLocal(Double.NaN, Hyperbolic.acosh(0.999999999), 0.0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Hyperbolic.acosh(Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, Hyperbolic.acosh(Double.NEGATIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, Hyperbolic.acosh(Double.NaN), 0.0);
    assertEqualsLocal(0.96242365011920689499551782683, Hyperbolic.acosh(1.5), 1.0E-15);
    assertEqualsLocal(1.316957896924816708625046347301, Hyperbolic.acosh(2.0), 1.0E-15);
    assertEqualsLocal(35.231923575470630569687103941588, Hyperbolic.acosh(1.0E15), 1.0E-15);

    // comparison test
    for (double x = 1.0; x < 15.0; x += 0.003) {
      final double a = Math.log(x + Math.sqrt(x * x - 1));
      final double b = Hyperbolic.acosh(x);
      if (a != b) {
        assertEquals("x=" + x, 0.0, (a - b) / (a + b), 1.0E-13);
      }
    }

    if (SPEED_TEST) {
      double b = 0.0;
      long t1 = System.currentTimeMillis();
      for (double x = 1.0; x < 200.0; x += 0.0001) {
        b += Math.log(x + Math.sqrt(x * x - 1));
      }
      t1 = System.currentTimeMillis() - t1;
      t1 *= 20; // acosh should not be more than 20 times slower
      long t2 = System.currentTimeMillis();
      for (double x = 1.0; x < 200.0; x += 0.0001) {
        b += Hyperbolic.acosh(x);
      }
      t2 = System.currentTimeMillis() - t2;
      assertTrue("Speed error, acosh = " + t2 + " ln method = " + t1, t2 < t1);
    }
  }

  public void testAtanh() {
    // special cases
    assertEquals(0.0, Hyperbolic.atanh(0.0), 0.0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Hyperbolic.atanh(1.0), 0.0);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Hyperbolic.atanh(-1.0), 0.0);
    assertEqualsLocal(Double.NaN, Hyperbolic.atanh(1.000000000000001), 0.0);
    assertEqualsLocal(Double.NaN, Hyperbolic.atanh(-1.000000000000001), 0.0);
    assertEqualsLocal(0.549306144334054845697622618461262852321, Hyperbolic.atanh(0.5), 1.0E-15);
    assertEqualsLocal(17.61596178773531085447109962202, Hyperbolic.atanh(0.999999999999999), 1.0E-2);

    // comparison test
    for (double x = 0.0; x < 1.0; x += 0.00003) {
      final double a = 0.5 * Math.log((1.0 + x) / (1.0 - x));
      final double b = Hyperbolic.atanh(x);
      if (a != b) {
        assertEquals("x=" + x, 0.0, (a - b) / (a + b), 1.0E-9);
      }
    }

    // sign test
    for (double x = 0.0; x < 1.0; x += 0.00003) {
      final double a = Hyperbolic.atanh(x);
      final double b = -Hyperbolic.atanh(-x);
      if (a != b) {
        assertEquals("x=" + x, 0.0, (a - b) / (a + b), 1.0E-15);
      }
    }

    if (SPEED_TEST) {
      double b = 0.0;
      long t1 = System.currentTimeMillis();
      for (double x = 0.0; x < 1.0; x += 0.00001) {
        b += 0.5 * Math.log((1.0 + x) / (1.0 - x));
      }
      t1 = System.currentTimeMillis() - t1;
      t1 *= 10; // atanh should not be more than 10 times slower
      long t2 = System.currentTimeMillis();
      for (double x = 0.0; x < 1.0; x += 0.00001) {
        b += Hyperbolic.atanh(x);
      }
      t2 = System.currentTimeMillis() - t2;
      assertTrue("Speed error, atanh = " + t2 + " ln method = " + t1, t2 < t1);
    }
  }

}
