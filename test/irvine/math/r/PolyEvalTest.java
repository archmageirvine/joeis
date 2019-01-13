package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PolyEvalTest extends TestCase {

  private static final double FP = 1.0E-10;

  public void testJVMDoubleHandling() {
    assertEqualsLocal(Double.NaN, Double.NEGATIVE_INFINITY + Double.POSITIVE_INFINITY, FP);
    assertEqualsLocal(Double.NaN, Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY, FP);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY, FP);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY * Double.NEGATIVE_INFINITY, FP);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY * Double.POSITIVE_INFINITY, FP);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY * Double.NEGATIVE_INFINITY, FP);
  }

  public void testPolyEval() {
    try {
      PolyEval.polyeval(0, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      PolyEval.polyeval(0, new double[0]);
      fail();
    } catch (final ArrayIndexOutOfBoundsException e) {
      // ok
    }
    try {
      PolyEval.polyeval(0, new double[1]);
      fail();
    } catch (final ArrayIndexOutOfBoundsException e) {
      // ok
    }
    final double[] p = {3, 5, 1};
    assertEquals(1, PolyEval.polyeval(0, p), FP);
    assertEquals(9, PolyEval.polyeval(1, p), FP);
    assertEquals(-1, PolyEval.polyeval(-1, p), FP);
    assertEquals(23, PolyEval.polyeval(2, p), FP);
    assertEquals(4.25, PolyEval.polyeval(0.5, p), FP);
    assertEqualsLocal(Double.POSITIVE_INFINITY, PolyEval.polyeval(Double.POSITIVE_INFINITY, p), FP);
    assertEqualsLocal(Double.NaN, PolyEval.polyeval(Double.NaN, p), FP);
    assertEquals(12, PolyEval.polyeval(2, new double[] {5, 2}), FP);
  }

  public void testP1Eval() {
    try {
      PolyEval.p1eval(0, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      PolyEval.p1eval(0, new double[0]);
      fail();
    } catch (final ArrayIndexOutOfBoundsException e) {
      // ok
    }
    final double[] p = {5, 3};
    assertEquals(3, PolyEval.p1eval(0, p), FP);
    assertEquals(9, PolyEval.p1eval(1, p), FP);
    assertEquals(-1, PolyEval.p1eval(-1, p), FP);
    assertEquals(17, PolyEval.p1eval(2, p), FP);
    assertEquals(5.75, PolyEval.p1eval(0.5, p), FP);
    assertEqualsLocal(Double.POSITIVE_INFINITY, PolyEval.p1eval(Double.POSITIVE_INFINITY, p), FP);
    assertEqualsLocal(Double.NaN, PolyEval.p1eval(Double.NaN, p), FP);
    assertEquals(7, PolyEval.p1eval(2, new double[] {5}), FP);
  }

  public void testChebyshev() {
    try {
      PolyEval.chebyshev(0, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      PolyEval.polyeval(0, new double[0]);
      fail();
    } catch (final ArrayIndexOutOfBoundsException e) {
      // ok
    }
    final double[] p = {5, 3};
    assertEquals(1.5, PolyEval.chebyshev(0, p), FP);
    assertEquals(4, PolyEval.chebyshev(1, p), FP);
    assertEquals(-1, PolyEval.chebyshev(-1, p), FP);
    assertEquals(6.5, PolyEval.chebyshev(2, p), FP);
    assertEquals(2.75, PolyEval.chebyshev(0.5, p), FP);
    assertEqualsLocal(Double.POSITIVE_INFINITY, PolyEval.chebyshev(Double.POSITIVE_INFINITY, p), FP);
    assertEqualsLocal(Double.NaN, PolyEval.chebyshev(Double.NaN, p), FP);
    assertEquals(2.5, PolyEval.chebyshev(2, new double[] {5}), FP);
    assertEquals(-1.5, PolyEval.chebyshev(2, new double[] {5, -3, -7}), FP);
  }

}
