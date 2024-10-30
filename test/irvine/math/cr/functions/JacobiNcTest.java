package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiNcTest extends TestCase {

  public void test() {
    assertEquals("-1.59736249005462255832", CrFunctions.JACOBI_NC.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("1.13344450813428052600", CrFunctions.JACOBI_NC.cr(CR.HALF, CR.HALF).toString(20));
  }
}
