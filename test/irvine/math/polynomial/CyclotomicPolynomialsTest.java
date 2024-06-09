package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CyclotomicPolynomialsTest extends TestCase {

  public void testPolys() {
    final CyclotomicPolynomials cp = new CyclotomicPolynomials();
    assertEquals("-1+x", cp.get(1).toString());
    assertEquals("1+x", cp.get(2).toString());
    assertEquals("1+x+x^2", cp.get(3).toString());
    assertEquals("1+x^2", cp.get(4).toString());
    assertEquals("1-x^2+x^4", cp.get(12).toString());
  }

  public void testPolys2() {
    assertEquals("1-x^2+x^4", CyclotomicPolynomials.cyclotomic(12).toString());
  }
}
