package irvine.math.cr;

import java.math.BigInteger;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class CRTest extends TestCase {

  // Original BigInteger version of the scale function
  private static BigInteger scale(final BigInteger k, final int n) {
    if (n >= 0) {
      return k.shiftLeft(n);
    } else {
      return k.shiftLeft(n + 1).add(BigInteger.ONE).shiftRight(1);
    }
  }
  
  private void checkScale(final Z z, final int k) {
    final BigInteger b = z.bigIntegerValue();
    assertEquals(scale(b, k), CR.scale(z, k).bigIntegerValue());
  }
  
  public void testBugInScale() {
    checkScale(new Z("-1854468981267743447650"), -67);
  }
  
  public void testScale() {
    for (int k = 0; k > -20; --k) {
      final Z z = Z.valueOf(k);
      checkScale(z, 0);
      checkScale(z, 1);
      checkScale(z, 2);
      checkScale(z, -1);
      checkScale(z, -2);
    }
  }

  static void assertEquals(final String s, final CR x, final CR y) {
    assertTrue(s, x.compareTo(y, -50) == 0);
  }
  
  static void assertEqualsApproximate(final String s, final double x, final double y) {
    assertTrue(s, Math.abs(x - y) <= 0.000001);
  }
  
  public void testCR() {
    assertTrue("signum(1) failed", CR.ONE.signum() == 1);
    assertTrue("signum(-1) failed", CR.ONE.negate().signum() == -1);
    assertTrue("signum(0) failed", CR.ZERO.signum(-100) == 0);
    assertTrue("comparison failed", CR.ONE.compareTo(CR.TWO, -10) == -1);
    assertTrue("toString failed", "2.0000".compareTo(CR.TWO.toString(4)) == 0);
    assertEquals("shiftLeft failed", CR.ONE.shiftLeft(1), CR.TWO);
    assertEquals("shiftRight failed", CR.TWO.shiftRight(1), CR.ONE);
    assertEquals("add failed 1", CR.ONE.add(CR.ONE), CR.TWO);
    assertEquals("max failed", CR.ONE.max(CR.TWO), CR.TWO);
    assertEquals("min failed", CR.ONE.min(CR.TWO), CR.ONE);
    assertEquals("abs failed 1", CR.ONE.abs(), CR.ONE);
    assertEquals("abs failed 2", CR.ONE.negate().abs(), CR.ONE);
    assertEquals("2 + 2 failed", CR.valueOf(4), CR.TWO.add(CR.TWO));
    assertEquals("2 + 1 failed", CR.valueOf(3), CR.TWO.add(CR.ONE));
    assertEquals("negate failed", CR.ONE.negate().add(CR.TWO), CR.ONE);
    assertTrue("signum(-1) failed", CR.ONE.negate().signum() == -1);
    assertEquals("multiply failed", CR.TWO.multiply(CR.TWO), CR.FOUR);
    assertEquals("divide failed 1", CR.ONE.divide(CR.FOUR).shiftLeft(4), CR.FOUR);
    assertEquals("divide(neg) failed", CR.TWO.divide(CR.ONE.negate()), CR.TWO.negate());
    final CR thirteen = CR.valueOf(13);
    assertEquals("divide failed 2", CR.ONE.divide(thirteen).multiply(thirteen), CR.ONE);
    assertTrue("floatValue failed", thirteen.floatValue() == 13.0);
    assertEquals(13, thirteen.intValue());
    assertEquals(13, thirteen.longValue());
    assertTrue("doubleValue failed", thirteen.doubleValue() == 13.0);
  }
  
  public void testFunctions() {
    assertEquals("exp(0) failed", CR.ZERO.exp(), CR.ONE);
    assertTrue("exp(1) failed", "2.718281828459045".compareTo(CR.E.toString(20).substring(0, 17)) == 0);
    assertEquals("ln(e) failed", CR.E.log(), CR.ONE);
    final CR halfPi = CR.PI.divide(CR.TWO);
    assertTrue("-pi/2 failed", "-1.5707963267948966".compareTo(halfPi.negate().toString(20).substring(0, 19)) == 0);
    final CR half = CR.ONE.divide(CR.TWO);
    final Z million = Z.valueOf(1000000);
    final Z thousand = Z.valueOf(1000);
    final CR huge = CR.valueOf(million.multiply(million).multiply(thousand));
    final UnaryCRFunction asin = UnaryCRFunction.ASIN;
    final UnaryCRFunction acos = new Acos();
    final UnaryCRFunction atan = UnaryCRFunction.ATAN;
    final UnaryCRFunction tan = UnaryCRFunction.TAN;
    assertEquals("sin(pi/2) failed", halfPi.sin(), CR.ONE);
    assertEquals("asin(1) failed", asin.execute(CR.ONE), halfPi);
    final CR asinr = asin.execute(CR.ONE.negate());
    assertEquals("asin(-1) failed", asinr, halfPi.negate());
    assertEquals("asin(0) failed", asin.execute(CR.ZERO), CR.ZERO);
    assertEquals("asin(sin(0.5)) failed", asin.execute(half.sin()), half);
    final UnaryCRFunction cosine = new Sin().monotoneDerivative(CR.ZERO, CR.PI);
    assertEquals("monotoneDerivative failed", cosine.execute(CR.ONE), CR.ONE.cos());
    assertEquals("monotoneDerivative failed 2", cosine.execute(CR.THREE), CR.THREE.cos());
    assertEquals("asin(sin(1) failed", asin.execute(CR.ONE.sin()), CR.ONE);
    assertEquals("acos(cos(1) failed", acos.execute(CR.ONE.cos()), CR.ONE);
    assertEquals("atan(tan(1) failed", atan.execute(tan.execute(CR.ONE)), CR.ONE);
    assertEquals("atan(tan(-1) failed", atan.execute(tan.execute(CR.ONE.negate())), CR.ONE.negate());
    assertEquals("tan(atan(10^15)) failed", tan.execute(atan.execute(huge)), huge);
    final CR thirteen = CR.valueOf(13);
    final CR sqrt13 = thirteen.sqrt();
    assertEquals("sqrt(13)*sqrt(13) failed", sqrt13.multiply(sqrt13), thirteen);
    final CR tmp = CR.PI.add(CR.valueOf(-123).exp());
    final CR tmp2 = tmp.subtract(CR.PI);
    assertEquals(-123, tmp2.log().intValue());
    assertEquals(-123, tmp2.log().longValue());
    assertTrue("floatValue(...) failed", tmp2.log().floatValue() == -123.0);
    assertTrue("doubleValue(...) failed", tmp2.log().doubleValue() == -123.0);
    for (double n = -10.0; n < 10.0; n += 2.0) {
      assertEqualsApproximate("sin failed at " + n, Math.sin(n), CR.valueOf(n).sin().doubleValue());
      assertEqualsApproximate("cos failed at " + n, Math.cos(n), CR.valueOf(n).cos().doubleValue());
      assertEqualsApproximate("exp failed at " + n, Math.exp(n), CR.valueOf(n).exp().doubleValue());
      if (n > 0.0) {
        assertEqualsApproximate("exp failed at " + n, Math.exp(n), CR.valueOf(n).exp().doubleValue());
      }
    }
    assertEqualsApproximate("cos failed at " + 12345678, Math.cos(12345678.0), CR.valueOf(12345678).cos().doubleValue());
  }

  public void testFloor() {
    assertEquals(Z.ZERO, CR.ZERO.floor(32));
    assertEquals(Z.ONE, CR.ONE.floor(32));
    assertEquals(Z.NEG_ONE, CR.ONE.negate().floor(32));
    assertEquals(Z.ZERO, CR.HALF.floor(32));
    assertEquals(Z.THREE, CR.PI.floor(32));
    assertEquals(Z.valueOf(-4), CR.PI.negate().floor(32));
  }

  public void testCeil() {
    assertEquals(Z.ZERO, CR.ZERO.ceil(32));
    assertEquals(Z.ONE, CR.ONE.ceil(32));
    assertEquals(Z.NEG_ONE, CR.ONE.negate().ceil(32));
    assertEquals(Z.ONE, CR.HALF.ceil(32));
    assertEquals(Z.FOUR, CR.PI.ceil(32));
    assertEquals(Z.valueOf(-3), CR.PI.negate().ceil(32));
  }

  public void testSignum() {
    assertEquals(-1, CR.valueOf(4).sin().signum(-32));
  }

  public void testExpNear0() {
    assertEquals(Z.ONE, CR.valueOf(Double.MIN_VALUE).exp().floor(32));
    assertEquals(Z.ONE, CR.valueOf(Double.MIN_VALUE).negate().exp().floor(32));
  }

  public void testLnGamma() {
    assertEqualsApproximate("lnGamma(1/2)", CR.PI.sqrt().log().doubleValue(), CR.HALF.lnGamma().doubleValue());
    for (long k = 2, f = 1; k <= 10; f *= k, ++k) {
      final double a = Math.log(f);
      final double b = CR.valueOf(k).lnGamma().doubleValue();
      assertEqualsApproximate(k + "! " + a + " " + b, a, b);
    }
  }

  public void testPsi() {
    final UnaryCRFunction psi = new LnGamma().monotoneDerivative(CR.HALF, CR.FOUR);
    assertEquals("0.0364899740", psi.execute(CR.valueOf(new Q(3, 2))).toString());
    assertEquals("-0.0000000009", psi.execute(CR.valueOf(1.461632144)).toString());
  }
}
