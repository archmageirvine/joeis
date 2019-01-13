package irvine.math.cr;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class IntTest extends TestCase {

  public void testInt() {
    final Int c = new Int(Z.ONE);
    CRTest.assertEquals("int", CR.ONE, c);
  }
}
