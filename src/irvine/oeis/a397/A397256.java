package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397256 Square array T(n,k) = product of digits of k &gt;= 1 in base n &gt;= 2, read by falling antidiagonals.
 * @author Sean A. Irvine
 */
public class A397256 extends Sequence2 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Functions.DIGIT_PRODUCT.z(n, m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 2, mN - mM + 1);
  }
}
