package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class EllipticKTest extends TestCase {

  public void testEllipticK() {
    assertEquals("1.57079632679489661923", CrFunctions.ELLIPTIC_K.cr(Z.ZERO).toString(20)); // Pi / 2
    assertEquals("1.85407467730137191843", CrFunctions.ELLIPTIC_K.cr(CR.SQRT2.inverse()).toString(20));
    assertEquals("1.68575035481259604287", CrFunctions.ELLIPTIC_K.cr(CR.TWO.inverse()).toString(20));
  }
}
