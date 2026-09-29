package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400219 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A400219 extends Sequence1 {

  // After Robert Israel

  private int mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN++;
    final long n4 = (long) mN * mN * mN * mN;
    // Sum of 4th powers from 1 to n-1: sum = (n-1)*n*(2n-1)*(3(n-1)^2 + 3(n-1) - 1) / 30
    long sumPrev4th = 0;
    for (int j = 1; j < mN; j++) {
      sumPrev4th += (long) j * j * j * j;
    }
    // dp[s] will store the number of subsets of {1^4, 2^4, ..., (n-1)^4} summing to s
    final long[] dp = new long[(int) sumPrev4th + 1];
    dp[0] = 1;
    for (int j = 1; j < mN; j++) {
      final long j4 = (long) j * j * j * j;
      for (int s = (int) sumPrev4th; s >= j4; s--) {
        dp[s] += dp[(int) (s - j4)];
      }
    }
    // Upper bound for x
    final long totalSum4th = sumPrev4th + n4;
    final long maxX = (long) Math.floor(Math.pow(totalSum4th, 0.25));
    long fn = 0;
    for (long x = mN; x <= maxX; x++) {
      final long target = x * x * x * x - n4;
      if (target <= sumPrev4th) {
        fn += dp[(int) target];
      }
    }
    mSum = mSum.add(fn);
    return mSum;
  }
}
