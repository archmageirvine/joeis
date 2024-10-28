package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AtanTest extends TestCase {

  public void testAtan() {
    final UnaryCrFunction atan = new Atan();
    final UnaryCrFunction tan = new Tan();
    CRTest.assertEquals("atan", CR.ONE, atan.execute(tan.execute(CR.ONE)));
  }
}
