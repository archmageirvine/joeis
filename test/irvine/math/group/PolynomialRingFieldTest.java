package irvine.math.group;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.c.C;
import irvine.math.c.ComplexField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.r.Reals;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PolynomialRingFieldTest extends TestCase {

  public void test() {
    final PolynomialRingField<Z> field = new PolynomialRingField<>(IntegerField.SINGLETON);
    assertNull(field.size());
    assertTrue(field.isAbelian());
    assertTrue(field.contains(field.zero()));
    assertTrue(field.contains(field.x()));
    assertFalse(field.contains(null));
    assertEquals("\\Z[x]", field.toString());
    assertTrue(field.zero() == field.zero());
    assertTrue(field.one() == field.one());
    assertTrue(field.x() == field.x());
    assertEquals(Polynomial.create(new long[0]), field.zero());
    assertEquals(Polynomial.create(1), field.one());
    assertEquals(Polynomial.create(1, 1), field.add(field.one(), field.x()));
    assertEquals(Polynomial.create(0, 0, 1), field.multiply(field.x(), field.x()));
    assertEquals(Polynomial.create(-1), field.negate(field.one()));
    try {
      field.add(null, field.one());
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      field.add(field.one(), null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      field.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testDivideAndShiftAndMultiply() {
    final PolynomialRingField<Z> field = new PolynomialRingField<>(IntegerField.SINGLETON);
    final Polynomial<Z> p = Polynomial.create(3, 2, 3, 9);
    assertEquals("1+x^2+3x^3", field.divide(p, Z.THREE).toString());
    assertEquals("3x^7+2x^8+3x^9+9x^10", p.shift(7).toString());
    assertEquals("9+6x+9x^2+27x^3", field.multiply(p, Z.THREE).toString());
    assertEquals("3+2x", p.truncate(1).toString());
    assertEquals("3", p.truncate(0).toString());
    assertEquals(p, p.truncate(100));
  }

  public void testPower() {
    final PolynomialRingField<Z> ring = new PolynomialRingField<>(IntegerField.SINGLETON);
    final Polynomial<Z> f = Polynomial.create(3, 0, -1);
    final Polynomial<Z> p = ring.pow(f, 9);
    assertEquals(-61236, p.coeff(6).longValue());
    assertEquals(2268, p.coeff(12).longValue());
    assertEquals(1, ring.eval(ring.pow(f, 0), Z.ONE).longValue());
    assertEquals("3", ring.powz(f, Z.ONE, 1).toString());
    assertEquals("3", ring.pow(f, Z.ONE, 1).toString());
    assertEquals("3", ring.pow(f, 1, 1).toString());
    assertEquals("9-6x^2", ring.powz(f, Z.TWO, 3).toString());
    assertEquals("9-6x^2", ring.pow(f, 2, 3).toString());
    assertEquals("27-27x^2+9x^4", ring.powz(f, Z.THREE, 4).toString());
    assertEquals("27-27x^2+9x^4", ring.pow(f, 3, 4).toString());
    assertEquals("81-108x^2", ring.pow(f, 4, 2).toString());
    assertEquals("243-405x^2", ring.pow(f, 5, 2).toString());
    assertEquals("729-1458x^2", ring.pow(f, 6, 2).toString());
  }

  public void testInvert() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(IntegerField.SINGLETON);
    final Polynomial<Z> a = Polynomial.create(0, 1, 1, 3, 8, 26);
    assertEquals("x+2x^2+6x^3+19x^4", f.invert(a, 4).toString());
  }

  public void testExp() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1", f.exp(f.x(), 0).toString());
    assertEquals("1+x+1/2x^2+1/6x^3+1/24x^4+1/120x^5+1/720x^6", f.exp(f.x(), 6).toString());
  }

  public void testLog1p() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("x-1/2x^2+1/3x^3-1/4x^4+1/5x^5-1/6x^6+1/7x^7-1/8x^8", f.log1p(f.x(), 8).toString());
  }

  public void testSin() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("x-1/6x^3+1/120x^5-1/5040x^7+1/362880x^9", f.sin(f.x(), 10).toString());
  }

  public void testCos() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1", f.cos(f.x(), 0).toString());
    assertEquals("1/2", f.cos(f.one(), 2).toString());
    assertEquals("1-1/2x^2+1/24x^4-1/720x^6+1/40320x^8-1/3628800x^10", f.cos(f.x(), 10).toString());
  }

  public void testAsin() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("x+1/6x^3+3/40x^5+5/112x^7+35/1152x^9", f.asin(f.x(), 10).toString());
  }

  public void testAcos1() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("-x-1/6x^3-3/40x^5-5/112x^7-35/1152x^9", f.acos1(f.x(), 10).toString());
  }

  public void testAsinh() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("x-1/6x^3+3/40x^5-5/112x^7+35/1152x^9", f.asinh(f.x(), 10).toString());
  }

  public void testAtan() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("x-1/3x^3+1/5x^5-1/7x^7+1/9x^9", f.atan(f.x(), 10).toString());
  }

  public void testCot() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1-1/3x^2-1/45x^4-2/945x^6-1/4725x^8-2/93555x^10", f.xcot(f.x(), 10).toString());
  }

  public void testCsc() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1+1/6x^2+7/360x^4+31/15120x^6+127/604800x^8+73/3421440x^10", f.xcsc(f.x(), 10).toString());
  }

  public void testSinh() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("x+1/6x^3+1/120x^5+1/5040x^7+1/362880x^9", f.sinh(f.x(), 10).toString());
  }

  public void testCosh() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1+1/2x^2+1/24x^4+1/720x^6+1/40320x^8+1/3628800x^10", f.cosh(f.x(), 10).toString());
  }

  public void testCoth() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1+1/3x^2-1/45x^4+2/945x^6-1/4725x^8+2/93555x^10", f.xcoth(f.x(), 10).toString());
  }

  public void testSqrt1p() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1+1/2x-1/8x^2+1/16x^3-5/128x^4+7/256x^5-21/1024x^6", f.sqrt1p(f.x(), 6).toString());
  }

  public void testSqrt1p2q() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("1-3x-2x^2-6x^3-20x^4-72x^5-274x^6", f.sqrt1p(f.create(Arrays.asList(Q.ZERO, new Q(-6), new Q(5))), 6).toString());
  }

  public void testSqrt() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("x", f.sqrt(f.create(Arrays.asList(Q.ZERO, Q.ZERO, Q.ONE)), 6).toString());
  }

  public void testDiscriminant() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(IntegerField.SINGLETON);
    assertEquals(Z.ZERO, f.discriminant(f.zero()));
    assertEquals(Z.ZERO, f.discriminant(f.one()));
    assertEquals(Z.ONE, f.discriminant(Polynomial.create(1, 1)));
    assertEquals(Z.valueOf(-8), f.discriminant(Polynomial.create(1, 2, 3)));
    assertEquals(Z.valueOf(-200), f.discriminant(Polynomial.create(1, 2, 3, 4)));
    assertEquals(Z.valueOf(10800), f.discriminant(Polynomial.create(1, 2, 3, 4, 5)));
    assertEquals(Z.valueOf(1037232), f.discriminant(Polynomial.create(1, 2, 3, 4, 5, 6)));
    assertEquals(Z.valueOf(-157351936), f.discriminant(Polynomial.create(1, 2, 3, 4, 5, 6, 7)));
  }
  
  public void testReversion() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(IntegerField.SINGLETON);
    assertEquals("x", f.reversion(Polynomial.create(0, 1), 4).toString());
    assertEquals("x+2x^2+8x^3+40x^4", f.reversion(Polynomial.create(0, 1, -2), 4).toString());
    assertEquals("x+2x^2+7x^3+29x^4+130x^5", f.reversion(Polynomial.create(0, 1, -2, 1, 1, 1), 5).toString());
    try {
      f.reversion(Polynomial.create(1), 4);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      f.reversion(Polynomial.create(0, 2), 4);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testIntegrate() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(IntegerField.SINGLETON);
    assertEquals("x+x^2", f.integrate(Polynomial.create(1, 2)).toString());
  }
  
  public void testSeries() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(IntegerField.SINGLETON);
    assertEquals("0", f.series(f.one(), f.x(), 3).toString());
    assertEquals("1", f.series(f.x(), f.x(), 3).toString());
    assertEquals("1-x^2+x^3", f.series(f.oneMinusXToTheN(2), f.oneMinusXToTheN(3), 3).toString());
    assertEquals("-x-x^2-x^3", f.series(f.oneMinusXToTheN(2), Polynomial.create(0, 1, -1), 3).toString());
  }

  public void testDurbin42p1ab() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("[2+x+x^2, 3]", Arrays.toString(f.divideAndRemainder(f.create(Arrays.asList(Q.ONE, Q.ONE, Q.ZERO, Q.ONE)), f.create(Arrays.asList(Q.NEG_ONE, Q.ONE)))));
    assertEquals("[-2-x^2, 3]", Arrays.toString(f.divideAndRemainder(f.create(Arrays.asList(Q.NEG_ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE)), f.create(Arrays.asList(Q.TWO, Q.ZERO, Q.NEG_ONE)))));
  }

  public void testDurbin42p1cd() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(new GaloisField(3));
    assertEquals("[0, -3+x^3]", Arrays.toString(f.divideAndRemainder(Polynomial.create(-3, 0, 0, 1), Polynomial.create(0, 1, 0, 0, 4))));
    assertEquals("[1+x, 0]", Arrays.toString(f.divideAndRemainder(Polynomial.create(2, 0, 1), Polynomial.create(-1, 1))));
  }

  public void testDurbin42p1e() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(new GaloisField(5));
    assertEquals("[2+2x+4x^2, 4+2x]", Arrays.toString(f.divideAndRemainder(Polynomial.create(-1, 0, 2, 0, 3), Polynomial.create(0, 4, 2))));
  }

  public void testDurbin42p3() {
    final PolynomialRingField<Double> f = new PolynomialRingField<>(Reals.SINGLETON);
    assertEquals("45.0", f.divideAndRemainder(f.create(Arrays.asList(1.0, 2.0, 0.0, -3.0, 0.0, 2.0)), f.create(Arrays.asList(-2.0, 1.0)))[1].toString());
  }

  public void testDurbin42p4() {
    final PolynomialRingField<Double> f = new PolynomialRingField<>(Reals.SINGLETON);
    assertEquals("-410.0", f.divideAndRemainder(f.create(Arrays.asList(1.0, 2.0, 0.0, -3.0, 0.0, 2.0)), f.create(Arrays.asList(3.0, 1.0)))[1].toString());
  }

  public void testDurbin42p5() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(new GaloisField(7));
    assertEquals("3", f.divideAndRemainder(f.create(Polynomial.create(1, 2, 0, -3, 0, 2)), Polynomial.create(-2, 1))[1].toString());
  }

  public void testDurbin42p15a() {
    final PolynomialRingField<Double> f = new PolynomialRingField<>(Reals.SINGLETON);
    final HashMap<Double, Double> map = new HashMap<>();
    map.put(1.0, 2.0);
    map.put(2.0, 3.0);
    map.put(3.0, -1.0);
    assertEquals("-4.0+8.5x-2.5x^2", f.lagrange(map).toString());
  }

  public void testDurbin42p15b() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(new GaloisField(5));
    final HashMap<Z, Z> map = new HashMap<>();
    map.put(Z.ONE, Z.TWO);
    map.put(Z.TWO, Z.THREE);
    map.put(Z.THREE, Z.NEG_ONE);
    assertEquals("1+x", f.lagrange(map).toString());
  }

  public void testGcdZero() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    try {
      f.gcd(f.zero(), f.zero());
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertEquals("1/2+x", f.gcd(f.create(Arrays.asList(Q.ONE, Q.TWO)), f.zero()).toString());
  }

  public void testDurbin43p1() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("-2+x", f.gcd(f.create(Arrays.asList(new Q(-2), Q.THREE, new Q(-3), Q.ONE)), f.create(Arrays.asList(new Q(6), new Q(-5), Q.ONE))).toString());
    assertEquals("1+x^2", f.gcd(f.create(Arrays.asList(Q.TWO, Q.ZERO, Q.THREE, Q.ZERO, Q.ONE)), f.create(Arrays.asList(Q.ZERO, Q.NEG_ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE))).toString());
    assertEquals("1", f.gcd(f.create(Arrays.asList(new Q(-2), new Q(-2), Q.ONE, Q.ONE)), f.create(Arrays.asList(Q.ZERO, new Q(-6), Q.THREE, new Q(-2), Q.ONE))).toString());
  }

  public void testExtendedGcd() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("[-1+x, 1+x, 2-x^2]", Arrays.toString(f.extendedGcd(f.create(Arrays.asList(Q.ONE, Q.ZERO, Q.NEG_ONE, Q.NEG_ONE, Q.ONE)), f.create(Arrays.asList(Q.NEG_ONE, Q.ZERO, Q.ZERO, Q.ONE)))));
  }

  public void testDurbin43p2() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    assertEquals("[-2+x, 1/7, -2/7-1/7x]", Arrays.toString(f.extendedGcd(f.create(Arrays.asList(new Q(-2), Q.THREE, new Q(-3), Q.ONE)), f.create(Arrays.asList(new Q(6), new Q(-5), Q.ONE)))));
    assertEquals("[1+x^2, 1/2-1/6x^2, 1/6x]", Arrays.toString(f.extendedGcd(f.create(Arrays.asList(Q.TWO, Q.ZERO, Q.THREE, Q.ZERO, Q.ONE)), f.create(Arrays.asList(Q.ZERO, Q.NEG_ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE)))));
    assertEquals("[1, -1/2+3/10x-3/20x^2+1/12x^3, 1/15-1/10x-1/12x^2]", Arrays.toString(f.extendedGcd(f.create(Arrays.asList(new Q(-2), new Q(-2), Q.ONE, Q.ONE)), f.create(Arrays.asList(Q.ZERO, new Q(-6), Q.THREE, new Q(-2), Q.ONE)))));
  }

  public void testDurbin43p7b() {
    final PolynomialRingField<C> f = new PolynomialRingField<>(ComplexField.SINGLETON);
    assertEquals("1.0i+1.0ix+x^2", f.monicAssociate(f.create(Arrays.asList(C.ONE, C.ONE, ComplexField.SINGLETON.negate(C.I)))).toString());
  }

  public void testDurbin43p7c() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(new GaloisField(7));
    assertEquals("4+2x^2+x^4", f.monicAssociate(f.create(Arrays.asList(Z.ONE, Z.ZERO, Z.valueOf(-3), Z.ZERO, Z.TWO))).toString());
  }

  public void testDurbin49p4() {
    final PolynomialRingField<Q> f = new PolynomialRingField<>(Rationals.SINGLETON);
    final Polynomial<Q> r = f.create(Arrays.asList(new Q(-7), Q.ZERO, Q.ONE));
    assertEquals("7x", f.mod(f.pow(f.x(), 3), r).toString());
    assertEquals("-5-x", f.mod(f.multiply(f.oneMinusXToTheN(1), f.create(Arrays.asList(Q.TWO, Q.ONE))), r).toString());
    assertEquals("8+2x", f.mod(f.pow(f.onePlusXToTheN(1), 2), r).toString());
    assertEquals("-6", f.mod(r, f.oneMinusXToTheN(1)).toString());
  }

  public void testDurbin50p6() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(new GaloisField(2));
    final Polynomial<Z> r = f.create(Arrays.asList(Z.ONE, Z.ONE, Z.ZERO, Z.ONE));
    assertEquals("1+x", f.mod(f.monomial(Z.ONE, 3), r).toString());
    assertEquals("1", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ONE)), r).toString());
    assertEquals("1+x+x^2", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ZERO, Z.ONE, Z.ONE)), r).toString());
    assertEquals("1+x^2", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ONE, Z.ONE)), r).toString());
    assertEquals("1+x^2", f.mod(f.pow(f.onePlusXToTheN(1), 2), r).toString());
    assertEquals("x^2", f.mod(f.create(Arrays.asList(Z.ONE, Z.ONE, Z.ONE, Z.ONE)), r).toString());
    assertEquals("x", f.mod(f.create(Arrays.asList(Z.ONE, Z.ZERO, Z.ZERO, Z.ONE)), r).toString());
    assertEquals("x+x^2", f.mod(f.monomial(Z.ONE, 4), r).toString());
    assertEquals("x", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ZERO, Z.ONE, Z.ZERO, Z.ONE)), r).toString());
    assertEquals("1+x^2", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.ONE)), r).toString());
    assertEquals("1", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ZERO, Z.ONE, Z.ONE, Z.ONE)), r).toString());
    assertEquals("1+x+x^2", f.mod(f.pow(f.onePlusXToTheN(2), 2), r).toString());
    assertEquals("1+x", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ONE, Z.ONE, Z.ONE)), r).toString());
    assertEquals("x+x^2", f.mod(f.create(Arrays.asList(Z.ONE, Z.ONE, Z.ZERO, Z.ONE, Z.ONE)), r).toString());
    assertEquals("x^2", f.mod(f.create(Arrays.asList(Z.ZERO, Z.ONE, Z.ZERO, Z.ZERO, Z.ONE)), r).toString());
    assertEquals("1+x", f.mod(f.create(Arrays.asList(Z.ONE, Z.ZERO, Z.ONE, Z.ZERO, Z.ONE)), r).toString());
  }
}
