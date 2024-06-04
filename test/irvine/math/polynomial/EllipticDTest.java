package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EllipticDTest extends TestCase {

  public void testE() {
    assertEquals("1/4+3/32x^2+15/256x^4+175/4096x^6+2205/65536x^8", Series.ELLIPTIC_D.s(10).toString());
  }
}
