package irvine.oeis.a397;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397445 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A397445 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final DefaultMatrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        Z sum = Z.ZERO;
        for (int k = 0; k <= j; ++k) {
          sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(j, k).multiply(Binomial.binomial(mN - 1 - j, i - k)));
        }
        m.set(i, j, sum);
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}
