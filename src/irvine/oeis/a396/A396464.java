package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A396464 a(1) = a(2) = 1. For even n, a(n) = a(n-1) + a(n-2). For odd n, a(n) = a(n-1) divided by the largest proper factor found in the previous terms. If no proper factor is present, then a(n) = a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A396464 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private Z mA = null;
  private Z mB = null;
  private boolean mEven = true;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      mSeen.set(1L);
      return Z.ONE;
    }
    mEven = !mEven;
    Z t = mA.add(mB);
    if (!mEven) {
      final Z[] d = Jaguar.factor(mB).divisorsSorted();
      for (int k = d.length - 2; k > 0; --k) {
        if (mSeen.isSet(d[k].longValue())) {
          t = mB.divide(d[k]);
          break;
        }
      }
    }
    mA = mB;
    mB = t;
    mSeen.set(mB.longValueExact());
    return mB;
  }
}

