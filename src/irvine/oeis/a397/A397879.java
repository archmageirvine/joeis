package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397879 Largest integer of the form r^k whose base-n alternating digital root is r and whose number of base-n digits is k.
 * @author Sean A. Irvine
 */
public class A397879 extends Sequence2 {

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
        if (m.mod(mN + 1) == r) {
          best = best.max(m);
        }
        ++k;
      }
    }
    return best;
  }
}
