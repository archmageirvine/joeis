package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class EllipticETest extends TestCase {

  public void test() {
    assertEquals("1.57079632679489661923", CrFunctions.ELLIPTIC_E.cr(Z.ZERO).toString(20)); // Pi / 2
    assertEquals("1.35064388104767550252", CrFunctions.ELLIPTIC_E.cr(CR.SQRT2.inverse()).toString(20));
  }
}
