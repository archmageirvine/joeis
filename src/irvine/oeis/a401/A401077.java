package irvine.oeis.a401;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401077 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A401077 extends Sequence0 {

  // Only good for a small number of terms

  private int mN = -1;

  private boolean bump(final Matrix<Q> mat) {
    for (long row = mat.rows() - 1; row >= 0; --row) {
      for (long col = mat.cols() - 1; col >= 0; --col) {
        if (mat.get(row, col).isZero()) {
          mat.set(row, col, Q.ONE);
          return true;
        } else {
          mat.set(row, col, Q.ZERO);
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN < 5) {
      return Z.ZERO;
    }
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    long cnt = 0;
    final Matrix<Q> mat = new DefaultMatrix<>(fld.zero(), Q.ZERO);
    do {
      if (fld.rank(mat) == 5) {
        ++cnt;
      }
    } while (bump(mat));
    return Z.valueOf(cnt);
  }
}
