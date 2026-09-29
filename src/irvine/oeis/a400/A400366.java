package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a080.A080075;

/**
 * A400366 allocated for Chai Wah Wu.
 * @author Sean A. Irvine
 */
public class A400366 extends Sequence0 {

  private final Sequence mProth = new A080075();
  private long mA = mProth.next().longValueExact();
  private Z mCount = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == mA) {
      mCount = mCount.add(1);
      mA = mProth.next().longValueExact();
    }
    return mCount;
  }
}

