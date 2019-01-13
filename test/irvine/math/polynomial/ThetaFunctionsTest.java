package irvine.math.polynomial;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ThetaFunctionsTest extends TestCase {

  public void testPsi() {
    assertEquals("q^{1/36}+q^{25/36}+q^{49/36}+q^{121/36}+q^{169/36}", ThetaFunctions.psi(6, 5).toString());
    assertEquals("q^{1/9}+q^{4/9}", ThetaFunctions.psi(Q.THREE, Q.HALF).toString());
  }

  public void testTheta2() {
    assertEquals("2q^{1/4}", ThetaFunctions.theta2(Q.TWO).toString());
    assertEquals("2q^{1/4}+2q^{9/4}+2q^{25/4}+2q^{49/4}", ThetaFunctions.theta2(20).toString());
  }

  public void testTheta3() {
    assertEquals("1+2q+2q^4+2q^9+2q^{16}+2q^{25}+2q^{36}+2q^{49}+2q^{64}+2q^{81}", ThetaFunctions.theta3(81).toString());
  }

  public void testDelta8() {
    assertEquals("q-8q^2+28q^3-64q^4+126q^5-224q^6+344q^7-512q^8+757q^9-1008q^{10}", ThetaFunctions.delta8(10).toString());
  }

  public void testDelta24() {
    assertEquals("x^2-24x^3+252x^4-1472x^5+4830x^6-6048x^7-16744x^8+84480x^9-113643x^10", ThetaFunctions.delta24z(10).toString());
  }
}
