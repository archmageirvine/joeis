package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class LogTest extends TestCase {

  public void testLog() {
    final UnaryCRFunction log = UnaryCRFunction.LOG;
    CRTest.assertEquals("exp", CR.ONE, log.execute(CR.E));
    CRTest.assertEquals("exp", CR.TWO, log.execute(CR.TWO.exp()));
  }
}
