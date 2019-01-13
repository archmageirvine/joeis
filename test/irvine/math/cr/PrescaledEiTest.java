package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PrescaledEiTest extends TestCase {

  public void testEi() {
    assertEquals("1.895117816355936755466520934332", CR.ONE.ei().toString(30));
    assertEquals("40.185275355803177455091421793796", CR.FIVE.ei().toString(30));
    assertEquals("-0.001148295591275325797330561970", CR.FIVE.negate().ei().toString(30));
  }
}
