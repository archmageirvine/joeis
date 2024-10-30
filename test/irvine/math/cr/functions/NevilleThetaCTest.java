package irvine.math.cr.functions;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class NevilleThetaCTest extends TestCase {

  public void test() {
    assertEquals("-0.65900466676738154965", CrFunctions.NEVILLE_THETA_C.cr(new Q(25, 10), new Q(3, 10)).toString(20));
  }
}
