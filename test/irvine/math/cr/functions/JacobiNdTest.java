package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiNdTest extends TestCase {

  public void test() {
    assertEquals("1.10595192419374316371", CrFunctions.JACOBI_ND.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("1.06047639640745680099", CrFunctions.JACOBI_ND.cr(CR.HALF, CR.HALF).toString(20));
  }
}
