package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a174.A174973;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A398694 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A398694 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mS = new A174973();
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = mS.next();
      int cnt = 0;
      for (final Z d : Jaguar.factor(t).divisors()) {
        if (d.isOdd()) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == null) {
        mFirsts.set(cnt, t);
        if (mVerbose) {
          StringUtils.message("Solution for n=" + cnt + " is " + t);
        }
      }
    }
    return mFirsts.get(mN);
  }
}
