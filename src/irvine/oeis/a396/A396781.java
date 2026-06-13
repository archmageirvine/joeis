package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396781 a(n) is the largest integer of the form r^k (with 0 &lt; r &lt; n and k &gt; 0) whose base-n digital root is r, and whose number of digits in base-n is k.
 * @author Sean A. Irvine
 */
public class A396781 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long r = 1; r < mN; ++r) {
      long k = 1;
      while (true) {
        final Z n = Z.valueOf(r).pow(k);
        if (Functions.DIGIT_LENGTH.l(mN, n) < k) {
          break;
        }
        if (n.subtract(1).mod(mN - 1) + 1 == r) {
          max = max.max(n);
        }
        ++k;
      }
    }
    return max;
  }
}
