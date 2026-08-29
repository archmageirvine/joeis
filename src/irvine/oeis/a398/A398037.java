package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001055;

/**
 * A398037 Multiplicative partition persistence of n: number of iterations of the multiplicative partition function A001055 required to reach 1.
 * @author Sean A. Irvine
 */
public class A398037 extends Sequence1 {

  private static final DirectSequence S = new A001055();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    while (!t.isOne()) {
      t = S.a(t);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
