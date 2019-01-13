package irvine.math.polynomial;

import irvine.math.z.Z;

import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IrreduciblePolynomialsTest extends TestCase {

  public void testCount() {
    assertEquals(Z.ZERO, IrreduciblePolynomials.count(0));
    assertEquals(Z.TWO, IrreduciblePolynomials.count(1));
    assertEquals(Z.ONE, IrreduciblePolynomials.count(2));
    assertEquals(Z.TWO, IrreduciblePolynomials.count(3));
    assertEquals(Z.NINE, IrreduciblePolynomials.count(6));
    assertEquals(Z.valueOf(364722), IrreduciblePolynomials.count(23));
    assertEquals(Z.TWO, IrreduciblePolynomials.cumCount(2));
    assertEquals(Z.valueOf(225), IrreduciblePolynomials.cumCount(10));
  }

  public void testIterator() {
    final Iterator<Polynomial<Z>> pi = IrreduciblePolynomials.iterator();
    assertEquals("x", pi.next().toString());
    assertEquals("1+x", pi.next().toString());
    assertEquals("1+x+x^2", pi.next().toString());
    assertEquals("1+x+x^3", pi.next().toString());
    assertEquals("1+x^2+x^3", pi.next().toString());
    assertEquals("1+x+x^4", pi.next().toString());
    assertEquals("1+x^3+x^4", pi.next().toString());
    assertEquals("1+x+x^2+x^3+x^4", pi.next().toString());
    assertEquals("1+x^2+x^5", pi.next().toString());
    assertEquals("1+x^3+x^5", pi.next().toString());
    assertEquals("1+x+x^2+x^3+x^5", pi.next().toString());
    assertEquals("1+x+x^2+x^4+x^5", pi.next().toString());
    assertEquals("1+x+x^3+x^4+x^5", pi.next().toString());
    assertEquals("1+x^2+x^3+x^4+x^5", pi.next().toString());
    assertEquals("1+x+x^6", pi.next().toString());
  }

  public void testExponent() {
    assertEquals(1, IrreduciblePolynomials.exponent(Polynomial.create(1, 1)));
    assertEquals(3, IrreduciblePolynomials.exponent(Polynomial.create(1, 1, 1)));
    assertEquals(31, IrreduciblePolynomials.exponent(Polynomial.create(1, 0, 1, 1, 1, 1)));
  }
}
