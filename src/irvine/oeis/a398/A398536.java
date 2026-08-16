package irvine.oeis.a398;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.LambdaMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398536 a(n) is the trace of the Hankel n X n matrix M_n whose M_n(i,j) generic element is n^(i+j).
 * @author Sean A. Irvine
 */
public class A398536 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final LambdaMatrix<Z> mat = new LambdaMatrix<>(mN, mN, Z.ZERO, (i, j) -> n.pow(i + j), 1);
    return new MatrixField<>(mN, IntegerField.SINGLETON).trace(mat);
  }
}

