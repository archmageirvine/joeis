package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A398930 The smallest prime divisor of Sum_{k=1..n} k^(k^k).
 * @author Sean A. Irvine
 */
public class A398930 extends Sequence2 {

  private long mN = 1;
  private Z mSum = Z.ONE;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    mSum = n.pow(n.pow(mN)).add(mSum);
    return Functions.LPF.z(mSum);
  }
}
