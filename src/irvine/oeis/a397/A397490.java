package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397490 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A397490 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final StringBuilder sb = new StringBuilder();
      long q = p;
      for (int k = 0; k < mN; ++k) {
        sb.append(q % 10);
        q = mPrime.nextPrime(q);
      }
      if (new Z(sb.reverse()).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
