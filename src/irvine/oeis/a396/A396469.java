package irvine.oeis.a396;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396469 allocated for Nakul Badjatya.
 * @author Sean A. Irvine
 */
public class A396469 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final ArrayList<Long> mA = new ArrayList<>();
  private long mP = 1;

  private boolean is(final long n, final int pos) {
    if (n == 0) {
      return true;
    }
    if (pos >= mA.size()) {
      return false;
    }
    for (int k = pos; k < mA.size(); ++k) {
      final long p = mA.get(k);
      if (p > n) {
        return false;
      }
      long q = p;
      while (q <= n) {
        if (is(n - q, k + 1)) {
          return true;
        }
        q *= p;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!is(mP, 0)) {
        mA.add(mP);
        return Z.valueOf(mP);
      }
    }
  }
}
