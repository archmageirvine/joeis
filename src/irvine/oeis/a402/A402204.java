package irvine.oeis.a402;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402204: Largest prime of each height in the prime partition tree.
 * @author Sean A. Irvine
 */
public class A402204 extends Sequence0 {

  private final Fast mPrimes = new Fast();
  // Height of each prime encountered.
  private final Map<Long, Integer> mHeight = new HashMap<>();
  // Largest prime found at each height.
  private final Map<Integer, Long> mLargest = new HashMap<>();
  // Next prime to process.
  private long mP = 7;
  // Current requested height.
  private int mN = 0;

  @Override
  public Z next() {
    if (mHeight.isEmpty()) {
      mHeight.put(3L, 0);
      mHeight.put(5L, 0);
      mLargest.put(0, 5L);
    }

    // Upper bound for the largest prime of height mN.
    final Z bound = Z.valueOf(6).shiftLeft(mN).subtract(1);
    while (Z.valueOf(mP).compareTo(bound) <= 0) {
      final long p = mP;
      mP = mPrimes.nextPrime(p);
      // Find the most central prime partition:  // p - 1 = (m - k) + (m + k).
      final long m = (p - 1) / 2;
      long k = 0;
      long q1;
      long q2;
      do {
        q1 = m - k;
        q2 = m + k;
        ++k;
      } while (mPrimes.nextPrime(q1 - 1) != q1 || mPrimes.nextPrime(q2 - 1) != q2);
      final int height = 1 + Math.max(mHeight.get(q1), mHeight.get(q2));
      mHeight.put(p, height);
      mLargest.put(height, p);
    }
    return Z.valueOf(mLargest.get(mN++));
  }
}
