package irvine.math.polynomial;

import irvine.math.group.IntegerField;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MultivariatePolynomialTest extends TestCase {

  public void testConstruction0() {
    final MultivariatePolynomial<Z> p = new MultivariatePolynomial<>(IntegerField.SINGLETON, 5);
    assertTrue(p.isZero());
    assertEquals("0", p.toString());
    assertEquals(5, p.numberVariables());
  }

  public void testConstruction1() {
    final MultivariatePolynomial<Z> p = new MultivariatePolynomial<>(IntegerField.SINGLETON, 3, new int[][] {{1, 2, 3}}, Z.FOUR);
    assertFalse(p.isZero());
    assertEquals("4xy^2z^3", p.toString());
  }

  public void testConstruction2() {
    final MultivariatePolynomial<Z> p = new MultivariatePolynomial<>(IntegerField.SINGLETON, 3, new int[][] {{1, 2, 3}, {2, 0, 1}}, Z.FOUR, Z.NEG_ONE);
    assertFalse(p.isZero());
    assertEquals("4xy^2z^3-x^2z", p.toString());
  }

  public void testScalarMultiply() {
    final MultivariatePolynomial<Z> p = new MultivariatePolynomial<>(IntegerField.SINGLETON, 3, new int[][] {{2, 0, 1}, {1, 2, 3}}, Z.NEG_ONE, Z.FOUR);
    assertFalse(p.isZero());
    assertEquals("4xy^2z^3-x^2z", p.toString());
    final MultivariatePolynomial p3 = p.scalarMultiply(Z.THREE);
    assertEquals("12xy^2z^3-3x^2z", p3.toString());
    final MultivariatePolynomial p0 = p.scalarMultiply(Z.ZERO);
    assertTrue(p0.isZero());
    assertEquals("0", p0.toString());
  }

  public void testConstant() {
    final MultivariatePolynomial<Z> num = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{0, 0}}, Z.ONE);
    assertEquals("1", num.toString());
  }

  public void testConstantN1() {
    final MultivariatePolynomial<Z> num = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{0, 0}}, Z.NEG_ONE);
    assertEquals("-1", num.toString());
    assertEquals(0, num.degree(0));
    assertEquals(0, num.degree(1));
  }

  public void testConstant2() {
    final MultivariatePolynomial<Z> num = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{0, 0}}, Z.TWO);
    assertEquals("2", num.toString());
  }

  public void testConstruction1Var() {
    final MultivariatePolynomial<Z> p = new MultivariatePolynomial<>(IntegerField.SINGLETON, 1, new int[][] {{1}, {2}}, Z.FOUR, Z.NEG_ONE);
    assertEquals("4x-x^2", p.toString());
    assertEquals("4x-x^2", p.toPolynomial().toString());
  }

  public void testA010029() {
    final MultivariatePolynomial<Z> p = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{2, 0}, {2, 1}, {1, 0}}, Z.ONE, Z.NEG_ONE, Z.NEG_ONE);
    assertEquals("-x+x^2-x^2y", p.toString());
    final MultivariatePolynomial<Z> p2 = p.multiply(p);
    assertEquals("x^2-2x^3+2x^3y+x^4-2x^4y+x^4y^2", p2.toString());
    final MultivariatePolynomial<Z> p3 = p2.multiply(p);
    assertEquals("-x^3+3x^4-3x^4y-3x^5+6x^5y-3x^5y^2+x^6-3x^6y+3x^6y^2-x^6y^3", p3.toString());
    final MultivariatePolynomial<Z> p3b = p2.multiply(p, new int[] {5, 1});
    assertEquals("-x^3+3x^4-3x^4y-3x^5+6x^5y", p3b.toString());
    assertEquals("-3x^5+3x^6", p3.extract(1, 2).toString());
    assertEquals(6, p3.degree(0));
    assertEquals(3, p3.degree(1));
  }
}
