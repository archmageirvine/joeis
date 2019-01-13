package irvine.math.matrix;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.r.Reals;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CholeskyTest extends TestCase {

  public void test() {
    final DefaultMatrix<Double> m = new DefaultMatrix<>(new Double[][] {{4.0, 12.0, -16.0}, {12.0, 37.0, -43.0}, {-16.0, -43.0, 98.0}}, 0.0);
    final Matrix<Double> r = Cholesky.decomposition(Reals.SINGLETON, m);
    assertEquals("[[2.0 6.0 -8.0][0.0 1.0 5.0][0.0 0.0 3.0]]", r.toString());
    assertTrue(r.isUpperTriangular());
    assertEquals(m, new MatrixRing<>(3, Reals.SINGLETON).multiply(r.transpose(), r));
  }

//  public void test2() {
//    final DefaultMatrix<Double> m = new DefaultMatrix<>(new Double[][] {
//      {4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0},
//      {2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0},
//      {1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0},
//      {1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0},
//      {1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0},
//      {0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0},
//      {-1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0},
//      {-2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0},
//      {-1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0},
//      {-1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0},
//      {-2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0, -1.0},
//      {-1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0, 0.0},
//      {0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0, 1.0},
//      {1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0, 1.0},
//      {1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0, 1.0},
//      {1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0, 2.0},
//      {2.0, 1.0, 1.0, 1.0, 0.0, -1.0, -2.0, -1.0, -1.0, -2.0, -1.0, 0.0, 1.0, 1.0, 1.0, 2.0, 4.0}
//    }, 0.0);
//    final Matrix<Double> r = Cholesky.decomposition(Reals.SINGLETON, m);
//    // ok so r is not integral! Cannot use integer based LLL
//    final MatrixField<Double> fld = new MatrixField<>(17, Reals.SINGLETON);
//    // unfortunately cannot exact recover M
//    assertEquals(m, fld.multiply(r.transpose(), r));
//    // but also the following inverse fails an assertion test
//    final Matrix<Double> ri = fld.inverse(r);
//    System.out.println(fld.multiply(r, ri));
//    assertEquals("", ri.toString());
//
//  }
}
