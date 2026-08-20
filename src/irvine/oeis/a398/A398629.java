package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398629 allocated for Bar\u0131\u015f Kocaba\u015f.
 * @author Sean A. Irvine
 */
public class A398629 extends Sequence0 {

  private int mN = -1;

  private Z c(final int m2, final int m3, final int m4, final int m5, final int m6) {
    final int s = m2 + m3 + m4 + m5 + m6;
    final int l = m2 + 2 * m3 + 3 * m4 + 4 * m5 + 5 * m6 + 1;
    return Functions.FACTORIAL.z(s + l - 1)
      .divide(Functions.FACTORIAL.z(m2))
      .divide(Functions.FACTORIAL.z(m3))
      .divide(Functions.FACTORIAL.z(m4))
      .divide(Functions.FACTORIAL.z(m5))
      .divide(Functions.FACTORIAL.z(m6))
      .divide(Functions.FACTORIAL.z(l));
  }

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN; ++j) {
        for (int k = 0; k <= mN; ++k) {
          for (int l = 0; l <= mN; ++l) {
            final Z t = Binomial.multinomial(i + j + k + l, i, j, k, l).multiply(c(mN + 1 + i + j + k + l, mN - i, mN - j, mN - k, mN - l));
            res = res.signedAdd(((i + j + k + l) & 1) == 0, t);
          }
        }
      }
    }
    return res;
  }
}
