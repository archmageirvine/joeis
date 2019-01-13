package irvine.math.group;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class VectorSpaceOverFieldTest extends TestCase {

  public void testNorm() {
    final VectorSpaceOverField<Q> vs = new VectorSpaceOverField<>(3, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(MatrixFieldTest.toQ(new long[][] {{4, -1, 2}}), Q.ZERO);
    final Matrix<Q> u = new DefaultMatrix<>(MatrixFieldTest.toQ(new long[][] {{2, -1, 3}}), Q.ZERO);
    final Matrix<Q> proj = vs.projection(u, a);
    assertEquals("[[20/7 -5/7 10/7]]", proj.toString());
  }
}
