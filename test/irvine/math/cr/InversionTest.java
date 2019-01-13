package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class InversionTest extends TestCase {

  public void testInversion() {
    CRTest.assertEquals("inversion", CR.ONE.divide(CR.TWO), new Inversion().execute(CR.TWO));
  }
}
