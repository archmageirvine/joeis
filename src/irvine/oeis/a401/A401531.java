package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401531 Number of n-bit binary significands X for which RN_n(X * RN_n(1/X)) != 1 where RN_n is the rounding to n significant binary bits using round to nearest, ties to even, with an unbounded exponent range.
 * @author Sean A. Irvine
 */
public class A401531 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Z k = Z.ONE.shiftLeft(2 * mN - 1);
    final long h = 1L << (mN - 2);
    long cnt = 0;
    for (long x = 1L << (mN - 1); x < 1L << mN; ++x) {
      final long r = k.mod(x);
      if (r > h && 2 * r < x) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
