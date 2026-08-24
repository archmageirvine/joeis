package irvine.oeis.a398;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398928 a(n) = numerator of Sum_{k = 1..n} 2^ceiling(log_2(k))/k.
 * @author Sean A. Irvine
 */
public class A398928 extends Sequence1 {

  private Q mA = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.add(new Q(Z.ONE.shiftLeft(LongUtils.ceilLog2(++mN)), mN));
    return mA.num();
  }
}
