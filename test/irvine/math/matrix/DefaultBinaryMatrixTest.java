package irvine.math.matrix;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DefaultBinaryMatrixTest extends TestCase {

  public void test() {
    final DefaultBinaryMatrix m = new DefaultBinaryMatrix(2, 3);
    assertEquals(2, m.rows());
    assertEquals(3, m.cols());
    assertFalse(m.get(0, 0));
    m.set(0, 0, Boolean.TRUE);
    assertTrue(m.get(0, 0));
    assertEquals(1, m.popcount());
    m.set(1, 2, Boolean.TRUE);
    assertFalse(m.isDiagonal());
    final DefaultBinaryMatrix i = DefaultBinaryMatrix.identity(3);
    assertEquals(3, i.cols());
    assertEquals(3, i.rows());
    assertEquals(3, i.popcount());
    assertTrue(i.get(0, 0));
    assertTrue(i.get(1, 1));
    assertTrue(i.get(2, 2));
    assertFalse(i.get(2, 1));
    i.swapRows(1, 2);
    assertEquals(3, i.cols());
    assertEquals(3, i.rows());
    assertEquals(3, i.popcount());
    assertFalse(i.get(2, 2));
    assertTrue(i.get(2, 1));
  }
}
