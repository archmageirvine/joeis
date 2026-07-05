package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A397411 Smallest number k such that bigomega(k+i) and omega(k+i), for i=0..n, but not for i=n+1, are both prime.
 * @author Sean A. Irvine
 */
public class A397411 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  private int count(long m) {
    int cnt = 0;
    while (Predicates.PRIME.is(Functions.OMEGA.i(m)) && Predicates.PRIME.is(Functions.BIG_OMEGA.l(m))) {
      ++cnt;
      ++m;
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final int cnt = count(++mM);
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
