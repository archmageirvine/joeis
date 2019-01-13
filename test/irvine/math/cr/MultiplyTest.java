package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class MultiplyTest extends TestCase {

  public void testMultiply() {
    CRTest.assertEquals("multiply", CR.ZERO, CR.ZERO.multiply(CR.ZERO));
    CRTest.assertEquals("multiply", CR.ZERO, CR.ONE.multiply(CR.ZERO));
    CRTest.assertEquals("multiply", CR.ONE, CR.ONE.multiply(CR.ONE));
    CRTest.assertEquals("multiply", CR.FOUR, CR.TWO.multiply(CR.TWO));
    CRTest.assertEquals("multiply", CR.ONE.negate(), CR.ONE.negate().multiply(CR.ONE));
  }
}
