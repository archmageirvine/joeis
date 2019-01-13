package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class InverseMonotoneTest extends TestCase {

  public void testAsin() {
    final UnaryCRFunction asin = UnaryCRFunction.ASIN;
    CRTest.assertEquals("asin", CR.ONE, asin.execute(CR.ONE.sin()));
  }
}
