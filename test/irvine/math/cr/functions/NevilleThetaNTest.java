package irvine.math.cr.functions;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class NevilleThetaNTest extends TestCase {

  public void test() {
    assertEquals("1.05266933546516136377", CrFunctions.NEVILLE_THETA_N.cr(new Q(25, 10), new Q(3, 10)).toString(20));
  }
}
