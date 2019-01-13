package irvine.math.group;

import irvine.math.c.C;
import irvine.math.c.ComplexField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MatrixFieldTest extends TestCase {

  static Q[][] toQ(final long[][] l) {
    final Q[][] z = new Q[l.length][];
    for (int k = 0; k < l.length; ++k) {
      z[k] = new Q[l[k].length];
      for (int j = 0; j < z[k].length; ++j) {
        z[k][j] = new Q(l[k][j]);
      }
    }
    return z;
  }

  public void testOneByOneDeterminantAndInverse() {
    final MatrixField<Q> ring = new MatrixField<>(1, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(new Q[][] {{Q.HALF}}, Q.ZERO);
    assertEquals(Q.HALF, ring.det(a));
    assertEquals(new DefaultMatrix<>(new Q[][] {{Q.TWO}}, Q.ZERO), ring.inverse(a));
  }

  public void testFourByFourDeterminant() {
    final MatrixField<Q> ring = new MatrixField<>(4, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{3, 5, -2, 6}, {1, 2, -1, 1}, {2, 4, 1, 5}, {3, 7, 5, 3}}), Q.ZERO);
    assertEquals(Z.valueOf(-18), ring.det(a).toZ());
  }

  public void testFiveByFiveDeterminant() {
    final MatrixField<Q> ring = new MatrixField<>(5, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{4, 0, 0, 1, 0}, {3, 3, 3, -1, 0}, {1, 2, 4, 2, 3}, {9, 4, 6, 2, 3}, {2, 2, 4, 2, 3}}), Q.ZERO);
    assertEquals(Q.ZERO, ring.det(a));
  }

  public void testInverse2a() {
    final MatrixField<Q> ring = new MatrixField<>(2, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{1, 2}, {1, 3}}), Q.ZERO);
    assertEquals("[[3 -2][-1 1]]", ring.inverse(a).toString());
  }

  public void testInverse2b() {
    final MatrixField<Q> ring = new MatrixField<>(2, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{3, 2}, {2, 2}}), Q.ZERO);
    assertEquals("[[1 -1][-1 3/2]]", ring.inverse(a).toString());
  }

  public void testInverseImpossible() {
    final MatrixField<Q> ring = new MatrixField<>(2, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{0, 2}, {0, 2}}), Q.ZERO);
    try {
      ring.inverse(a);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testPower() {
    final MatrixField<Q> field = new MatrixField<>(2, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{1, 2}, {1, 3}}), Q.ZERO);
    assertEquals(field.one(), field.pow(a, 0));
    assertEquals(a, field.pow(a, 1));
    assertEquals("[[11 30][15 41]]", field.pow(a, 3).toString());
    assertEquals("[[41 -30][-15 11]]", field.pow(a, -3).toString());
  }

  public void testInverse3() {
    final MatrixField<Q> field = new MatrixField<>(3, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{1, 2, 3}, {2, 5, 3}, {1, 0, 8}}), Q.ZERO);
    final Matrix<Q> ai = field.inverse(a);
    assertEquals("[[-40 16 9][13 -5 -3][5 -2 -1]]", ai.toString());
    assertEquals(a, field.inverse(ai));
  }

  /*
   * Simultaneously solve two sets of linear equations:
   *
   * x1 + 2x2  + 3x3 = 4   x1 +2x2   + 3x3 = 1
   * 2x1 + 5x2 + 3x3 = 5   2x1 + 5x2 + 3x3 = 6
   * x1        + 8x3 = 9   x1        + 8x3 = -6
   */
  public void testGaussian() {
    final MatrixField<Q> field = new MatrixField<>(3, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{1, 2, 3}, {2, 5, 3}, {1, 0, 8}}), Q.ZERO);
    final Matrix<Q> b = new DefaultMatrix<>(toQ(new long[][] {{4, 1}, {5, 6}, {9, -6}}), Q.ZERO);
    assertTrue(field.reduce(a, b));
    assertEquals(field.one(), a);
    assertEquals("[[1 2][0 1][1 -1]]", b.toString());
  }

  public void testBiggerTriangularDeterminant() {
    final MatrixField<Q> field = new MatrixField<>(5, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(toQ(new long[][] {{2, 7, -3, 8, 3}, {0, -3, 7, 5, 1}, {0, 0, 6, 7, 6}, {0, 0, 0, 9, 8}, {0, 0, 0, 0, 4}}), Q.ZERO);
    assertEquals(new Q(-1296), field.det(a));
  }

  /*
   * Simultaneously solve 3z-2w=-i and iz+2iw=-5 over the complex numbers.
   */
  public void testDurbin29p12() {
    final MatrixField<C> field = new MatrixField<>(2, ComplexField.SINGLETON);
    final Matrix<C> a = new DefaultMatrix<>(new C[][] {{new C(3), new C(-2)}, {C.I, new C(0, 2)}}, C.ZERO);
    final Matrix<C> b = new DefaultMatrix<>(new C[][] {{new C(0, -1)}, {new C(-5)}}, C.ZERO);
    assertTrue(field.reduce(a, b));
    assertEquals(field.one(), a);
    assertEquals("[[1.0i][2.0i]]", b.toString());
  }

  /*
   * Simultaneously solve z+iw=1 and -2iz+w=-1 over the complex numbers.
   */
  public void testDurbin29p13() {
    final MatrixField<C> field = new MatrixField<>(2, ComplexField.SINGLETON);
    final Matrix<C> a = new DefaultMatrix<>(new C[][] {{C.ONE, C.I}, {new C(0, -2), C.ONE}}, C.ZERO);
    final Matrix<C> b = new DefaultMatrix<>(new C[][] {{C.ONE}, {new C(-1)}}, C.ZERO);
    assertTrue(field.reduce(a, b));
    assertEquals(field.one(), a);
    assertEquals("[[-1.0-1.0i][1.0-2.0i]]", b.toString());
  }
}
