package irvine.oeis.a395;

import java.util.LinkedList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A395928 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A395928 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private final LinkedList<Long> mA = new LinkedList<>();
  private long mN = 1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (mPrime.isPrime(++mN)) {
        mA.add(mN);
      } else {
        long q = mN;
        while (q > 1) {
          q = mPrime.prevPrime(q);
          if (mPrime.isPrime(mN - q)) {
            mA.add(q);
            mA.add(mN - q);
            break;
          }
        }
      }
      if (mA.isEmpty()) {
        // we need 3 parts
        long q = mN;
        outer:
        while (q > 1) {
          q = mPrime.prevPrime(q);
          final long t = mN - q;
          long p = t;
          while (p > 1) {
            p = mPrime.prevPrime(p);
            if (mPrime.isPrime(t - p)) {
              mA.add(q);
              mA.add(p);
              mA.add(t - p);
              break outer;
            }
          }
        }
      }
      if (mA.isEmpty()) {
        throw new UnsupportedOperationException();
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
