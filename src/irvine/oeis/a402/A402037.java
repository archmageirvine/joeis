package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002182;
import irvine.oeis.a057.A057641;

/**
 * A402037 Values of A057641 whose indices are highly composite numbers A002182.
 * @author Sean A. Irvine
 */
public class A402037 extends Sequence1 {

  private final Sequence mA = new A057641();
  private final Sequence mH = new A002182();
  private long mN = 0;
  private Z mT = null;

  @Override
  public Z next() {
    final long hc = mH.next().longValueExact();
    while (mN < hc) {
      mT = mA.next();
      ++mN;
    }
    return mT;
  }
}
