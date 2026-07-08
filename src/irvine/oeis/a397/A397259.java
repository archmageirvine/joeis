package irvine.oeis.a397;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a067.A067836;

/**
 * A397259 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A397259 extends A067836 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mBuss = new TreeSet<>();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      final Z b = super.next();
      mBuss.add(b);
      while (mBuss.remove(mP)) {
        mP = mPrime.nextPrime(mP);
      }
      if (b.compareTo(mP) <= 0) {
        return b;
      }
    }
  }
}
