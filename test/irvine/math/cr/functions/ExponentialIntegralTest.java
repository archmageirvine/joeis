package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ExponentialIntegralTest extends TestCase {

  public void test() {
    assertEquals("1.895117816355936755466520934332", CrFunctions.EI.cr(CR.ONE).toString(30));
    assertEquals("40.185275355803177455091421793796", CrFunctions.EI.cr(CR.FIVE).toString(30));
    assertEquals("-0.001148295591275325797330561970", CrFunctions.EI.cr(CR.FIVE.negate()).toString(30));
  }
}
