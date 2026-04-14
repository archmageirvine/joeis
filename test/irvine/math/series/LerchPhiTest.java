package irvine.math.series;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LerchPhiTest extends TestCase {

  public void testLerchPhi1() {
    assertEquals("(243/32)+(3125/32)*x+(16807/32)*x^2+(59049/32)*x^3+(161051/32)*x^4+(371293/32)*x^5", SeriesRing.SQ.toString(new LerchPhi(SeriesRing.SQ.x(), -5, new Q(3, 2)), 5));
  }
}
