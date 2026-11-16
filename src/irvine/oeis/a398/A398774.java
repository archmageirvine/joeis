package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398774 Number of decimal digits in the sequence S = (n, 2*n, 3*n, ..., n^2).
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
