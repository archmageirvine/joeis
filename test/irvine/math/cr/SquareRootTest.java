package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class SquareRootTest extends TestCase {

  public void testSqrt() {
    final SquareRoot s = new SquareRoot();
    final CR root2 = s.execute(CR.TWO);
    CRTest.assertEquals("sqrt", CR.TWO, root2.multiply(root2));
  }

}
