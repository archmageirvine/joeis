package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A396944 a(n) is the smallest integer k such that the iterated multiplicative-order chain k -&gt; ord_k(2) -&gt; ord_{ord_k(2)}(2) -&gt; ... reaches an even number in exactly n steps.
 * @author Sean A. Irvine
 */
public class A396944 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 1;

  private int count(long n) {
    int cnt = 0;
    while ((n & 1) == 1) {
      n = Functions.ORDER.l(n, 2);
      ++cnt;
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
