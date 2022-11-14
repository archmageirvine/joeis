package irvine.math.cr;

import irvine.math.polynomial.Polynomial;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ZPolynomialFunctionTest extends TestCase {

  public void testAtan() {
    final UnaryCRFunction poly = new ZPolynomialFunction(Polynomial.create(1, 1, 2));
    assertEquals("11.0000000000", poly.execute(CR.TWO).toString());
  }
}
