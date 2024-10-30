package irvine.math.cr.functions;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class NevilleThetaDTest extends TestCase {

  public void test() {
    assertEquals("0.95182196661267561995", CrFunctions.NEVILLE_THETA_D.cr(new Q(25, 10), new Q(3, 10)).toString(20));
  }
}
