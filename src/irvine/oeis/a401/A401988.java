package irvine.oeis.a401;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401988
 * @author Sean A. Irvine
 */
public class A401988 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int l = 2 * mN;
    final int size = l * l;
    final Matrix<Z> k = new DefaultMatrix<>(size, size, Z.ZERO);
    // Directions: (1,0), (0,1), (1,1).
    final int[] dx = {1, 0, 1};
    final int[] dy = {0, 1, 1};
    for (int x = 0; x < l; ++x) {
      for (int y = 0; y < l; ++y) {
        final int i = x * l + y;
        for (int d = 0; d < 3; ++d) {
          final int x2 = x + dx[d];
          final int y2 = y + dy[d];
          if (x2 < l && y2 < l) {
            final int j = x2 * l + y2;
            final int s = d < 2 && (x & 1) == 0 ? -1 : 1;
            k.set(i, j, Z.valueOf(s));
            k.set(j, i, Z.valueOf(-s));
          }
        }
      }
    }
    return new MatrixField<>(k.rows(), IntegerField.SINGLETON).det(k).sqrt();
  }
}
