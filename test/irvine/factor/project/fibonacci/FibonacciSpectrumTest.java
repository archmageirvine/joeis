package irvine.factor.project.fibonacci;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FibonacciSpectrumTest extends StandardIoTestCase {

  public void testSmall() throws Exception {
    FibonacciSpectrum.main("F449");
    final String s = getOut();
    //mOldOut.println(s);
    TestUtils.containsAll(s,
      "F(449) has approx. length 94 digits",
      "Require approx. 29 digits to complete primality proof",
      "F(449)-1 = F(112)L(112)L(225)",
      "F(449)+1 = F(225)L(224)",
      "After removing known factors, -165 digits needed");
  }
}
