package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397338 In the prime race that counts the 40 mod 100 residues 10k + {1,3,7,9} (k = 0...9), primes at which one of the residues leads for the first time.
 * @author Sean A. Irvine
 */
public class A397338 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mMax = 0;
  private final boolean[] mReported = new boolean[100];
  private final long[] mCounts = new long[100];

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final int r = (int) (mP % 100);
      final long cnt = ++mCounts[r];
      if (cnt > mMax) {
        mMax = cnt;
        if (!mReported[r]) {
          mReported[r] = true;
          return Z.valueOf(mP);
        }
      }
    }
  }
}
