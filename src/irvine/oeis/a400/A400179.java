package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053188 Distance from n to nearest square.
 * @author Sean A. Irvine
 */
public class A400179 extends Sequence0 {

  private long mN = -1;

  private long step(final long n) {
    final long s = Functions.SQRT.l(n);
    final long s2 = s * s;
    final long t2 = (s + 1) * (s + 1);
    return Math.min(Math.abs(s2 - n), Math.abs(n - t2));
  }

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 0) {
      m = step(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

