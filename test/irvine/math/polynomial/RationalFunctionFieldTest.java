package irvine.math.polynomial;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RationalFunctionFieldTest extends TestCase {

  public void test() {
    final RationalFunctionField<Q> field = new RationalFunctionField<>(Rationals.SINGLETON);
    assertNull(field.size());
    assertTrue(field.isAbelian());
    assertTrue(field.contains(field.zero()));
    assertTrue(field.contains(field.x()));
    assertFalse(field.contains(null));
    assertEquals("\\Q(x)", field.toString());
    assertTrue(field.zero() == field.zero());
    assertTrue(field.one() == field.one());
    assertTrue(field.x() == field.x());
    assertEquals("0", field.zero().toString());
    assertEquals("1", field.one().toString());
    assertEquals("x", field.x().toString());
    assertEquals("-1", field.negate(field.one()).toString());
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

  public void testAdd() {
    final RationalFunctionField<Q> field = new RationalFunctionField<>(Rationals.SINGLETON);
    assertEquals(field.x(), field.add(field.x(), field.zero()));
    assertEquals(field.x(), field.add(field.zero(), field.x()));
    assertEquals("(1+x^2)/x", field.add(field.x(), field.inverse(field.x())).toString());
  }

  public void testMultiply() {
    final RationalFunctionField<Q> field = new RationalFunctionField<>(Rationals.SINGLETON);
    final RationalFunction<Q> inv = field.inverse(field.x());
    assertEquals(field.one(), field.multiply(field.x(), inv));
    assertEquals("1/x^2", field.multiply(inv, inv).toString());
  }

  public void testDerivative() {
    final PolynomialRingField<Q> poly = new PolynomialRingField<>(Rationals.SINGLETON);
    final RationalFunctionField<Q> field = new RationalFunctionField<>(Rationals.SINGLETON);
    final RationalFunction<Q> r = new RationalFunction<>(poly.oneMinusXToTheN(5), poly.monomial(Q.TWO, 3));
    assertEquals("(-6-4x^5)/4x^4", field.diff(r).toString());
  }
}
