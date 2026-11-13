package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398774 allocated for Amelia S. Krogulska.
 * @author Sean A. Irvine
 */
public class A398774 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.DIGIT_LENGTH.l(k * mN));
    }
    return sum;
  }
}
