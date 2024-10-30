package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiDcTest extends TestCase {

  public void test() {
    assertEquals("-1.44433266501988831329", CrFunctions.JACOBI_DC.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("1.06880691731943827120", CrFunctions.JACOBI_DC.cr(CR.HALF, CR.HALF).toString(20));
  }
}
