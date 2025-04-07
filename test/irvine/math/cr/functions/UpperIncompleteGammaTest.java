package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class UpperIncompleteGammaTest extends TestCase {

  public void test() {
    final CR oneTenth = CR.valueOf(new Q(1, 10));
    assertEquals("1.64058766280188721051", CrFunctions.UPPER_INCOMPLETE_GAMMA.cr(oneTenth, oneTenth).toString(20));
  }
}
