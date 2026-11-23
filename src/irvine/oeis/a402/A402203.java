package irvine.oeis.a402;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402203 Smallest prime whose tree of most central Goldbach partitions has height n.
 * @author Sean A. Irvine
 */
public class A402203 extends Sequence0 {

  private final Fast mPrimes = new Fast();
  // Height of each prime encountered
  private final Map<Long, Integer> mHeight = new HashMap<>();
  // The next prime to examine
  private long mP = 7;
  // The next record height to be attained
  private int mNextHeight = 1;

  @Override
  public Z next() {
    if (mHeight.isEmpty()) {
      mHeight.put(3L, 0);
      mHeight.put(5L, 0);
      return Z.THREE;
    }

    while (true) {
      final long p = mP;
      mP = mPrimes.nextPrime(p);
      // Find the most central prime partition: p - 1 = (m - k) + (m + k).
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
      if (height == mNextHeight) {
        ++mNextHeight;
        return Z.valueOf(p);
      }
    }
  }
}
