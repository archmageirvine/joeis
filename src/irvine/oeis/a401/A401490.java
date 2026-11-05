package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A401490 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A401490 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      long cnt = 0;
      for (final Z d : Jaguar.factor(++mM).divisors()) {
        if (Predicates.BRILLIANT.is(d)) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
        if (mVerbose) {
          StringUtils.message("Solution for " + cnt + " is " + mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
