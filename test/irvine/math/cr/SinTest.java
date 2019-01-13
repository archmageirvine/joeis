package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class SinTest extends TestCase {

  public void testSin() {
    final UnaryCRFunction asin = UnaryCRFunction.ASIN;
    CRTest.assertEquals("asin", CR.ONE, asin.execute(CR.ONE.sin()));
  }
}
