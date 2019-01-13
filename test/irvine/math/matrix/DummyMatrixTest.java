package irvine.math.matrix;

import irvine.math.api.Matrix;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyMatrixTest extends TestCase {

  public void test() {
    final DefaultMatrix<Long> m = new DefaultMatrix<>(2, 1, 0L);
    m.set(0, 0, 42L);
    m.set(1, 0, 17L);
    assertEquals(1, m.cols());
    assertEquals(2, m.rows());
    assertEquals("[[42][17]]", m.toString());
    assertFalse(m.isSquare());
    assertEquals(58, m.hashCode());
    final Matrix<Long> t = m.transpose();
    assertEquals(2, t.cols());
    assertEquals(1, t.rows());
  }

  public void testSquare() {
    assertTrue(new DefaultMatrix<>(2, 2, 0L).isSquare());
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
    assertTrue(m.transpose().isSymmetric());
    assertFalse(new DefaultMatrix<>(1L, 2L, 0L).isSymmetric());
    assertFalse(new DefaultMatrix<>(2L, 1L, 0L).isSymmetric());
  }
}
