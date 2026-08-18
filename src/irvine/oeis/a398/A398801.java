package irvine.oeis.a398;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398801 allocated for Gnouma Jerome Kadouno.
 * @author Sean A. Irvine
 */
public class A398801 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLo = Z.TEN;
  private Z mHi = Z.valueOf(100);
  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().multiply(10).compareTo(mA.last()) > 0) {
      mN = mN.add(1);
      if (mN.compareTo(mHi) >= 0) {
        mLo = mHi;
        mHi = mHi.multiply(10);
      }
      final Z r = Functions.REVERSE.z(mN);
      final Z[] qr = mHi.multiply(r).divideAndRemainder(mN.subtract(1));
      if (qr[1].isZero() && mLo.compareTo(qr[0]) <= 0 && qr[0].compareTo(mHi) < 0) {
        mA.add(mN.multiply(qr[0]));
      }
    }
    return mA.pollFirst();
  }
}
