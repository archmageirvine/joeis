package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A401946 allocated for Adam Onus.
 * @author Sean A. Irvine
 */
public class A401946 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private long mM = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 2;
      final long end = mLim * mLim;
      do {
        final long t = ++mM - Functions.REVERSE.l(2, mM);
        if (t > 0) {
          mA.increment(t);
        }
      } while (mM < end);
    }
    return Z.valueOf(mA.get(mN));
  }
}
