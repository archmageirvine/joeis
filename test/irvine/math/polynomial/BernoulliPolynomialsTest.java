package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class BernoulliPolynomialsTest extends TestCase {

  public void testFirstKind() {
    assertEquals("1", BernoulliPolynomials.firstKind(0).toString());
    assertEquals("-1/2+x", BernoulliPolynomials.firstKind(1).toString());
    assertEquals("1/6-x+x^2", BernoulliPolynomials.firstKind(2).toString());
    assertEquals("1/2x-3/2x^2+x^3", BernoulliPolynomials.firstKind(3).toString());
  }

  public void testSecondKind() {
    assertEquals("1", BernoulliPolynomials.secondKind(0).toString());
    assertEquals("1/2+x", BernoulliPolynomials.secondKind(1).toString());
    assertEquals("-1/12+1/2x^2", BernoulliPolynomials.secondKind(2).toString());
    assertEquals("1/24-1/4x^2+1/6x^3", BernoulliPolynomials.secondKind(3).toString());
  }
}
