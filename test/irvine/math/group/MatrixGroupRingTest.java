package irvine.math.group;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MatrixGroupRingTest extends TestCase {

  public void testScalarMultiply() {
    final MatrixGroupRing<Z> group = new MatrixGroupRing<>(2, 3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{2, 3, 4}, {1, 3, 1}}), Z.ZERO);
    assertEquals("[[4 6 8][2 6 2]]", group.multiply(a, Z.TWO).toString());
    assertTrue(a == group.multiply(a, Z.ONE));
    assertEquals(group.zero(), group.multiply(a, Z.ZERO));
  }

  public void testScalarMultiplyRationals() {
    final MatrixGroupRing<Q> group = new MatrixGroupRing<>(2, 3, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(new Q[][] {{new Q(9), new Q(-6), Q.THREE}, {Q.ONE, Q.ZERO, new Q(4)}}, Q.ZERO);
    assertEquals("[[3 -2 1][1/3 0 4/3]]", group.multiply(a, Q.ONE_THIRD).toString());
  }

  public void testMultiply() {
    final MatrixGroupRing<Z> group = new MatrixGroupRing<>(2, 3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{1, 2, 4}, {2, 6, 0}}), Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{1}, {-1}, {7}}), Z.ZERO);
    assertEquals("[[27][-4]]", group.multiply(a, b).toString());
  }

  public void testMultiply2() {
    final MatrixGroupRing<Z> group = new MatrixGroupRing<>(2, 2, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{-1, 0}, {0, 2}}), Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{1, 2, 3}, {0, 2, 4}}), Z.ZERO);
    assertEquals("[[-1 -2 -3][0 4 8]]", group.multiply(a, b).toString());
  }

  public void testMultiply3() {
    final MatrixGroupRing<Z> group = new MatrixGroupRing<>(2, 2, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{-1, 0}, {0, 2}}), Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{3, 0}, {0, 6}}), Z.ZERO);
    assertEquals("[[-3 0][0 12]]", group.multiply(a, b).toString());
  }

  public void testMultiply4() {
    final MatrixGroupRing<Z> group = new MatrixGroupRing<>(2, 2, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{-1, 0}, {0, 2}}), Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{3, 4}, {5, 6}}), Z.ZERO);
    assertEquals("[[-3 8][-5 12]]", group.multiply(b, a).toString());
  }

  public void testFrobeniusSquared() {
    final MatrixGroupRing<Z> group = new MatrixGroupRing<>(1, 3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(MatrixRingTest.toZ(new long[][] {{3, 1, 2}}), Z.ZERO);
    assertEquals(Z.valueOf(14), group.frobeniusSquared(a));
  }
}
