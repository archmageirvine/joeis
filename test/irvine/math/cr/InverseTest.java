package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class InverseTest extends TestCase {

  public void testInverse() {
    final Inverse c = new Inverse(CR.TWO);
    CRTest.assertEquals("inverse", CR.ONE.divide(CR.TWO), c);
  }
}
