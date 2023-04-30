package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class UnaryCRFunctionTest extends TestCase {

  public void testUnaryCRFunction() {
    final UnaryCRFunction c = new Abs().compose(new Cos());
    CRTest.assertEquals("composition", CR.ONE, c.execute(CR.ZERO));
    CRTest.assertEquals("composition", CR.ONE, c.execute(CR.PI));
  }
}
