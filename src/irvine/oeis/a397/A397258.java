package irvine.oeis.a397;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a067.A067836;

/**
 * A397258 Indices of late birds in Buss's sequence B = A067836: numbers m such that all smaller primes have occurred before B(m).
 * @author Sean A. Irvine
 */
public class A397258 extends A067836 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mBuss = new TreeSet<>();
  private Z mP = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z b = super.next();
      mBuss.add(b);
      while (mBuss.remove(mP)) {
        mP = mPrime.nextPrime(mP);
      }
      if (b.compareTo(mP) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
