package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EulerPolynomialsTest extends TestCase {

  public void test() {
    assertEquals("1", EulerPolynomials.eulerPolynomial(0).toString());
    assertEquals("-1/2+x", EulerPolynomials.eulerPolynomial(1).toString());
    assertEquals("-x+x^2", EulerPolynomials.eulerPolynomial(2).toString());
    assertEquals("1/4-3/2x^2+x^3", EulerPolynomials.eulerPolynomial(3).toString());
  }
}
