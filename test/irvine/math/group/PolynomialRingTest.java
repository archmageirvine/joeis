package irvine.math.group;

import java.util.Arrays;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PolynomialRingTest extends TestCase {

  public void test() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    assertNull(ring.size());
    assertTrue(ring.isAbelian());
    assertTrue(ring.isCommutative());
    assertTrue(ring.isIntegralDomain());
    assertTrue(ring.contains(ring.zero()));
    assertTrue(ring.contains(ring.x()));
    assertFalse(ring.contains(null));
    assertEquals("\\Z[x]", ring.toString());
    assertTrue(ring.zero() == ring.zero());
    assertTrue(ring.one() == ring.one());
    assertTrue(ring.x() == ring.x());
    assertEquals(Polynomial.create(new long[0]), ring.zero());
    assertEquals(Polynomial.create(1), ring.one());
    assertEquals(Polynomial.create(1, 1), ring.add(ring.one(), ring.x()));
    assertEquals(Polynomial.create(0, 0, 1), ring.multiply(ring.x(), ring.x()));
    assertEquals(Polynomial.create(-1), ring.negate(ring.one()));
    assertEquals(Z.ONE, ring.eval(ring.one(), Z.ZERO));
    assertEquals(Z.ONE, ring.eval(Polynomial.create(Z.ONE, Z.TWO, Z.THREE), Z.ZERO));
    assertTrue(ring.isMonic(ring.one()));
    assertTrue(ring.isMonic(Polynomial.create(Z.TWO, Z.ONE)));
    assertFalse(ring.isMonic(Polynomial.create(Z.ONE, Z.TWO)));
    assertFalse(ring.isMonic(ring.zero()));
    try {
      ring.add(null, ring.one());
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      ring.add(ring.one(), null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      ring.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testMultiply() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> f = Polynomial.create(17, 2, 0, 4);
    final Polynomial<Z> g = Polynomial.create(1, -3, 1);
    final Polynomial<Z> p = ring.multiply(f, g);
    assertEquals(5, p.degree());
    assertEquals(-49, p.coeff(1).longValue());
    assertEquals(4, p.coeff(5).longValue());
    assertEquals(11, p.coeff(2).longValue());
    assertEquals(40687, ring.eval(p, Z.SEVEN).longValue());
    assertEquals("17+2x+4x^3", f.toString());
    assertEquals("1-3x+x^2", g.toString());
    assertEquals("34+4x+8x^3", ring.multiply(f, Z.TWO).toString());
    assertEquals("0", ring.multiply(f, Z.ZERO).toString());
  }

  public void testMultiply2() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> f = Polynomial.create(17, 2, 0, 4);
    final Polynomial<Z> g = Polynomial.create(1, -3, 1);
    final Polynomial<Z> p = ring.multiply(f, g, 2);
    assertEquals(2, p.degree());
    assertEquals(-49, p.coeff(1).longValue());
    assertEquals(0, p.coeff(5).longValue());
    assertEquals(11, p.coeff(2).longValue());
    assertEquals(213, ring.eval(p, Z.SEVEN).longValue());
  }

  public void testPower() {
    final PolynomialRing<Z> ring = new PolynomialRing<>("y", Integers.SINGLETON);
    final Polynomial<Z> f = Polynomial.create(3, 0, -1);
    final Polynomial<Z> p = ring.pow(f, 9);
    assertEquals(-61236, p.coeff(6).longValue());
    assertEquals(2268, p.coeff(12).longValue());
    assertEquals(1, ring.eval(ring.pow(f, 0), Z.ONE).longValue());
    assertEquals("3", ring.powz(f, Z.ONE, 1).toString());
    assertEquals("3", ring.pow(f, 1, 1).toString());
    assertEquals("9-6y^2", ring.powz(f, Z.TWO, 3).toString());
    assertEquals("9-6y^2", ring.pow(f, 2, 3).toString());
    assertEquals("27-27y^2+9y^4", ring.powz(f, Z.THREE, 4).toString());
    assertEquals("27-27y^2+9y^4", ring.pow(f, 3, 4).toString());
    assertEquals("81-108y^2", ring.pow(f, 4, 2).toString());
    assertEquals("243-405y^2", ring.pow(f, 5, 2).toString());
    assertEquals("729-1458y^2", ring.pow(f, 6, 2).toString());
  }

  public void testAdd() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> f = Polynomial.create(3, 0, -1);
    final Polynomial<Z> g = Polynomial.create(1, 2);
    final Polynomial<Z> s = ring.add(f, g);
    assertEquals(Z.FOUR, s.coeff(0));
    assertEquals(Z.TWO, s.coeff(1));
    assertEquals(-1, s.coeff(2).longValue());
  }

  public void testSubtract() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> f = Polynomial.create(3, 0, -1);
    final Polynomial<Z> g = Polynomial.create(1, 2);
    final Polynomial<Z> s = ring.subtract(f, g);
    assertEquals(Z.TWO, s.coeff(0));
    assertEquals(Z.TWO.negate(), s.coeff(1));
    assertEquals(Z.NEG_ONE, s.coeff(2));
  }

  public void testOnePlusXToTheN() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    for (int k = 0; k < 10; ++k) {
      assertEquals(k, ring.onePlusXToTheN(k).degree());
    }
    try {
      ring.onePlusXToTheN(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final Polynomial<Z> p = ring.onePlusXToTheN(4);
    assertEquals(Z.ONE, p.coeff(0));
    assertEquals(Z.ZERO, p.coeff(1));
    assertEquals(Z.ZERO, p.coeff(2));
    assertEquals(Z.ZERO, p.coeff(3));
    assertEquals(Z.ONE, p.coeff(4));
  }
  
  public void testOneMinusXToTheN() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    assertEquals("-1", ring.oneMinusXToTheN(Z.TWO, 0).toString());
    assertEquals("1-2x", ring.oneMinusXToTheN(Z.TWO, 1).toString());
    assertEquals("1-2x^2", ring.oneMinusXToTheN(Z.TWO, 2).toString());
    assertEquals("1-2x^3", ring.oneMinusXToTheN(Z.TWO, 3).toString());
  }

  public void testMonomial() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    try {
      ring.monomial(Z.ZERO, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      ring.monomial(null, 1);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    final Polynomial<Z> p = ring.monomial(Z.FIVE, 27);
    assertEquals(Z.FIVE, p.coeff(27));
    assertEquals(Z.ZERO, p.coeff(0));
    assertEquals(Z.ZERO, p.coeff(26));
    final Polynomial<Z> pp = ring.monomial(Z.FIVE, 0);
    assertEquals("5", pp.toString());
  }
  
  public void testDiff() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> p = Polynomial.create(2, -3, 4);
    assertEquals("-3+8x", ring.diff(p).toString());
  }

  public void testCoerce() {
    assertEquals("2", new PolynomialRing<>(Integers.SINGLETON).coerce(2).toString());
  }

  public void testDurbin41p3() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    assertEquals("3+x+2x^2", ring.add(ring.create(Arrays.asList(Z.ONE, Z.TWO)), ring.create(Arrays.asList(Z.TWO, Z.NEG_ONE, Z.TWO))).toString());
    assertEquals("3x+x^3+2x^4", ring.add(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ZERO, Z.ONE)), ring.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.TWO))).toString());
    assertEquals("2+3x+4x^3", ring.multiply(ring.create(Arrays.asList(Z.ONE, Z.TWO)), ring.create(Arrays.asList(Z.TWO, Z.NEG_ONE, Z.TWO))).toString());
    assertEquals("2x^2+x^4+4x^5+2x^7", ring.multiply(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ZERO, Z.ONE)), ring.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.TWO))).toString());
    assertEquals("8x^3+12x^4+6x^5+x^6", ring.pow(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ONE)), 3).toString());
  }

  public void testDurbin41p4() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(new IntegersMod(3));
    assertEquals("x+2x^2", ring.add(ring.create(Arrays.asList(Z.ONE, Z.TWO)), ring.create(Arrays.asList(Z.TWO, Z.NEG_ONE, Z.TWO))).toString());
    assertEquals("x^3+2x^4", ring.add(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ZERO, Z.ONE)), ring.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.TWO))).toString());
    assertEquals("2+x^3", ring.multiply(ring.create(Arrays.asList(Z.ONE, Z.TWO)), ring.create(Arrays.asList(Z.TWO, Z.NEG_ONE, Z.TWO))).toString());
    assertEquals("2x^2+x^4+x^5+2x^7", ring.multiply(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ZERO, Z.ONE)), ring.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.TWO))).toString());
    assertEquals("2x^3+x^6", ring.pow(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ONE)), 3).toString());
  }

  public void testDurbin41p5() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(new IntegersMod(4));
    assertEquals("3+x+2x^2", ring.add(ring.create(Arrays.asList(Z.ONE, Z.TWO)), ring.create(Arrays.asList(Z.TWO, Z.NEG_ONE, Z.TWO))).toString());
    assertEquals("3x+x^3+2x^4", ring.add(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ZERO, Z.ONE)), ring.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.TWO))).toString());
    assertEquals("2+3x", ring.multiply(ring.create(Arrays.asList(Z.ONE, Z.TWO)), ring.create(Arrays.asList(Z.TWO, Z.NEG_ONE, Z.TWO))).toString());
    assertEquals("2x^2+x^4+2x^7", ring.multiply(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ZERO, Z.ONE)), ring.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.TWO))).toString());
    assertEquals("2x^5+x^6", ring.pow(ring.create(Arrays.asList(Z.ZERO, Z.TWO, Z.ONE)), 3).toString());
  }

  public void testCharacteristic() {
    assertEquals(Z.ZERO, new PolynomialRing<>(Integers.SINGLETON).characteristic());
    assertEquals(Z.THREE, new PolynomialRing<>(new IntegersMod(3)).characteristic());
  }

  public void testEval0At0() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    assertEquals(Z.ZERO, ring.eval(ring.zero(), Z.ZERO));
  }

  public void testSubstitute() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> p = Polynomial.create(7, 0, 1, -2, 3);
    assertEquals("7+x^2-2x^3", ring.substitute(p, ring.x(), 3).toString());
    assertEquals("7+x^2+2x^3+3x^4", ring.substitute(p, ring.negate(ring.x()), Integer.MAX_VALUE).toString());
    assertEquals("7+4x^2", ring.substitute(p, ring.multiply(ring.x(), Z.TWO), 2).toString());
  }

  public void testEta() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> eta = ring.eta(ring.x(), 16);
    assertEquals("1-x-x^2+x^5+x^7-x^12-x^15", eta.toString());
    assertEquals("1-3x^2-9x^4+243x^10+2187x^14", ring.eta(Polynomial.create(0, 0, 3), 16).toString());
  }
}
