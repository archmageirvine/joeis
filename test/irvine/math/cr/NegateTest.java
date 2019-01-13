package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class NegateTest extends TestCase {

  public void testNegate() {
    CRTest.assertEquals("negate", CR.ZERO, CR.ZERO.negate());
    CRTest.assertEquals("negate", CR.valueOf(-1), CR.ONE.negate());
    CRTest.assertEquals("negate", CR.ONE, CR.ONE.negate().negate());
  }
}
