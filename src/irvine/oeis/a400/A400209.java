package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400209 allocated for Giacomo Ambrosini.
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

