package irvine.math;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ContinuedFractionUtilsTest extends TestCase {

  public void test() {
    assertEquals("[0, 2]", ContinuedFractionUtils.continuedFraction(Q.HALF).toString());
    assertEquals("[4, 5, 1, 4]", ContinuedFractionUtils.continuedFraction(new Q(121, 29)).toString());
  }
}
