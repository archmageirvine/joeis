package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400534 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A400534 extends Sequence0 {

  // After Felix Huber

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z b = Z.valueOf(mN + 1);
    for (long p = 2; p <= mN; p = Functions.NEXT_PRIME.l(p)) {
      long m = mN;
      Z q = Z.ONE;
      while (m > 0) {
        final long d = m % p;
        q = q.multiply(d + 1);
        m /= p;
      }
      if (q.compareTo(b) < 0) {
        b = q;
      }
      if (b.equals(Z.TWO)) {
        return Z.valueOf(mN - 1);
      }
    }
    return Z.valueOf(mN + 1).subtract(b);
  }
}
