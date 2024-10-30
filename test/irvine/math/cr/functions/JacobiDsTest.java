package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiDsTest extends TestCase {

  public void test() {
    assertEquals("1.15952996645248072153", CrFunctions.JACOBI_DS.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("2.00312581409561676183", CrFunctions.JACOBI_DS.cr(CR.HALF, CR.HALF).toString(20));
  }
}
