package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class TanTest extends TestCase {

  public void testAtan() {
    final UnaryCRFunction atan = UnaryCRFunction.ATAN;
    final UnaryCRFunction tan = UnaryCRFunction.TAN;
    CRTest.assertEquals("atan", CR.ONE, atan.execute(tan.execute(CR.ONE)));
  }
}
