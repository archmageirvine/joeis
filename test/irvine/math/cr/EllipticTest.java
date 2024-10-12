package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class EllipticTest extends TestCase {

  public void testEllipticK() {
    assertEquals("1.57079632679489661923", Elliptic.ellipticK(CR.ZERO).toString(20)); // Pi / 2
    assertEquals("1.85407467730137191843", Elliptic.ellipticK(CR.HALF).toString(20));
    assertEquals("1.68575035481259604287", Elliptic.ellipticK(CR.FOUR.inverse()).toString(20));
  }

  public void testEllipticE() {
    assertEquals("1.57079632679489661923", Elliptic.ellipticE(CR.ZERO).toString(20)); // Pi / 2
    assertEquals("1.35064388104767550252", Elliptic.ellipticE(CR.SQRT2.inverse()).toString(20));
  }
}
