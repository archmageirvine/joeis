package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiDnTest extends TestCase {

  public void test() {
    assertEquals("0.90419843586692628640", CrFunctions.JACOBI_DN.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("0.94297242577738568730", CrFunctions.JACOBI_DN.cr(CR.HALF, CR.HALF).toString(20));
  }
}
