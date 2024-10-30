package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiSnTest extends TestCase {

  public void test() {
    assertEquals("0.77979738517088311533", CrFunctions.JACOBI_SN.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("0.47075047365565728333", CrFunctions.JACOBI_SN.cr(CR.HALF, CR.HALF).toString(20));
  }
}
