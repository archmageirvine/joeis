package irvine.oeis.a400;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400463 Numbers of the form abs(k - reversal of k in base 2) for at least one k (written in base 10).
 * @author Sean A. Irvine
 */
public class A400463 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mPrev = -1;
  private long mM = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || 2 * (Functions.DIGIT_LENGTH.l(2, mA.first()) + 1) >= Functions.DIGIT_LENGTH.i(2, mLim)) {
      while (mM < mLim) {
        final long t = Math.abs(mM - Functions.REVERSE.l(2, mM));
        if (t > mPrev) {
          mA.add(t);
        }
        ++mM;
      }
      mLim *= 2;
    }
    mPrev = mA.pollFirst();
    return Z.valueOf(mPrev);
  }
}
