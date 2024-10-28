package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class UnaryCrFunctionTest extends TestCase {

  public void testUnaryCRFunction() {
    final UnaryCrFunction c = new Abs().compose(new Cos());
    CRTest.assertEquals("composition", CR.ONE, c.execute(CR.ZERO));
    CRTest.assertEquals("composition", CR.ONE, c.execute(CR.PI));
  }
}
