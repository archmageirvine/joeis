package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399288 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A399288 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ONE;
    for (long p = 2; p <= mN; p = Functions.NEXT_PRIME.l(p)) {
      // Exponent of p in n!, by Legendre's formula
      long e = 0;
      long q = p;
      while (q <= mN) {
        e += mN / q;
        if (q > mN / p) {
          break;
        }
        q *= p;
      }
      // C(e+n-1, n-1)
      result = result.multiply(Binomial.binomial(e + mN - 1, mN - 1));
    }
    return result;
  }
}
