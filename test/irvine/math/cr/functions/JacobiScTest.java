package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiScTest extends TestCase {

  public void test() {
    assertEquals("-1.24561909291464545676", CrFunctions.JACOBI_SC.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("0.53356953906661605214", CrFunctions.JACOBI_SC.cr(CR.HALF, CR.HALF).toString(20));
  }
}
