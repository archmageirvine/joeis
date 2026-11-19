package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401991 allocated for Ridouane Oudra.
 * @author Sean A. Irvine
 */
public class A401991 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicLongArray mC = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mC.length()) {
      ++mN;
      mM = 0;
      for (long k = 1; k <= mN; ++k) {
        mA.add(k * mN, k == mN ? 1 : 2);
      }
      mC.truncate(0);
      for (long k = 1; k < mA.length(); ++k) {
        mC.increment(mA.get(k));
      }
    }
    return Z.valueOf(mC.get(mM));
  }
}
