package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ThomsonBeiTest extends TestCase {

  public void test() {
    assertEquals("0.06249321838219945865", CrFunctions.BEI.cr(CR.HALF).toString(20));
  }
}
