package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a394.A394611;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A394611.
 * @author Sean A. Irvine
 */
public class A397471 extends Sequence1 {

  private final Sequence mS = new A394611();
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mM = 4;
  private long mMax = 0;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      while (mMax < 2 * mM) {
        final long v = mS.next().longValueExact();
        mSeen.set(v);
        if (v > mMax) {
          mMax = v;
        }
      }
      if (!mSeen.isSet(mM)) {
        return Z.valueOf(mM);
      }
    }
  }
}
