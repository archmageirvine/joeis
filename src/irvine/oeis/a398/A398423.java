package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A398423 Largest integer of the form r^k whose weighted base-n digit sum is r and whose number of base-n digits is k.
 * @author Sean A. Irvine
 */
public class A398423 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z best = Z.ONE;
    for (long r = 1; r < mN; ++r) {
      long k = 1;
      while (true) {
        final Z m = Z.valueOf(r).pow(k);
        final long l = Functions.DIGIT_LENGTH.l(mN, m);
        if (l < k) {
          break;
        }
        if (Functions.WEIGHTED_DIGIT_SUM.l(mN, m) == r) {
          best = best.max(m);
        }
        ++k;
      }
    }
    return best;
  }
}
