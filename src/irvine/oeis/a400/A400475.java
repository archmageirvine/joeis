package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400475 The number of integers k such that 2^n+2^k-1 is a prime, for 0 &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A400475 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    long cnt = 0;
    Z u = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      u = u.multiply2().add(1); // u is 11111... in binary (i.e. 2^k-1)
      if (t.add(u).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

