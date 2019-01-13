package irvine.math.group;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MatrixRingTest extends TestCase {

  static Z[][] toZ(final long[][] l) {
    final Z[][] z = new Z[l.length][];
    for (int k = 0; k < l.length; ++k) {
      z[k] = new Z[l[k].length];
      for (int j = 0; j < z[k].length; ++j) {
        z[k][j] = Z.valueOf(l[k][j]);
      }
    }
    return z;
  }

  public void testOneByOne() {
    final MatrixRing<Z> ring = new MatrixRing<>(1, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(new Z[][] {{Z.FOUR}}, Z.ZERO);
    assertEquals(Z.FOUR, ring.det(a));
    assertEquals(Z.FOUR, ring.permanent(a));
    assertTrue(ring.isCommutative());
    assertTrue(ring.isIntegralDomain());
  }

  public void testOneByOneNotIntegralDomain() {
    final MatrixRing<Matrix<Z>> ring = new MatrixRing<>(1, new MatrixRing<>(2, Integers.SINGLETON));
    assertFalse(ring.isCommutative());
    assertFalse(ring.isIntegralDomain());
  }

  public void testTwoByTwo() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, Integers.SINGLETON);
    assertTrue(ring.contains(ring.one()));
    assertFalse(ring.isCommutative());
    assertEquals(2, ring.rows());
    assertEquals(2, ring.cols());
    assertEquals("M_{2,2}(\\Z)", ring.toString());
    assertEquals("[[1 0][0 1]]", ring.one().toString());
    final Matrix<Z> a = new DefaultMatrix<>(new Z[][] {{Z.ONE, Z.TWO}, {Z.TWO, Z.THREE}}, Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(new Z[][] {{Z.TWO, Z.ONE}, {Z.TWO, Z.TWO}}, Z.ZERO);
    final Matrix<Z> s = ring.multiply(a, b);
    assertEquals("[[6 5][10 8]]", s.toString());
    assertEquals(Z.NEG_ONE, ring.det(a));
    assertEquals(Z.TWO, ring.det(b));
    assertEquals(Z.SIX, ring.permanent(b));
    assertFalse(ring.isIntegralDomain());
  }

  public void testThreeByThreeDeterminant() {
    final MatrixRing<Z> ring = new MatrixRing<>(3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{1, 4, 2}, {2, 3, 2}, {1, 1, 4}}), Z.ZERO);
    assertEquals(Z.valueOf(-16), ring.det(a));
    assertEquals(Z.valueOf(64), ring.permanent(a));
  }

  public void testFourByFourDeterminant() {
    final MatrixRing<Z> ring = new MatrixRing<>(4, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{3, 5, -2, 6}, {1, 2, -1, 1}, {2, 4, 1, 5}, {3, 7, 5, 3}}), Z.ZERO);
    assertEquals(Z.valueOf(-18), ring.det(a));
    assertEquals(Z.valueOf(140), ring.permanent(a));
  }

  public void testFiveByFiveDeterminant() {
    final MatrixRing<Z> ring = new MatrixRing<>(5, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{4, 0, 0, 1, 0}, {3, 3, 3, -1, 0}, {1, 2, 4, 2, 3}, {9, 4, 6, 2, 3}, {2, 2, 4, 2, 3}}), Z.ZERO);
    assertEquals(Z.ZERO, ring.det(a));
  }

  public void testZeroPermanent() {
    for (int k = 0; k < 4; ++k) {
      final MatrixRing<Z> ring = new MatrixRing<>(k, Integers.SINGLETON);
      assertEquals(Z.ZERO, ring.permanent(new DefaultMatrix<>(k, k, Z.ZERO)));
    }
  }

  public void testOnePermanent() {
    final MatrixRing<Z> ring = new MatrixRing<>(1, Integers.SINGLETON);
    assertEquals(Z.ONE, ring.permanent(ring.one()));
  }

  public void test2Permanent() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, Integers.SINGLETON);
    final Matrix<Z> m = new DefaultMatrix<>(2, 2, Z.ZERO);
    m.set(0, 0, Z.ONE);
    m.set(0, 1, Z.ONE);
    m.set(1, 0, Z.ONE);
    m.set(1, 1, Z.ONE);
    assertEquals(Z.TWO, ring.permanent(m));
  }

  public void test3Permanent() {
    final MatrixRing<Z> ring = new MatrixRing<>(3, Integers.SINGLETON);
    final Matrix<Z> m = new DefaultMatrix<>(3, 3, Z.ZERO);
    m.set(0, 0, Z.ONE);
    m.set(0, 2, Z.ONE);
    m.set(1, 0, Z.ONE);
    m.set(1, 1, Z.ONE);
    m.set(2, 1, Z.ONE);
    m.set(2, 2, Z.ONE);
    assertEquals(Z.TWO, ring.permanent(m));
  }

  public void testPower() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{1, 2}, {1, 3}}), Z.ZERO);
    assertEquals(ring.one(), ring.pow(a, 0));
    assertEquals(a, ring.pow(a, 1));
    assertEquals("[[11 30][15 41]]", ring.pow(a, 3).toString());
  }

  public void testPowerDiagonal() {
    final MatrixRing<Z> ring = new MatrixRing<>(3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{1, 0, 0}, {0, -3, 0}, {0, 0, 2}}), Z.ZERO);
    assertEquals(ring.one(), ring.pow(a, 0));
    assertEquals(a, ring.pow(a, 1));
    assertEquals("[[1 0 0][0 -243 0][0 0 32]]", ring.pow(a, 5).toString());
  }

  public void testBiggerTriangularDeterminant() {
    final MatrixRing<Z> ring = new MatrixRing<>(5, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{2, 7, -3, 8, 3}, {0, -3, 7, 5, 1}, {0, 0, 6, 7, 6}, {0, 0, 0, 9, 8}, {0, 0, 0, 0, 4}}), Z.ZERO);
    assertEquals(Z.valueOf(-1296), ring.det(a));
  }

  public void testCharacteristicPolynomial() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{1, 3}, {4, 2}}), Z.ZERO);
    final Polynomial<Z> cp = ring.characteristicPolynomial(a);
    assertEquals(2, cp.degree());
    assertEquals("-10-3x+x^2", cp.toString());
  }

  public void testAdjoint() {
    final MatrixRing<Z> ring = new MatrixRing<>(3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{3, 2, -1}, {1, 6, 3}, {2, -4, 0}}), Z.ZERO);
    assertEquals("[[12 4 12][6 2 -10][-16 16 16]]", ring.adj(a).toString());
  }

  public void testDurbin12p3() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(toZ(new long[][] {{3, 1}, {-1, 2}}), Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(toZ(new long[][] {{0, 4}, {5, -2}}), Z.ZERO);
    final Matrix<Z> c = new DefaultMatrix<>(toZ(new long[][] {{-1, -2}, {0, 3}}), Z.ZERO);
    assertEquals("[[2 7][11 0]]", ring.multiply(a, ring.add(b, c)).toString());
  }

  public void testMod1() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(1));
    assertEquals(Z.ONE, ring.size());
    for (final Matrix<Z> m : ring) {
      assertEquals("[[0 0][0 0]]", m.toString());
    }
  }
}
