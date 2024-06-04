package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class BesselITest extends TestCase {

  public void test() {
    assertEquals("1+1/4x^2+1/64x^4+1/2304x^6+1/147456x^8+1/14745600x^10", Series.BESSEL_I.s(0, 10).toString());
    assertEquals("1+1/8x^2+1/192x^4+1/9216x^6+1/737280x^8+1/88473600x^10", Series.BESSEL_I.s(1, 10).toString());
  }
}
