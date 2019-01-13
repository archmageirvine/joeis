package irvine.math.group;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class VectorSpaceTest extends TestCase {

  public void testNorm() {
    final VectorSpace<Z> vs = new VectorSpace<>(2, Integers.SINGLETON);
    assertTrue(vs.contains(vs.zero()));
    assertEquals(1, vs.rows());
    assertEquals(2, vs.cols());
    assertEquals("M_{1,2}(\\Z)", vs.toString());
    final Matrix<Z> a = new DefaultMatrix<>(new Z[][] {{Z.THREE, Z.FOUR}}, Z.ZERO);
    assertEquals(Z.FIVE, vs.norm(a));
    assertFalse(vs.isUnitVector(a));
    assertTrue(vs.isUnitVector(new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE}}, Z.ZERO)));
    assertTrue(vs.isUnitVector(new DefaultMatrix<>(new Z[][] {{Z.ONE, Z.ZERO}}, Z.ZERO)));
  }

  public void testDotProduct() {
    final VectorSpace<Z> vs = new VectorSpace<>(3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(new Z[][] {{Z.TWO, Z.NEG_ONE, Z.ONE}}, Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(new Z[][] {{Z.ONE, Z.ONE, Z.TWO}}, Z.ZERO);
    assertEquals(Z.THREE, vs.dotProduct(a, b));
  }

}
