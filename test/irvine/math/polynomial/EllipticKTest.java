package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EllipticKTest extends TestCase {

  public void testK() {
    assertEquals("1+1/4x^2+9/64x^4+25/256x^6+1225/16384x^8+3969/65536x^10", Series.ELLIPTIC_K.s(10).toString());
  }
}
