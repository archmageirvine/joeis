package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A401981 Number of n-bit primes of the form 2^i +- 2^j + 1 with i &gt; j &gt;= 2.
 * @author Sean A. Irvine
 */
public class A401981 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    final Z tp = Z.ONE.shiftLeft(++mN - 1).add(1);
    long cnt = tp.isProbablePrime() ? 1 : 0;
    for (long j = 2; j < mN - 1; ++j) {
      final Z u = Z.ONE.shiftLeft(j);
      if (tp.add(u).isProbablePrime()) {
        ++cnt;
      }
    }
    final Z tm = Z.ONE.shiftLeft(mN).add(1);
    for (long j = 2; j < mN - 2; ++j) {
      final Z u = Z.ONE.shiftLeft(j);
      if (tm.subtract(u).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
