package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class SineIntegralTest extends TestCase {

  public void test() {
    assertEquals("0.09994446110827695016", CrFunctions.SI.cr(CR.valueOf(new Q(1, 10))).toString(20));
    assertEquals("0.77209578548199656025", CrFunctions.SI.cr(CR.valueOf(new Q(8, 10))).toString(20));
    assertEquals("1.50497124152637337053", CrFunctions.SI.cr(CR.valueOf(12)).toString(20));
    assertEquals("1.57023312196877121815", CrFunctions.SI.cr(CR.valueOf(1000)).toString(20));
    assertEquals("-0.77209578548199656025", CrFunctions.SI.cr(CR.valueOf(new Q(-8, 10))).toString(20));
  }
}
