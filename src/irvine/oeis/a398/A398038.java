package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398038 a(n) is the number of closed binary operations * on a set N of n elements such that t*(t*t)=(t*t)*t for every t in N (up to equality of operations as functions on N X N into N; i.e., labeled case of elements).
 * @author Sean A. Irvine
 */
public class A398038 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      for (int s = 0; s <= (mN - k) / 2; ++s) {
        for (int r = 0; r <= (mN - k - 2 * s) / 2; ++r) {
          Z inner = Z.ZERO;
          for (int t = 0; t <= mN - k - 2 * s - 2 * r; ++t) {
            final Z m = Binomial.multinomial(mN - s - r, k, s, r, t, mN - k - t - 2 * r - 2 * s);
            inner = inner.signedAdd(((mN + k + r + t) & 1) == 0, m.multiply(n.pow(k + s + t)));
          }
          sum = sum.add(inner.multiply(Functions.FACTORIAL.z(mN)).shiftRight(s + r).divide(Functions.FACTORIAL.z(mN - s - r)));
        }
      }
    }
    return sum.multiply(n.pow((long) mN * mN - 2L * mN));
  }
}
