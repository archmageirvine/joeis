package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A402173 Number of primes p &lt; 10^n such that p+2, 2p+1, 2p+3 are also primes.
 * @author Sean A. Irvine
 */
public class A402173 extends A001359 {

  private Z mP = super.next();
  private long mLimit = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    while (mP.compareTo(mLimit) < 0) {
      final Z t = mP.multiply2();
      if (t.add(1).isProbablePrime() && t.add(3).isProbablePrime()) {
        ++mCount;
      }
      mP = super.next();
    }
    return Z.valueOf(mCount);
  }
}
