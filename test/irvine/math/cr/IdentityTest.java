package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class IdentityTest extends TestCase {

  public void testIdentity() {
    CRTest.assertEquals("identity", CR.ZERO, ((UnaryCrFunction) new Identity()).execute(CR.ZERO));
    CRTest.assertEquals("identity", CR.ONE, ((UnaryCrFunction) new Identity()).execute(CR.ONE));
  }
}
