package irvine.math.cr;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PrescaledCosTest extends TestCase {

  public void testCR() {
    final CR zero = CR.valueOf(0);
    final CR one = CR.valueOf(1);
    final CR two = CR.valueOf(2);
    final CR three = two.add(one);
    final CR halfPi = CR.PI.divide(two);
    final CR half = one.divide(two);
    final Z million = Z.valueOf(1000000);
    final Z thousand = Z.valueOf(1000);
    final CR huge = CR.valueOf(million.multiply(million).multiply(thousand));
    final UnaryCrFunction asin = new Sin().inverseMonotone(CR.HALF_PI.negate(), CR.HALF_PI);
    final UnaryCrFunction acos = new Acos();
    final UnaryCrFunction atan = new Atan();
    final UnaryCrFunction tan = new Tan();
    CRTest.assertEquals("sin(pi/2) failed", halfPi.sin(), one);
    CRTest.assertEquals("asin(1) failed", asin.execute(one), halfPi);
    final CR asinr = asin.execute(one.negate());
    CRTest.assertEquals("asin(-1) failed", asinr, halfPi.negate());
    CRTest.assertEquals("asin(0) failed", asin.execute(zero), zero);
    CRTest.assertEquals("asin(sin(0.5)) failed", asin.execute(half.sin()), half);
    final UnaryCrFunction cosine = new Sin().monotoneDerivative(zero, CR.PI);
    CRTest.assertEquals("monotoneDerivative failed", cosine.execute(one), one.cos());
    CRTest.assertEquals("monotoneDerivative failed 2", cosine.execute(three), three.cos());
    CRTest.assertEquals("asin(sin(1) failed", asin.execute(one.sin()), one);
    CRTest.assertEquals("acos(cos(1) failed", acos.execute(one.cos()), one);
    CRTest.assertEquals("atan(tan(1) failed", atan.execute(tan.execute(one)), one);
    CRTest.assertEquals("atan(tan(-1) failed", atan.execute(tan.execute(one.negate())), one.negate());
    CRTest.assertEquals("tan(atan(10^15)) failed", tan.execute(atan.execute(huge)), huge);
    for (double n = -10.0; n < 10.0; n += 2.0) {
      CRTest.assertEqualsApproximate("sin failed at " + n, Math.sin(n), CR.valueOf(n).sin().doubleValue());
      CRTest.assertEqualsApproximate("cos failed at " + n, Math.cos(n), CR.valueOf(n).cos().doubleValue());
    }
    CRTest.assertEqualsApproximate("cos failed at " + 12345678, Math.cos(12345678.0), CR.valueOf(12345678).cos().doubleValue());
  }

}
