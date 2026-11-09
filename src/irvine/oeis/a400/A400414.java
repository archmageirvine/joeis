package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A400414 a(n) is the smallest prime greater than 2*prime(n) if n is odd, and greater than prime(n)/2 otherwise.
 * @author Sean A. Irvine
 */
public class A400414 extends A000040 {

  private boolean mEven = true;

  @Override
  public Z next() {
    final Z p = super.next();
    mEven = !mEven;
    return mEven ? mPrime.nextPrime(p.divide2()) : mPrime.nextPrime(p.multiply2());
  }
}
