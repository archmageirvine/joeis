package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397756 Numbers i and j both with m digits such that i*j = 10^m*R(i) + j, where R(x) is the digit reversal of x; j may end in 0.
 * @author Sean A. Irvine
 */
public class A397756 extends Sequence0 {

  private Z mLo = Z.TEN;
  private Z mHi = Z.valueOf(100);
  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(mHi) >= 0) {
        mLo = mHi;
        mHi = mHi.multiply(10);
      }
      final Z r = Functions.REVERSE.z(mN);
      final Z[] qr = mHi.multiply(r).divideAndRemainder(mN.subtract(1));
      if (qr[1].isZero() && mLo.compareTo(qr[0]) <= 0 && qr[0].compareTo(mHi) < 0) {
        return mN;
      }
    }
  }
}
