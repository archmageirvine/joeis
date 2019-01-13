package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class NegationTest extends TestCase {

  public void testNegate() {
    final Negation neg = new Negation();
    CRTest.assertEquals("negate", CR.ZERO, neg.execute(CR.ZERO));
    CRTest.assertEquals("negate", CR.valueOf(-1), neg.execute(CR.ONE));
  }
}
