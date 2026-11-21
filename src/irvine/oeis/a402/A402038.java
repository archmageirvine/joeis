package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A402038 a(n) is the number of integers k such that k - reversal of k in base 3 = 2*n.
 * @author Sean A. Irvine
 */
public class A402038 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private long mM = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    mN += 2;
    if (mN >= mLim) {
      mLim *= 3;
      final long end = mLim * mLim;
      do {
        final long t = ++mM - Functions.REVERSE.l(3, mM);
        if (t > 0) {
          mA.increment(t);
        }
      } while (mM < end);
    }
    return Z.valueOf(mA.get(mN));
  }
}
