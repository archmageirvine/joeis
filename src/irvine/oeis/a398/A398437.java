package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A398437 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A398437 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long s = 2;
    while (true) {
      ++s;
      for (long x = 1; 2 * x < s; ++x) {
        final long y = s - x;
        if (Z.valueOf(x).pow(mP).add(Z.valueOf(y).pow(mP)).divide(x + y).isProbablePrime()) {
          return Z.valueOf(s);
        }
      }
    }
  }
}

