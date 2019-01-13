package irvine.math.matrix;

import irvine.math.api.Matrix;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DefaultMatrixTest extends TestCase {

  public void testCons() {
    try {
      new DefaultMatrix<>(-1L, 2L, 0L);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      new DefaultMatrix<>(2L, -1L, 0L);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testOk() {
    final Matrix<Long> m = new DefaultMatrix<>(2L, 2L, 1L);
    assertEquals(1L, m.get(0, 0).longValue());
    assertEquals(1L, m.get(0, 1).longValue());
    assertEquals(1L, m.get(1, 0).longValue());
    assertEquals(1L, m.get(1, 1).longValue());
    m.set(0L, 1L, 42L);
    assertEquals(1L, m.get(0, 0).longValue());
    assertEquals(42L, m.get(0, 1).longValue());
    assertEquals(1L, m.get(1, 0).longValue());
    assertEquals(1L, m.get(1, 1).longValue());
    assertEquals("[[1 42][1 1]]", m.toString());
    assertTrue(m.equals(m));
    assertFalse(m.equals(new DefaultMatrix<>(2L, 2L, 1L)));
    try {
      m.get(-1, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      m.get(2, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      m.get(0, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      m.get(0, 2);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      m.set(-1L, 0L, 85L);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      m.set(2L, 0L, 85L);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      m.set(0L, -1L, 85L);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      m.set(0L, 2L, 85L);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testDirectCons() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{1L, 2L}, {3L, 4L}}, 0L);
    assertEquals(3L, m.get(1, 0).longValue());
    final Matrix<Long> n = new DefaultMatrix<>(new Long[][] {{1L, 2L}, {3L, 4L}}, 0L);
    assertTrue(n.equals(m));
    final Matrix<Long> p = new DefaultMatrix<>(new Long[][] {{1L, 2L}, {3L, 0L}}, 0L);
    assertFalse(n.equals(p));
  }

  public void testSubmatrix() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{1L, 2L, 3L}, {3L, 4L, 1L}, {7L, 8L, 0L}}, 0L);
    final Matrix<Long> n = m.delete(1, 0);
    assertEquals("[[2 3][8 0]]", n.toString());
  }

  public void testSwapRows() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{1L, 2L, 3L}, {3L, 4L, 1L}, {7L, 8L, 0L}}, 0L);
    m.swapRows(0, 2);
    assertEquals("[[7 8 0][3 4 1][1 2 3]]", m.toString());
  }

  public void testTranspose() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{1L, 2L, 3L}, {3L, 4L, 1L}, {7L, 8L, 0L}}, 0L);
    final Matrix<Long> t = m.transpose();
    assertEquals(m, t.transpose());
    assertEquals("[[1 3 7][2 4 8][3 1 0]]", t.toString());
    assertEquals("[[4]]", new DefaultMatrix<>(new Long[][] {{4L}}, 0L).transpose().toString());
    assertEquals("[[1][3][5]]", new DefaultMatrix<>(new Long[][] {{1L, 3L, 5L}}, 0L).transpose().toString());
  }

  public void testDiagonal() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{6L, 0L, 0L, 0L}, {0L, -4L, 0L, 0L}, {0L, 0L, 0L, 0L}, {0L, 0L, 0L, 8L}}, 0L);
    assertTrue(m.isSquare());
    assertTrue(m.isDiagonal());
    m.set(2, 2, 42L);
    assertTrue(m.isDiagonal());
    m.set(2, 1, 43L);
    assertFalse(m.isDiagonal());
    assertTrue(m.isSquare());
    m.set(1, 1, 0L);
    assertFalse(m.isDiagonal());
    m.set(2, 1, 0L);
    assertTrue(m.isDiagonal());
  }

  public void testIsSquare() {
    assertTrue(new DefaultMatrix<>(2L, 2L, 0L).isSquare());
    assertFalse(new DefaultMatrix<>(1L, 2L, 0L).isSquare());
    assertFalse(new DefaultMatrix<>(2L, 1L, 0L).isSquare());
  }

  public void testIsSymmetric() {
    final DefaultMatrix<Long> m = new DefaultMatrix<>(2L, 2L, 0L);
    assertTrue(m.isSymmetric());
    m.set(1, 1, 42L);
    assertTrue(m.isSymmetric());
    m.set(1, 0, 43L);
    assertFalse(m.isSymmetric());
    m.set(0, 1, 43L);
    assertTrue(m.isSymmetric());
    assertFalse(new DefaultMatrix<>(1L, 2L, 0L).isSymmetric());
    assertFalse(new DefaultMatrix<>(2L, 1L, 0L).isSymmetric());
  }

  public void testUpperTriangular() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{1L, 3L, -1L}, {0L, 2L, 4L}, {0L, 0L, 5L}}, 0L);
    assertFalse(m.isDiagonal());
    assertTrue(m.isUpperTriangular());
    assertFalse(m.isLowerTriangular());
    assertTrue(m.transpose().isLowerTriangular());
    m.set(2, 0, 42L);
    assertFalse(m.isUpperTriangular());
    m.set(0, 2, 0L);
    assertFalse(m.isUpperTriangular());
    m.set(2, 0, 0L);
    assertTrue(m.isUpperTriangular());
  }

  public void testLowerTriangular() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{1L, 0L, 0L}, {3L, 2L, 0L}, {-1L, 4L, 5L}}, 0L);
    assertFalse(m.isDiagonal());
    assertTrue(m.isLowerTriangular());
    assertFalse(m.isUpperTriangular());
    assertTrue(m.transpose().isUpperTriangular());
    m.set(0, 2, 42L);
    assertFalse(m.isLowerTriangular());
    m.set(2, 0, 0L);
    assertFalse(m.isLowerTriangular());
    m.set(0, 2, 0L);
    assertTrue(m.isLowerTriangular());
  }
}
