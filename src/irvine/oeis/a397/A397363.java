package irvine.oeis.a397;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.LambdaMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397363 a(n) is the trace of the product of two Hankel n X n matrices M_n and N_n whose M[i,j] and N[i,j] generic elements are respectively (i+j) in base 10 and (i+j) written in base 3 but then read as it were written in base 10.
 * @author Sean A. Irvine
 */
public class A397363 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final LambdaMatrix<Z> mat1 = new LambdaMatrix<>(mN, mN, Z.ZERO, (i, j) -> Z.valueOf(i + j), 1);
    final LambdaMatrix<Z> mat2 = new LambdaMatrix<>(mN, mN, Z.ZERO, (i, j) -> new Z(Long.toString(i + j, 3)), 1);
    final MatrixField<Z> fld = new MatrixField<>(mN, IntegerField.SINGLETON);
    return fld.trace(fld.multiply(mat1, mat2));
  }
}

