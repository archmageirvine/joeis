package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A396256 Smallest number k such that reverse(k)^i &lt;= reverse(k^i), for i=1..n, but not for i=n+1, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A396256 extends Sequence1 {

  private static final int LIMIT = 100;
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    if (++mN > LIMIT) {
      throw new UnsupportedOperationException();
    }
    while (mFirsts.get(mN) == 0) {
      if (++mM % 10 == 0 || mM == 31) {
        continue;
      }
      final long r = Functions.REVERSE.l(mM);
      Z k = Z.valueOf(mM);
      Z j = Z.valueOf(r);
      int cnt = 0;
      while (j.compareTo(Functions.REVERSE.z(k)) <= 0) {
        if (++cnt > LIMIT) {
          break;
        }
        k = k.multiply(mM);
        j = j.multiply(r);
      }
      if (cnt <= LIMIT && mFirsts.get(cnt) == 0) {
        if (mVerbose) {
          StringUtils.message("Solution for n=" + cnt + " is " + mM);
        }
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

