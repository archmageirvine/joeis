package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A399081 allocated for Ekaterina Gavrichenko.
 * @author Sean A. Irvine
 */
public class A399081 extends Sequence1 {

  private final Sequence mLcm = new A003418();
  private Z mA = mLcm.next();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mA = mLcm.next();
    }
    return mA.divide(mM).makeOdd();
  }
}
