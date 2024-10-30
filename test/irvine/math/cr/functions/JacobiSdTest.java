package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiSdTest extends TestCase {

  public void test() {
    assertEquals("0.86241841861098766264", CrFunctions.JACOBI_SD.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("0.49921976590945486290", CrFunctions.JACOBI_SD.cr(CR.HALF, CR.HALF).toString(20));
  }
}
