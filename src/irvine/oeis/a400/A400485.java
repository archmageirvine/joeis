package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400485 allocated for James C. McMahon.
 * @author Sean A. Irvine
 */
public class A400485 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.add(mN);
      mA = t.isOdd() ? t : t.divide2();
    }
    return mA;
  }
}

