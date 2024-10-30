package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiCsTest extends TestCase {

  public void test() {
    assertEquals("-0.80281364157648135190", CrFunctions.JACOBI_CS.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("1.87416995683321831541", CrFunctions.JACOBI_CS.cr(CR.HALF, CR.HALF).toString(20));
  }
}
