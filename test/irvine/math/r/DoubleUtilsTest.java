package irvine.math.r;

import static irvine.math.r.DoubleUtils.dmsToRadians;
import static irvine.math.r.DoubleUtils.sgn;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DoubleUtilsTest extends TestCase {

  public void testsgn() {
    assertEquals(0, sgn(0.0));
    assertEquals(0, sgn(-0.0));
    assertEquals(0, sgn(Double.NaN));
    assertEquals(1, sgn(Double.POSITIVE_INFINITY));
    assertEquals(-1, sgn(Double.NEGATIVE_INFINITY));
    assertEquals(1, sgn(1.0));
    assertEquals(1, sgn(1.0E-12));
    assertEquals(1, sgn(Double.MAX_VALUE));
    assertEquals(-1, sgn(-1.0));
    assertEquals(-1, sgn(-1.0E-12));
    assertEquals(-1, sgn(-Double.MAX_VALUE));
  }

  public void testdmsToRadians() {
    assertEquals(0.0, dmsToRadians(0.0, 0.0, 0.0), 1.0E-15);
    assertEquals(0.017453292519943295, dmsToRadians(1.0, 0.0, 0.0), 1.0E-10);
    assertEquals(0.000290888, dmsToRadians(0.0, 1.0, 0.0), 1.0E-8);
    assertEquals(4.84813681109536E-6, dmsToRadians(0.0, 0.0, 1.0), 1.0E-12);
  }

}
