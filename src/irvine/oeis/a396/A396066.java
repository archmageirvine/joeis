package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A396066 allocated for Hoang Nguyen.
 * @author Sean A. Irvine
 */
public class A396066 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;
  private long mLeastUnused = 2;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (mUsed.isSet(mLeastUnused)) {
        ++mLeastUnused;
      }
      long k = mLeastUnused;
      while (true) {
        if (!mUsed.isSet(k)) {
          final Z t = Z.valueOf(k);
          final Z t4 = t.pow(4);
          if (t4.add(mA).isProbablePrime()) {
            mUsed.set(k);
            mA = t4;
            return t;
          }
        }
        ++k;
      }
    }
    return mA;
  }
}
