package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EllipticETest extends TestCase {

  public void testE() {
    assertEquals("1-1/4x^2-3/64x^4-5/256x^6-175/16384x^8-441/65536x^10", Series.ELLIPTIC_E.s(10).toString());
  }
}
