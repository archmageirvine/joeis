package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class BesselK0Test extends TestCase {

  public void testBesselK0() {
    assertEquals("0.42102443824070833334", CrFunctions.BESSEL_K0.cr(CR.ONE).toString(20));
    assertEquals("0.02950868363067174214", CrFunctions.BESSEL_K0.cr(CR.PI).toString(20));
  }
}
