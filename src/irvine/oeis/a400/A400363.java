package irvine.oeis.a400;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400363 allocated for Edward Schmidt.
 * @author Sean A. Irvine
 */
public class A400363 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 3) == 1) {
        final long lim = mP / 2;
        for (long x = 1; x * x <= lim; ++x) {
          final long y2 = mP - x * x;
          if (Predicates.SQUARE.is(y2) && Z.valueOf(y2 - x * x).pow(4).add(Z.valueOf(x * Functions.SQRT.l(y2) * 2).pow(4)).isProbablePrime()) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}
