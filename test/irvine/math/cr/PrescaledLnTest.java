package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PrescaledLnTest extends TestCase {

  public void testExp() {
    final UnaryCrFunction log = new Log();
    CRTest.assertEquals("exp", CR.ONE, log.execute(CR.E));
    CRTest.assertEquals("exp", CR.TWO, log.execute(CR.TWO.exp()));
  }
}
