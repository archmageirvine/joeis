package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399795 a(n) is the sum of indices k such that n belongs to the set R(k), where R(k) is the set of k consecutive integers centered at k, with k omitted when k is even.
 * @author Sean A. Irvine
 */
public class A399795 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long o = (++mN + 1) / 3;
    final long c = (mN + 2) / 2;
    final long e = (mN + 2) / 3;
    final long f = (mN - 1) / 2;
    return Z.valueOf(mN * mN - o * o + (mN - c + 1) * (mN + c) + Math.max(0, (f - e + 1) * (e + f)));
  }
}
