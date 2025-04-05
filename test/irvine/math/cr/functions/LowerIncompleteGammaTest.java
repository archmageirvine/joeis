package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class LowerIncompleteGammaTest extends TestCase {

  public void test() {
    final CR ONE_TENTH = CR.valueOf(new Q(1, 10));
    assertEquals("7.87292003586684462577", CrFunctions.LOWER_INCOMPLETE_GAMMA.cr(ONE_TENTH, ONE_TENTH).toString(20));
  }
}
