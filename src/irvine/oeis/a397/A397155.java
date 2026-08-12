package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397155 Least prime p such that n^3 - p is semiprime.
 * @author Sean A. Irvine
 */
public class A397155 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    final Z n3 = Z.valueOf(++mN).pow(3);
    Z p = Z.TWO;
    while (p.compareTo(n3) < 0) {
      if (Predicates.SEMIPRIME.is(n3.subtract(p))) {
        return p;
      }
      p = mPrime.nextPrime(p);
    }
    return Z.ZERO;
  }
}
