package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003285;

/**
 * A401844 allocated for Oleg Smolyakov.
 * @author Sean A. Irvine
 */
public class A401844 extends Sequence1 {

  private final DirectSequence mA = new A003285();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final long end = (mN + 1) * (mN + 1);
    for (long k = mN * mN + 1; k < end; ++k) {
      if (mA.a(k).isEven()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
