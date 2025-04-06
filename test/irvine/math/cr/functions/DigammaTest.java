package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class DigammaTest extends TestCase {

  public void testZ() {
    assertEquals("-0.57721566490153286061", CrFunctions.DIGAMMA.cr(1).toString(20));
    assertEquals("0.42278433509846713939", CrFunctions.DIGAMMA.cr(2).toString(20));
    assertEquals("0.92278433509846713939", CrFunctions.DIGAMMA.cr(3).toString(20));
    assertEquals("2.25175258906672110765", CrFunctions.DIGAMMA.cr(Z.TEN).toString(20));
    try {
      CrFunctions.DIGAMMA.cr(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // expected
    }
  }

  public void testCr() {
    assertEquals("0.03648997397857652056", CrFunctions.DIGAMMA.cr(CR.THREE.divide(2)).toString(20));
    assertEquals("-0.57721566490153286061", CrFunctions.DIGAMMA.cr(CR.ONE).toString(20));
    assertEquals("2.25175258906672110765", CrFunctions.DIGAMMA.cr(CR.TEN).toString(20));
    assertEquals("0.03648997397857652056", CrFunctions.DIGAMMA.cr(CR.HALF.negate()).toString(20));
  }
}
