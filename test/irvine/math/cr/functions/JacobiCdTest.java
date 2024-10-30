package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiCdTest extends TestCase {

  public void test() {
    assertEquals("-0.69236127120771730391", CrFunctions.JACOBI_CD.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("0.93562268712481237275", CrFunctions.JACOBI_CD.cr(CR.HALF, CR.HALF).toString(20));
  }
}
