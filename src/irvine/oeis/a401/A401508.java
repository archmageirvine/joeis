package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401508 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A401508 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = mN;
    while (true) {
      p = mPrime.nextPrime(p);
      if ((p - 1) % mN == 0 && Z.TWO.modPow((p - 1) / mN, Z.valueOf(p)).isOne()) {
        return Z.valueOf(p);
      }
    }
  }
}

