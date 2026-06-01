package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395863 allocated for Gordon Hamilton.
 * @author Sean A. Irvine
 */
public class A395863 extends Sequence1 {

  // After David A. Corneth

  private long mN = 0;

  private Z maxNext(final Z c, final long n) {
    Z res = Z.ZERO;
    for (long i = 2; i <= n; ++i) {
      final Z minP = c.divide(i).multiply(i);
      final Z maxP = minP.add(i);
      if (maxP.subtract(c).compareTo(c.subtract(minP)) < 0) {
        if (maxP.compareTo(res) > 0) {
          res = maxP;
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    Z c = Z.valueOf(++mN);
    long cnt = 0;
    while (c.signum() > 0) {
      c = maxNext(c, mN);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

