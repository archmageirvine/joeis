package irvine.math.cr;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class CrZTest extends TestCase {

  public void testInt() {
    final CrZ c = new CrZ(Z.ONE);
    CRTest.assertEquals("int", CR.ONE, c);
  }
}
