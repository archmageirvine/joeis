package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400209 Number of steps to reach a prime under x -&gt; p*(x - p), with p being the largest prime &lt; x, starting at x = n, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A400209 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z x = Z.valueOf(++mN);
    long cnt = 0;
    while (!x.isProbablePrime()) {
      final Z p = Functions.PREV_PRIME.z(x);
      x = p.multiply(x.subtract(p));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

