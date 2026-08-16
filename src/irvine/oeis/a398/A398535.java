package irvine.oeis.a398;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.LambdaMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398535 a(n) is the trace of the product of two Hankel n X n matrices M_n and N_n whose M[i,j] generic elements are respectively (i+j)^2 and (i+j)^3.
 * @author Sean A. Irvine
 */
public class A398535 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final LambdaMatrix<Z> mat2 = new LambdaMatrix<>(mN, mN, Z.ZERO, (i, j) -> Z.valueOf(i + j).square(), 1);
    final LambdaMatrix<Z> mat3 = new LambdaMatrix<>(mN, mN, Z.ZERO, (i, j) -> Z.valueOf(i + j).pow(3), 1);
    final MatrixField<Z> fld = new MatrixField<>(mN, IntegerField.SINGLETON);
    return fld.trace(fld.multiply(mat2, mat3));
  }
}

