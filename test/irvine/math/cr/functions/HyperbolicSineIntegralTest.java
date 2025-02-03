package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class HyperbolicSineIntegralTest extends TestCase {

  public void test() {
    assertEquals("0.10005557222505699556", CrFunctions.SHI.cr(CR.valueOf(new Q(1, 10))).toString(20));
    assertEquals("0.82899656337893448639", CrFunctions.SHI.cr(CR.valueOf(new Q(8, 10))).toString(20));
    assertEquals("1246.11449019942334441188", CrFunctions.SHI.cr(CR.TEN).toString(20));
    assertEquals("-0.82899656337893448639", CrFunctions.SHI.cr(CR.valueOf(new Q(-8, 10))).toString(20));
  }
}
