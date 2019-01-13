package irvine.math.r;

import junit.framework.TestCase;

import static irvine.TestUtils.assertEqualsLocal;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ConstantsTest extends TestCase {

  private static final double FP = 1.0E-16;

  /**
   * Roughly speaking, increase a double to the next smallest representable
   * number.
   *
   * @param v values to bump
   * @return bumped value
   */
  static double bump(final double v) {
    return Double.longBitsToDouble(Double.doubleToRawLongBits(v) + 1);
  }

  /**
   * Roughly speaking, decrease a double to the next largest representable
   * number.
   *
   * @param v values to bump
   * @return bumped value
   */
  static double sump(final double v) {
    return Double.longBitsToDouble(Double.doubleToRawLongBits(v) - 1);
  }

  public void testConstants() {
    assertEquals(1.0, Math.log(2) / Constants.LN2, FP);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Math.exp(bump(Constants.MAXLOG)), FP);
    assertFalse(Double.isInfinite(Math.exp(Constants.MAXLOG)));
    assertEqualsLocal(0.0, Math.exp(bump(Constants.MINLOG)), FP);
    assertTrue(Math.exp(Constants.MINLOG) > 0);
    assertFalse(Double.isInfinite(Math.exp(Constants.MINLOG)));
    assertFalse(Double.isNaN(Math.exp(Constants.MINLOG)));
    assertEquals(Math.PI / 2, Constants.HALF_PI, FP);
    assertEquals(Math.PI / 4, Constants.QUARTER_PI, FP);
    assertEquals(Math.PI / 180, Constants.DEGREES_TO_RADIANS, FP);
    assertEquals(Math.PI * 2, Constants.TAU, FP);
    assertEquals(Math.sqrt(3), Constants.SQRT3, FP);
    assertEquals(Math.sqrt(Math.PI), Constants.SQRT_PI, FP);
    assertEquals(Math.sqrt(2 * Math.PI), Constants.SQRT_TAU, FP);
    assertEquals(Math.log(Math.sqrt(2 * Math.PI)), Constants.LN_SQRT_TAU, FP);
    assertEquals(Math.log(Math.PI), Constants.LN_PI, FP);
    assertEquals(1 / Math.log(2), Constants.INV_LN2, FP);
    assertEquals(1 / Math.log(10), Constants.INV_LN10, FP);
    assertEquals(1 / Math.sqrt(Math.PI), Constants.INV_SQRT_PI, FP);
    assertEquals(0.577215664901532860606512090082402431042159, Constants.EULER, FP);
    assertEquals(0, Double.doubleToRawLongBits(Constants.MACHINE_PRECISION) & 0x1FFFFFFFFFFFFFL);
    assertTrue(Constants.MACHINE_PRECISION > 0);
    assertEquals(0.91596559417721901505460351493238411077414937428167213426649811962176301977625, Constants.CATALAN);
    assertEquals(0.75 * Math.PI, Constants.THREE_PI_DIV4);
    assertEquals(2 / Math.PI, Constants.TWO_DIV_PI);
    assertEquals(Math.sqrt(2.0 / Math.PI), Constants.SQRT2_DIV_PI);
    assertEquals(Math.sqrt(0.5), Constants.SQRT_HALF);
    assertEquals(3.3219280948873626, Constants.LG10, FP);
    assertEquals(1.4142135623730951, Constants.SQRT2, FP);
  }

}
