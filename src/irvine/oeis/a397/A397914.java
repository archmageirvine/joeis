package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397914 a(n) is the number of monotonic prime gaps following the n-th prime, where increasing gaps are counted as positive, decreasing gaps as negative, and unchanging gaps as zero.
 * @author Sean A. Irvine
 */
public class A397914 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z q = mPrime.nextPrime(p);
    Z r = mPrime.nextPrime(q);
    final long s = p.add(r).subtract(q.multiply2()).signum();
    long cnt = s;
    do {
      p = q;
      q = r;
      r = mPrime.nextPrime(r);
      cnt += s;
    } while (p.add(r).subtract(q.multiply2()).signum() == s);
    return Z.valueOf(cnt);
  }
}
