package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import static irvine.math.r.Beta.beta;
import static irvine.math.r.Beta.ibeta;
import static irvine.math.r.Beta.inverseibeta;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BetaTest extends TestCase {

  public void testBeta() {
    // check for NaN operation
    assertEqualsLocal(NaN, beta(NaN, NaN), 0.0);
    assertEqualsLocal(NaN, beta(NaN, 0.0), 0.0);
    assertEqualsLocal(NaN, beta(NaN, 1.0), 0.0);
    assertEqualsLocal(NaN, beta(0.0, NaN), 0.0);
    assertEqualsLocal(NaN, beta(1.0, NaN), 0.0);

    for (double x = -10.0; x < 10.0; x += 0.1) {
      for (double y = -10.0; y < 10.0; y += 0.1) {
        final double a = Gamma.gamma(x) * Gamma.gamma(y) / Gamma.gamma(x + y);
        final double b = beta(x, y);
        if (!(Double.isNaN(a) && Double.isNaN(b)) && a != b) {
          assertEqualsLocal("beta(" + x + ", " + y + ")", 0.0, (a - b) / (a + b), 1.0E-12);
        }
      }
    }
  }

  public void testibeta() {
    // check for NaN operation
    assertEqualsLocal(NaN, ibeta(NaN, NaN, NaN), 0.0);
    assertEqualsLocal(NaN, ibeta(NaN, 0.0, 0.5), 0.0);
    assertEqualsLocal(NaN, ibeta(NaN, 1.0, 0.5), 0.0);
    assertEqualsLocal(NaN, ibeta(0.0, NaN, 0.5), 0.0);
    assertEqualsLocal(NaN, ibeta(1.0, NaN, 0.5), 0.0);
    assertEqualsLocal(NaN, ibeta(0.0, 0.5, NaN), 0.0);
    assertEqualsLocal(NaN, ibeta(1.0, 0.5, NaN), 0.0);
    assertEqualsLocal(NaN, ibeta(0.0, 0.5, 0.0), 0.0);
    assertEqualsLocal(NaN, ibeta(0.0, 0.5, 1.0), 0.0);
    assertEqualsLocal(NaN, ibeta(0.5, 0.0, 0.0), 0.0);
    assertEqualsLocal(NaN, ibeta(0.5, 0.0, 1.0), 0.0);
    assertEqualsLocal(NaN, ibeta(0.0, -0.5, 0.0), 0.0);
    assertEqualsLocal(NaN, ibeta(0.0, -0.5, 1.0), 0.0);
    assertEqualsLocal(NaN, ibeta(-0.5, 0.0, 0.0), 0.0);
    assertEqualsLocal(NaN, ibeta(-0.5, 0.0, 1.0), 0.0);

    // check x = 0 asymptote
    assertEqualsLocal(0.0, ibeta(0.5, 0.5, 0.0), 0.0);
    assertEqualsLocal(0.0, ibeta(0.5, 1.0, 0.0), 0.0);
    assertEqualsLocal(0.0, ibeta(0.5, 2.0, 0.0), 0.0);
    assertEqualsLocal(0.0, ibeta(1.0, 0.5, 0.0), 0.0);
    assertEqualsLocal(0.0, ibeta(2.0, 0.5, 0.0), 0.0);
    assertEqualsLocal(0.0, ibeta(0.5, POSITIVE_INFINITY, 0.0), 0.0);
    assertEqualsLocal(0.0, ibeta(POSITIVE_INFINITY, 0.5, 0.0), 0.0);

    // check x = 1 asymptote
    assertEqualsLocal(1.0, ibeta(0.5, 0.5, 1.0), 0.0);
    assertEqualsLocal(1.0, ibeta(0.5, 1.0, 1.0), 0.0);
    assertEqualsLocal(1.0, ibeta(0.5, 2.0, 1.0), 0.0);
    assertEqualsLocal(1.0, ibeta(1.0, 0.5, 1.0), 0.0);
    assertEqualsLocal(1.0, ibeta(2.0, 0.5, 1.0), 0.0);
    assertEqualsLocal(1.0, ibeta(0.5, POSITIVE_INFINITY, 1.0), 0.0);
    assertEqualsLocal(1.0, ibeta(POSITIVE_INFINITY, 0.5, 1.0), 0.0);

    // test some values calculate with GNUPLOT ibeta command
    assertEquals(0.855072396962561, ibeta(0.5, 5.0, 0.2), 1.0E-6);
    assertEquals(0.972677079809994, ibeta(0.5, 5.0, 0.4), 1.0E-6);
    assertEquals(0.407264709790447, ibeta(10.0, 9.0, 0.5), 1.0E-6);
    assertEquals(8.63021615131404e-05, ibeta(5.0, 0.5, 0.2), 1.0E-10);

    // test a == b cases
    for (double a = 0.2; a < 100.0; a += 0.2) {
      assertEquals("a=" + a, 0.5, ibeta(a, a, 0.5), 1.0E-10);
    }

    // test via identity 1 = ibeta(a, b, x)+ibeta(b, a, 1-x)
    for (double a = 0.1; a < 20.0; a += 0.1) {
      for (double b = 0.2; b < 10.0; b += 0.2) {
        for (double x = 0.4; x < 0.6; x += 0.02) {
          assertEquals(1.0, ibeta(a, b, x) + ibeta(b, a, 1.0 - x), 1.0E-6);
        }
      }
    }
  }

  public void testinverseibeta() {
    // this testing is probably not as strenuous as it could be.

    // test via ibeta function
    for (double a = 0.1; a < 7.0; a += 0.2) {
      for (double b = 0.1; b < 7.0; b += 0.2) {
        for (double x = 0.1; x < 1.0; x += 0.02) {
          assertEqualsLocal("(a, b, x)=(" + a + ", " + b + ", " + x + ")", x, inverseibeta(a, b, ibeta(a, b, x)), 1.0E-6);
        }
      }
    }

    // test bad arguments
    assertEquals(0.0, inverseibeta(0.0, 0.0, 0.0), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.0, 0.1, 0.0), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.1, 0.0, 0.0), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.1, 0.1, 0.0), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.0, POSITIVE_INFINITY, 0.0), 1.0E-15);
    assertEquals(0.0, inverseibeta(POSITIVE_INFINITY, 0.0, 0.0), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.0, 0.0, 1.0), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.0, 0.1, 1.0), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.1, 0.0, 1.0), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.1, 0.1, 1.0), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.0, POSITIVE_INFINITY, 1.0), 1.0E-15);
    assertEquals(1.0, inverseibeta(POSITIVE_INFINITY, 0.0, 1.0), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.0, 0.0, -0.1), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.0, 0.1, -0.1), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.1, 0.0, -0.1), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.1, 0.1, -0.1), 1.0E-15);
    assertEquals(0.0, inverseibeta(0.0, POSITIVE_INFINITY, -0.1), 1.0E-15);
    assertEquals(0.0, inverseibeta(POSITIVE_INFINITY, 0.0, -0.1), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.0, 0.0, 1.1), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.0, 0.1, 1.1), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.1, 0.0, 1.1), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.1, 0.1, 1.1), 1.0E-15);
    assertEquals(1.0, inverseibeta(0.0, POSITIVE_INFINITY, 1.1), 1.0E-15);
    assertEquals(1.0, inverseibeta(POSITIVE_INFINITY, 0.0, 1.1), 1.0E-15);
  }

}
