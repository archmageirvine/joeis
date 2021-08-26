package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class BesselTest extends TestCase {

  public void testBesselK0() {
    assertEquals("0.42102443824070833334", Bessel.besselK0(CR.ONE).toString(20));
    assertEquals("0.02950868363067174214", Bessel.besselK0(CR.PI).toString(20));
  }

  public void testBesselK1() {
    assertEquals("0.60190723019723457474", Bessel.besselK(1, CR.ONE).toString(20));
  }
}
