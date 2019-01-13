package irvine.math.group;

import irvine.math.polynomial.QPolynomial;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class QPolynomialRingTest extends TestCase {

  public void test() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    assertNull(ring.size());
    assertTrue(ring.isAbelian());
    assertTrue(ring.isCommutative());
    assertTrue(ring.isIntegralDomain());
    assertTrue(ring.contains(ring.zero()));
    assertTrue(ring.contains(ring.x()));
    assertFalse(ring.contains(null));
    assertEquals("\\Z[q]", ring.toString());
    assertTrue(ring.zero() == ring.zero());
    assertTrue(ring.one() == ring.one());
    assertTrue(ring.x() == ring.x());
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
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    final QPolynomial<Z> f = QPolynomial.create(17, 2, 0, 4);
    final QPolynomial<Z> g = QPolynomial.create(1, -3, 1);
    final QPolynomial<Z> p = ring.multiply(f, g);
    assertEquals(new Q(5), p.degree());
    assertEquals(-49, p.coeff(Q.ONE).longValue());
    assertEquals(4, p.coeff(new Q(5)).longValue());
    assertEquals(11, p.coeff(Q.TWO).longValue());
    assertEquals("17+2q+4q^3", f.toString());
    assertEquals("1-3q+q^2", g.toString());
    assertEquals("34+4q+8q^3", ring.multiply(f, Z.TWO).toString());
    assertEquals("0", ring.multiply(f, Z.ZERO).toString());
  }

  public void testMultiply2() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    final QPolynomial<Z> f = QPolynomial.create(17, 2, 0, 4);
    final QPolynomial<Z> g = QPolynomial.create(1, -3, 1);
    final QPolynomial<Z> p = ring.multiply(f, g, 2);
    assertEquals(Q.TWO, p.degree());
    assertEquals(-49, p.coeff(Q.ONE).longValue());
    assertEquals(0, p.coeff(new Q(5)).longValue());
    assertEquals(11, p.coeff(Q.TWO).longValue());
  }

  public void testPower() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>("y", Integers.SINGLETON);
    final QPolynomial<Z> f = QPolynomial.create(3, 0, -1);
    final QPolynomial<Z> p = ring.pow(f, 9);
    assertEquals(-61236, p.coeff(new Q(6)).longValue());
    assertEquals(2268, p.coeff(new Q(12)).longValue());
    assertEquals("3", ring.pow(f, 1, 1).toString());
    assertEquals("9-6y^2", ring.pow(f, 2, 3).toString());
    assertEquals("27-27y^2+9y^4", ring.pow(f, 3, 4).toString());
    assertEquals("81-108y^2", ring.pow(f, 4, 2).toString());
    assertEquals("243-405y^2", ring.pow(f, 5, 2).toString());
    assertEquals("729-1458y^2", ring.pow(f, 6, 2).toString());
  }

  public void testAdd() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    final QPolynomial<Z> f = QPolynomial.create(3, 0, -1);
    final QPolynomial<Z> g = QPolynomial.create(1, 2);
    final QPolynomial<Z> s = ring.add(f, g);
    assertEquals(Z.FOUR, s.coeff(Q.ZERO));
    assertEquals(Z.TWO, s.coeff(Q.ONE));
    assertEquals(-1, s.coeff(Q.TWO).longValue());
  }

  public void testSubtract() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    final QPolynomial<Z> f = QPolynomial.create(3, 0, -1);
    final QPolynomial<Z> g = QPolynomial.create(1, 2);
    final QPolynomial<Z> s = ring.subtract(f, g);
    assertEquals(Z.TWO, s.coeff(0));
    assertEquals(Z.TWO.negate(), s.coeff(1));
    assertEquals(Z.NEG_ONE, s.coeff(2));
  }

  public void testOnePlusXToTheN() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    final Q five = new Q(5);
    for (Q k = Q.ZERO; k.compareTo(five) < 0; k = k.add(Q.HALF)) {
      assertEquals(k, ring.onePlusXToTheN(k).degree());
    }
    final QPolynomial<Z> p = ring.onePlusXToTheN(new Q(4));
    assertEquals(Z.ONE, p.coeff(0));
    assertEquals(Z.ZERO, p.coeff(1));
    assertEquals(Z.ZERO, p.coeff(2));
    assertEquals(Z.ZERO, p.coeff(3));
    assertEquals(Z.ONE, p.coeff(4));
  }
  
  public void testOneMinusXToTheN() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    assertEquals("-1", ring.oneMinusXToTheN(Z.TWO, Q.ZERO).toString());
    assertEquals("1-2q", ring.oneMinusXToTheN(Z.TWO, Q.ONE).toString());
    assertEquals("1-2q^2", ring.oneMinusXToTheN(Z.TWO, Q.TWO).toString());
    assertEquals("1-2q^3", ring.oneMinusXToTheN(Z.TWO, Q.THREE).toString());
  }

  public void testMonomial() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    final QPolynomial<Z> p = ring.monomial(Z.FIVE, new Q(27));
    assertEquals(Z.FIVE, p.coeff(27));
    assertEquals(Z.ZERO, p.coeff(0));
    assertEquals(Z.ZERO, p.coeff(26));
    final QPolynomial<Z> pp = ring.monomial(Z.FIVE, Q.ZERO);
    assertEquals("5", pp.toString());
  }
  
  public void testCoerce() {
    assertEquals("2", new QPolynomialRing<>(Integers.SINGLETON).coerce(2).toString());
  }

  public void testCharacteristic() {
    assertEquals(Z.ZERO, new QPolynomialRing<>(Integers.SINGLETON).characteristic());
    assertEquals(Z.THREE, new QPolynomialRing<>(new IntegersMod(3)).characteristic());
  }

  public void testEta() {
    final QPolynomialRing<Z> ring = new QPolynomialRing<>(Integers.SINGLETON);
    final QPolynomial<Z> eta = ring.eta(ring.x(), 16);
    assertEquals("1-q-q^2+q^5+q^7-q^{12}-q^{15}", eta.toString());
    assertEquals("1-3q^2-9q^4+243q^{10}+2187q^{14}", ring.eta(QPolynomial.create(0, 0, 3), 16).toString());
  }
}
