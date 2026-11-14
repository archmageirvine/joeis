package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ZetaTest extends TestCase {

  public void test() {
    assertEquals("-1.46035450880958681289", CrFunctions.ZETA.cr(CR.HALF).toString(20));
    assertEquals("-0.50000000000000000000", CrFunctions.ZETA.cr(0).toString(20));
    assertEquals("-0.08333333333333333333", CrFunctions.ZETA.cr(-1).toString(20));
    assertEquals("0.00000000000000000000", CrFunctions.ZETA.cr(-2).toString(20));
    assertEquals("0.00833333333333333333", CrFunctions.ZETA.cr(-3).toString(20));
    assertEquals(Zeta.zeta(2).toString(20), CrFunctions.ZETA.cr(2).toString(20));
    assertEquals(Zeta.zeta(2).toString(20), CrFunctions.ZETA.cr(CR.TWO).toString(20));
    assertEquals(Zeta.zeta(3).toString(20), CrFunctions.ZETA.cr(CR.THREE).toString(20));
    assertEquals(Zeta.zeta(4).toString(20), CrFunctions.ZETA.cr(CR.FOUR).toString(20));
  }
}
