package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PAdicSqrtTest extends TestCase {

  public void testSqrt() {
    final CR root2 = CR.SQRT2;
    CRTest.assertEquals("asqrt", CR.TWO, root2.multiply(root2));
  }

  public void testSqrtNeg() {
    final CR root2 = CR.SQRT2.negate();
    CRTest.assertEquals("asqrt", CR.TWO, root2.multiply(root2));
  }
}
