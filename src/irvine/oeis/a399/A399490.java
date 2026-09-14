package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399490 Sum of squares of the elements of R(n), where R(n) is the set of n consecutive integers centered at n, with the center n omitted when n is even.
 * @author Sean A. Irvine
 */
public class A399490 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(13 * mN * mN + 3 * mN + 2).multiply(mN).divide(12)
      : Z.valueOf(13 * mN * mN - 1).multiply(mN).divide(12);
  }
}
