package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class HyperbolicCosineIntegralTest extends TestCase {

  public void test() {
    assertEquals("-1.72286838619433367052", CrFunctions.CHI.cr(CR.valueOf(new Q(1, 10))).toString(20));
    assertEquals("0.51839998483339145173", CrFunctions.CHI.cr(CR.valueOf(new Q(8, 10))).toString(20));
    assertEquals("1246.11448604245441472656", CrFunctions.CHI.cr(CR.TEN).toString(20));
  }
}
