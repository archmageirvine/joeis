package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class CosineIntegralTest extends TestCase {

  public void test() {
    assertEquals("-1.72786838665729663900", CrFunctions.CI.cr(CR.valueOf(new Q(1, 10))).toString(20));
    assertEquals("0.19827861595246717702", CrFunctions.CI.cr(CR.valueOf(new Q(8, 10))).toString(20));
    assertEquals("-0.04545643300445537263", CrFunctions.CI.cr(CR.TEN).toString(20));
  }
}
