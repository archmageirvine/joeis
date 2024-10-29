package irvine.math.cr.functions;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class NevilleThetaSTest extends TestCase {

  public void test() {
    assertEquals("0.82086879524530400553", CrFunctions.NEVILLE_THETA_S.cr(new Q(25, 10), new Q(3, 10)).toString(20));
  }
}
