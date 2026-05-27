package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396239 allocated for Edward Bernstein.
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
