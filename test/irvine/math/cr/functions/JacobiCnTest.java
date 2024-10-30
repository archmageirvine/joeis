package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiCnTest extends TestCase {

  public void test() {
    assertEquals("-0.62603197848085473182", CrFunctions.JACOBI_CN.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("0.88226639489044028649", CrFunctions.JACOBI_CN.cr(CR.HALF, CR.HALF).toString(20));
  }
}
