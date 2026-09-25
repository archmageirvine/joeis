package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399973 a(n) is the sum of sigma (A000203), over the integers smaller or equal to n, that are not coprime to n.
 * @author Sean A. Irvine
 */
public class A399973 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) != 1) {
        sum = sum.add(Functions.SIGMA1.z(k));
      }
    }
    return sum;
  }
}
