package irvine.math.c;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ComplexGammaTest extends TestCase {

  public void test() {
    TestUtils.assertEquals(C.ONE, ComplexGamma.gamma(C.ONE), 1E-14);
    TestUtils.assertEquals(C.ONE, ComplexGamma.gamma(C.TWO), 1E-14);
    TestUtils.assertEquals(C.TWO, ComplexGamma.gamma(new C(3)), 1E-14);
    TestUtils.assertEquals(new C(6), ComplexGamma.gamma(new C(4)), 1E-14);
    TestUtils.assertEquals(new C(-0.154949828301811, -0.498015668118356), ComplexGamma.gamma(C.I), 1E-14);
    TestUtils.assertEquals(new C(0.0199542931628494, 0.00303737753443647), ComplexGamma.gamma(new C(0.4, 3)), 1E-14);
    TestUtils.assertEquals(new C(-2.50170855881466, 0.561488650971851), ComplexGamma.gamma(new C(-0.4, -0.3)), 1E-14);
  }
}
