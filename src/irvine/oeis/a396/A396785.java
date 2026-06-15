package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396785 Primes that do not appear at division steps of A381466.
 * @author Sean A. Irvine
 */
public class A396785 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private long mN = -1;
  private Z mA = Z.FOUR;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (true) {
      while (mSeen.remove(mP)) {
        mP = mPrime.nextPrime(mP);
      }
      if (mSeen.isEmpty() || mP.multiply(6).subtract(2).multiply(mP).compareTo(mN) >= 0) {
        if (++mN > 0) {
          final Z g = Functions.GCD.z(mA, mN);
          if (g.isOne()) {
            mA = mA.add(mN);
          } else {
            mA = Z.valueOf(mN).divide(g);
            if (mA.isProbablePrime()) {
              mSeen.add(mA);
            }
          }
        }
      } else {
        return mP;
      }
    }
  }
}
