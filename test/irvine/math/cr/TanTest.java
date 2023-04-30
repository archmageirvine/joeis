package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class TanTest extends TestCase {

  public void testAtan() {
    final UnaryCRFunction atan = new Atan();
    final UnaryCRFunction tan = new Tan();
    CRTest.assertEquals("atan", CR.ONE, atan.execute(tan.execute(CR.ONE)));
  }
}
