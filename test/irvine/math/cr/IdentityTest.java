package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class IdentityTest extends TestCase {

  public void testIdentity() {
    CRTest.assertEquals("identity", CR.ZERO, UnaryCRFunction.IDENTITY.execute(CR.ZERO));
    CRTest.assertEquals("identity", CR.ONE, UnaryCRFunction.IDENTITY.execute(CR.ONE));
  }
}
