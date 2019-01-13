package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ExpTest extends TestCase {

  public void testExp() {
    final UnaryCRFunction log = UnaryCRFunction.LOG;
    CRTest.assertEquals("exp", CR.ONE, log.execute(CR.E));
    CRTest.assertEquals("exp", CR.TWO, log.execute(CR.TWO.exp()));
  }
}
