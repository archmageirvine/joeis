package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396239 Numerator of r(n) = (prime(n+2) - 2*prime(n+1) + prime(n)) / (prime(n+2) - prime(n)).
 * @author Sean A. Irvine
 */
public class A396239 extends A000040 {

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    final Z r = mPrime.nextPrime(q);
    return select(new Q(r.subtract(q.multiply2()).add(p), r.subtract(p)));
  }
}
