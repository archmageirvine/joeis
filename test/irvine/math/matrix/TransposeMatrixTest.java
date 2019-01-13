package irvine.math.matrix;

import irvine.math.api.Matrix;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class TransposeMatrixTest extends TestCase {

  public void testTranspose() {
    final Matrix<Long> m = new DefaultMatrix<>(new Long[][] {{1L, 2L, 3L}, {3L, 4L, 1L}}, 0L);
    final Matrix<Long> t = m.transpose();
    assertTrue(m == t.transpose());
    assertEquals("[[1 3][2 4][3 1]]", t.toString());
    assertEquals(2, t.cols());
    assertEquals(3, t.rows());
    assertEquals(2L, t.get(1, 0).longValue());
    t.set(1L, 0L, 42L);
    assertEquals(42L, t.get(1, 0).longValue());
  }
}
